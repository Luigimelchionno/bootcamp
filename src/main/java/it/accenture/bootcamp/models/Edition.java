package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "COURSE_EDITION")
public class Edition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "START_DATE")
    private LocalDate startDate;
    @Column(name = "END_DATE")
    private LocalDate endDate;
    @Column(name = "COURSE_TYPE")
    private String courseType;
    @Column(name = "CODE")
    private String code;
    @Column(name = "PRICE")
    private double price;
    @ManyToOne
    @JoinColumn(name="COURSE_ID", nullable=false)
    private Course course;
    @ManyToOne
    @JoinColumn(name="CLASSROOM_ID", nullable=false)
    private Classroom classroom;

    @ManyToOne
    @JoinColumn(name="TUTOR_ID", referencedColumnName = "ID", nullable=false)
    private Tutor tutor;
    @OneToMany(mappedBy="edition")
    private Set<Registration> registrations;
    @OneToMany(mappedBy = "edition", fetch = FetchType.EAGER)
    private Set<Module> modules;
}
