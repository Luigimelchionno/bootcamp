package it.accenture.bootcamp.controllers;

import it.accenture.bootcamp.dtos.CourseDTO;
import it.accenture.bootcamp.models.Sector;
import it.accenture.bootcamp.services.abstractions.EducationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("sector")
public class SectorController {

    private EducationService eduService;

    @Autowired
    public SectorController(EducationService eduService) {
        this.eduService = eduService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Sector>> getAll(){
        return ResponseEntity.ok(eduService.getAllSectors());
    }
}
