package it.accenture.bootcamp.models;

import it.accenture.bootcamp.models.abstraction.WithId;
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
public class Sector implements WithId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "DESCRIPTION")
    private String descriptions;
    @OneToMany(mappedBy = "sector")
    private Set<Tutor> tutors;

    @Override
    public void setId(Long id) {

    }
    @Override
    public Long getId() {
        return this.id;
    }
}
