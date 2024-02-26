package com.rajatngc.searchwithease.service.mapper;

import com.rajatngc.searchwithease.domain.Project;
import com.rajatngc.searchwithease.service.dto.ProjectDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface ProjectMapper {

    ProjectDTO projectToProjectDTO(Project project);

    Project projectDTOToProject(ProjectDTO projectDTO);

}
