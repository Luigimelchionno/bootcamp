package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MODULE")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "TITLE", nullable = false)
    private String title;
    @Column(name = "HOURS", nullable = false)
    private int hours;
    @Column(name = "DESCRIPTION", nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name="EDITION_ID", referencedColumnName = "ID", nullable=false)
    private Edition edition;

    @OneToMany(mappedBy = "module")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<TeachingAssignment> teachingAssignments;

    @OneToMany(mappedBy = "module")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<StudentEvaluation> studentEvaluations;

    @OneToMany(mappedBy = "module")
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Lesson> lessons;
}
