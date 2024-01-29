package com.rajatngc.searchwithease.domain;

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
@Table( name = "workspace")
public class Workspace {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @NotNull( message = "Name is mandatory")
    @NotBlank( message = "Name is mandatory")
    private String name;

    private String description;

    @NotNull( message = "Global field is mandatory")
    @NotBlank( message = "Global field is mandatory")
    private Boolean global;

    @ManyToOne
    @JoinColumn( name = "workspace_created_by_id", nullable = false)
    private PlatformUser workspaceCreatedBy;
}
