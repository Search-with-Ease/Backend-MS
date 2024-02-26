package com.rajatngc.searchwithease.domain;

import com.rajatngc.searchwithease.domain.enumeration.BuildingTool;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table( name = "project")
public class Project {

    @Id
    @SequenceGenerator(name = "seq_project", sequenceName = "seq_project_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_project")
    private Long id;

    @NotNull( message = "Name is mandatory")
    private String name;

    private String description;

    @NotNull( message = "Group id is mandatory")
    private String groupId;

    @NotNull( message = "Artifact Id is mandatory")
    private String artifactId;

    @NotNull( message = "Package Id is mandatory")
    private String packageId;

    @NotNull( message = "Global field is mandatory")
    private BuildingTool buildingTool;

    @ManyToOne
    @JoinColumn(name = "project_workspace_id", nullable = false)
    private Workspace workspace;
}
