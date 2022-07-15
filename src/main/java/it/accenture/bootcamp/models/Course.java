package it.accenture.bootcamp.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "HOURS_COURSE")
    private Integer hoursCourse;
    @Column(name = "COURSE_LEVEL")
    private String courseLevel;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PRICE")
    private double price;
    @OneToMany(mappedBy="course")
    private Set<Edition> editions;
}
