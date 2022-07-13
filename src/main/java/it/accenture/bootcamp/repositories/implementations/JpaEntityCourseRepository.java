package it.accenture.bootcamp.repositories.implementations;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import it.accenture.bootcamp.models.Course;

@Repository
@Profile("jpa")
public class JpaEntityCourseRepository extends JpaGenericsRepository<Long, Course> {

    public JpaEntityCourseRepository(EntityManager em) {
        super(Course.class, em);
    }
}
