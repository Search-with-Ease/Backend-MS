package com.rajatngc.searchwithease.service;

import com.rajatngc.searchwithease.domain.Project;
import com.rajatngc.searchwithease.repository.ProjectRepository;
import com.rajatngc.searchwithease.service.dto.ProjectDTO;
import com.rajatngc.searchwithease.service.mapper.ProjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, ProjectMapper projectMapper) {
        this.projectRepository = projectRepository;
        this.projectMapper = projectMapper;
    }

    @Override
    public ProjectDTO saveProject(ProjectDTO projectDTO) {
        log.debug( "Project to save => "+projectDTO+" "+projectDTO.getName());
        Project project = projectMapper.projectDTOToProject( projectDTO);
        log.debug( "Project to save => "+project+" "+project.getName());

        return projectMapper.projectToProjectDTO( projectRepository.save( project));
    }
}
