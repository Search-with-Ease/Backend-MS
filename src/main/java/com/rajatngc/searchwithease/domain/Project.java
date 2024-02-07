package com.rajatngc.searchwithease.domain;

import com.rajatngc.searchwithease.domain.enumeration.BuildingTool;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "project")
public class Project {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @NotNull( message = "Name is mandatory")
    @NotBlank( message = "Name is mandatory")
    private String name;

    private String description;

    @NotNull( message = "Group id is mandatory")
    @NotBlank( message = "Group id is mandatory")
    private String groupId;

    @NotNull( message = "Artifact Id is mandatory")
    @NotBlank( message = "Artifact Id is mandatory")
    private String artifactId;

    @NotNull( message = "Package Id is mandatory")
    @NotBlank( message = "Package Id is mandatory")
    private String packageId;

    @NotNull( message = "Global field is mandatory")
    @NotBlank( message = "Global field is mandatory")
    private BuildingTool buildingTool;

    @ManyToOne
    @JoinColumn(name = "project_workspace_id", nullable = false)
    private Workspace workspace;
}
