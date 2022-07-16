package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
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
    @OneToMany(mappedBy="student")
    private Set<Registration> registrations;
    @OneToMany(mappedBy="student")
    private Set<Presence> presences;
    @OneToMany(mappedBy = "student")
    private Set<StudentEvaluation> studentEvaluations;
    @OneToMany(mappedBy="student")
    private Set<StudentCompetence> studentCompetences;
}
