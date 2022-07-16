package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teacher_evaluation")
public class TeacherEvaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "GRADE", nullable = false)
    private Long grade;
    @Column(name = "COMMENTS", nullable = false)
    private String comments;

    @ManyToOne
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;


    @ManyToOne
    @JoinColumn(name = "TEACHING_ASSIGNMENT_ID")
    private TeachingAssignment teachingAssignment;

}