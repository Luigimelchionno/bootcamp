package it.accenture.bootcamp.repositories.implementations;
import javax.persistence.EntityManager;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import it.accenture.bootcamp.models.Edition;

import java.util.List;


public class JpaEntityEditionRepository extends JpaGenericsRepository<Long, Edition> {

    public JpaEntityEditionRepository(EntityManager em) {
        super(Edition.class, em);
    }

}

