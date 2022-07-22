package it.accenture.bootcamp.services.implementations;
import it.accenture.bootcamp.models.Course;
import it.accenture.bootcamp.models.Edition;
import it.accenture.bootcamp.repositories.abstractions.CourseRepository;
import it.accenture.bootcamp.repositories.abstractions.EditionRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseCrudService extends CrudService<Course, Long, CourseRepository> {
    private EditionRepository editionRepo;
    public CourseCrudService(CourseRepository repo, EditionRepository editionRepo) {
        super(repo, Course.class);
        this.editionRepo = editionRepo;
    }
    public Iterable<Course> findBySectorName(String sectorName) {
        return repo.findAll();
    }
    public Iterable<Course> findByHoursCourseGreaterThanAndPriceLessThan(int d, int c){
        return repo.findByHoursCourseGreaterThanAndPriceLessThan(d,c);
    }

    public Iterable<Course> findByTitleContaining(String like) {
        return repo.findByTitleContainingIgnoreCase(like);
    }

    public List<Edition> findEditionsByCourse(long id) {
        return editionRepo.findByCourseId(id);
    }
   /* public List<Course> findCourseWithoutEdition(){


    }*/
}
