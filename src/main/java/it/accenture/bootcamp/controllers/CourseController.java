import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
import java.util.stream.StreamSupport;

import it.accenture.bootcamp.mapstruct.CourseMapper;
import it.accenture.bootcamp.services.implementations.CourseCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import it.accenture.bootcamp.dtos.CourseDTO;
import it.accenture.bootcamp.exceptions.EntityNotFoundException;
import it.accenture.bootcamp.models.Course;
import it.accenture.bootcamp.services.abstractions.EducationService;

@RestController
@RequestMapping("course")
public class CourseController {
    private EducationService eduService;
    private CourseCrudService crudService;

    @Autowired
    public CourseController(EducationService eduService, CourseCrudService crudService) {
        this.eduService = eduService;
        this.crudService = crudService;
    }

    @GetMapping
    public ResponseEntity<Iterable<CourseDTO>> getAll() {
        var cls = crudService.getAll();
        var dtos = StreamSupport.stream(cls.spliterator(), false).map(CourseMapper.INSTANCE::fromCourse).toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CourseDTO> findById(@PathVariable long id) {
        Optional<Course> optClass = crudService.findById(id);
        if (optClass.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optClass.map(CourseMapper.INSTANCE::fromCourse).get());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deleteById(@PathVariable long id) {
        try {
            crudService.deleteById(id);
            return ResponseEntity.noContent().build();
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CourseDTO cdto) {
        Course c = CourseMapper.INSTANCE.toCourse(cdto);
        try {
            Course cSaved = crudService.saveOrUpdate(c);
            var dto = CourseMapper.INSTANCE.fromCourse(cSaved);
            URI uri = new URI("localhost:8080/course/" + cdto.getId());
            return ResponseEntity.created(uri).body(dto);
        } catch (URISyntaxException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> update(@RequestBody CourseDTO cdto, @PathVariable long id) {
        Course c = CourseMapper.INSTANCE.toCourse(cdto);
        try {
            Course cSaved = crudService.saveOrUpdate(c);
            CourseDTO dto = CourseMapper.INSTANCE.fromCourse(cSaved);
            return ResponseEntity.ok(dto);

        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}