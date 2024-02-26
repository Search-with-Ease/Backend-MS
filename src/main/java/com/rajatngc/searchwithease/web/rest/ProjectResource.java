package com.rajatngc.searchwithease.web.rest;

import com.rajatngc.searchwithease.service.ProjectService;
import com.rajatngc.searchwithease.service.dto.ProjectDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/api")
public class ProjectResource {

    private final ProjectService projectService;

    public ProjectResource(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/projects")
    public ProjectDTO saveProject(@RequestBody ProjectDTO projectDTO) {
        return projectService.saveProject( projectDTO);
    }

}
