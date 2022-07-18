package it.accenture.bootcamp.repositories.abstractions;

import it.accenture.bootcamp.models.Course;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Profile("jpa")
public interface CourseRepository extends JpaRepository<Course, Long> {
    Optional<Course> findByTitle(String title);
    //TODO
    List<Course> findBySectorName(String sectorName); // non abbiamo sector in course FCL
    //List<Course> findBySectorNameAndTitleLike(String sectorName, String like);
    List<Course> findByTitleContainingIgnoreCase(String like);

    Iterable<Course> findByHoursCourseGreaterThanAndPriceLessThan(int d, int c);
}
