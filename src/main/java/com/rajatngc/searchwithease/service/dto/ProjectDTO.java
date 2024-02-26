package com.rajatngc.searchwithease.service.dto;


import com.rajatngc.searchwithease.domain.enumeration.BuildingTool;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProjectDTO {
    private Long id;
    private String name;
    private String description;
    private String groupId;
    private String artifactId;
    private String packageId;
    private BuildingTool buildingTool;
    private Long workspaceId;
}
