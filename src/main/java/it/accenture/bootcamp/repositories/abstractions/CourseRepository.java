package it.accenture.bootcamp.repositories.abstractions;

import it.accenture.bootcamp.models.Course;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Profile("jpa")
public interface CourseRepository extends JpaRepository<Course, Long> {
}
