package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "TEACHER")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "SEX")
    private char sex;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMPLOYMENT_TYPE")
    private String employmentType;

    @OneToMany(mappedBy = "teacher")
    private List<TeachingAssignment> teachingAssignments;
    @OneToMany(mappedBy = "teacher")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<TeacherCompetence> teacherCompetences;
    @OneToMany(mappedBy = "teacher")
    private List<TeacherEvaluation> teacherEvaluations;
    @OneToMany(mappedBy = "teacher")
    private List<Lesson> lessons;

}