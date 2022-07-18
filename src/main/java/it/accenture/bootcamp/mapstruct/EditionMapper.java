package it.accenture.bootcamp.mapstruct;

import it.accenture.bootcamp.dtos.CourseDTO;
import it.accenture.bootcamp.dtos.EditionDTO;
import it.accenture.bootcamp.models.Course;
import it.accenture.bootcamp.models.Edition;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EditionMapper {
    EditionMapper INSTANCE = Mappers.getMapper(EditionMapper.class);

    @Mapping(target = "courseId", source = "course.id")
    @Mapping(target = "courseTitle", source = "course.title")
    @Mapping(target = "classroomId", source = "classroom.id")
    @Mapping(target = "classroomName", source = "classroom.name")
    EditionDTO fromEdition (Edition e);

    @Mapping(target = "course.id", source = "courseId")
    @Mapping(target = "course.title", source = "courseTitle")
    @Mapping(target = "classroom.id", source = "classroomId")
    @Mapping(target = "classroom.name", source = "classroomName")
    Edition toEdition (EditionDTO eDTO);
}
