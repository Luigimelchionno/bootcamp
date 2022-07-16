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
@Table(name = "TEACHER_COMPETENCE")
public class TeacherCompetence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "SKILL_LEVEL", nullable = false)
    private String skillLevel;

    @ManyToOne
    @JoinColumn(name = "TEACHER_ID")
    private Teacher teacher;
    @ManyToOne
    @JoinColumn(name = "SKILL_ID")
    private Teacher skill;

}