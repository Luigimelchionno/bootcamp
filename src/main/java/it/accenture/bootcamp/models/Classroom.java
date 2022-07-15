package it.accenture.bootcamp.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "CAPACITY")
    private Integer capacity;
    @Column(name = "CONNECTION_SOFTWARE")
    private String connectionSoftware;
    @Column(name = "HAS_PROJECTOR")
    private Boolean hasProjector;
    @Column(name = "HAS_MAIN_COMPUTER")
    private Boolean hasMainComputer;
    @Column(name = "IS_COMPUTERIZED")
    private Boolean isComputerized;
    @Column(name = "IS_VIRTUAL")
    private boolean isVirtual;
    @OneToMany(mappedBy="classroom")
    private Set<Edition> editions;
    @OneToMany(mappedBy="classroom")
    private Set<Lesson> lessons;
}
