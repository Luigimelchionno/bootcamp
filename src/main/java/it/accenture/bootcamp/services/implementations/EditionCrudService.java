package it.accenture.bootcamp.services.implementations;

import it.accenture.bootcamp.models.Edition;
import it.accenture.bootcamp.models.Edition;
import it.accenture.bootcamp.repositories.abstractions.EditionRepository;
import it.accenture.bootcamp.repositories.abstractions.EditionRepository;


import java.util.Date;
import java.util.List;

public class EditionCrudService extends CrudService<Edition, Long, EditionRepository> {
    private EditionRepository editionRepo;

    public EditionCrudService(EditionRepository repo, EditionRepository editionRepo) {
        super(repo, Edition.class);
        this.editionRepo = editionRepo;
    }

    public List<Edition> findLatestEdition(Date date) {
        return editionRepo.findTop4ByStartdateAfterOrderStartdateAsc(date);
    }
}