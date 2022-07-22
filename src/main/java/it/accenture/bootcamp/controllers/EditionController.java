package it.accenture.bootcamp.controllers;

import it.accenture.bootcamp.mapstruct.EditionMapper;
import it.accenture.bootcamp.models.Edition;
import it.accenture.bootcamp.services.implementations.CourseCrudService;
import it.accenture.bootcamp.services.implementations.EditionCrudService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.accenture.bootcamp.dtos.EditionDTO;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("edition")
public class EditionController {
    private EditionCrudService crudService;
    public EditionController(EditionCrudService crudService){
        this.crudService = crudService;
    }
    @GetMapping
    public Iterable<EditionDTO> getAll() {
        // simulation of getting the edition from a database
        // List<Edition> editions = new ArrayList<>();
        // Course course = new Course(1, "Java", 100);
        // Classroom classroom = new Classroom(1, "Aula magna");
        // Edition edition1 = new Edition(1, LocalDate.now(), LocalDate.now(), course,
        // classroom);
        // Edition edition2 = new Edition(2, LocalDate.now(), LocalDate.now(), course,
        // classroom);
        // editions.add(edition1);
        // editions.add(edition2);
        // return the DTO
        // return editions.stream().map(EditionDTO::fromEdition).toList();
        return null;
    }
    @GetMapping
    public Iterable<EditionDTO> getLatest4Editions(@PathVariable Date date){
        List<Edition> editions =  crudService.findLatestEdition(date);
        var dtos = editions.stream().map(EditionMapper.INSTANCE::fromEdition).toList();
        return ResponseEntity.ok(dtos);
        return ;
    }
}
