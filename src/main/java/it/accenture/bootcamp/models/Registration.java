package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "REGISTRATION")
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column(name = "REGISTRATION_DATE")
    private LocalDate registrationDate;
    @Column(name = "CANCELLATION_DATE")
    private LocalDate cancellationDate;
    @Column(name = "PAYMENT_DATE")
    private LocalDate paymentDate;
    @Column(name = "EVALUATION_ON_STUDENT")
    private String evaluationOnStudent;
    @Column(name = "EVALUATION_FROM_STUDENT")
    private String evaluationFromStudent;
    @Column(name = "NUMERICAL_EVALUATION_ON_STUDENT")
    private int numericalEvaluationOnStudent;
    @Column(name = "NUMERICAL_EVALUATION_FROM_STUDENT")
    private int numericalEvaluationFromStudent;
    @ManyToOne
    @JoinColumn(name="COURSE_EDITION_ID", nullable=false)
    private Edition edition;
    @ManyToOne
    @JoinColumn(name="STUDENT_ID", nullable=false)
    private Student student;
}
