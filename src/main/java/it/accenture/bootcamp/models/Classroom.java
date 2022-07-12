package it.accenture.bootcamp.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Classroom {
    private long id;
    private String name;
    private Integer capacity;
    private String software;
    private Boolean hasProjector;
    private Boolean hasMainPc;
    private Boolean isComputerized;
    private boolean isVirtual;
}
