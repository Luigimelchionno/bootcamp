package it.accenture.bootcamp.dtos;

import it.accenture.bootcamp.models.Course;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    private long id;
    private String title;
    private Integer hoursCourse;
    private String courseLevel;
    private String description;
    private double price;

}
