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
@Table(name = "student_evaluation")
public class StudentEvaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "GRADE")
    private double grade;
    @Column(name = "COMMENTS")
    private String comments;
    @ManyToOne
    @JoinColumn(name = "MODULE_ID")
    private Module module;
    @ManyToOne
    @JoinColumn(name = "STUDENT_ID")
    private Student student;



}