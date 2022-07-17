package it.accenture.bootcamp.dtos;

import it.accenture.bootcamp.models.Classroom;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomDTO {
    private long id;
    private String name;
    private Integer capacity;
    private String software;
    private Boolean hasProjector;
    private Boolean hasMainPc;
    private Boolean isComputerized;
    private boolean isVirtual;

}
