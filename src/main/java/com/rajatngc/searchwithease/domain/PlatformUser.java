package com.rajatngc.searchwithease.domain;

import com.rajatngc.searchwithease.util.constants.RegexConstants;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity( name = "platform_user")
public class PlatformUser {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank( message = "First name is mandatory")
    @NotNull( message = "First name is mandatory")
    @Pattern( regexp = RegexConstants.FIRST_NAME_REGEX, message = "Please provide a valid first name")
    private String firstName;

    private String lastName;

    @NotBlank( message = "Email is mandatory")
    @NotNull( message = "Email is mandatory")
    @Email( message = "Please provide a valid email address")
    private String email;

    private Boolean emailVerified;

    @Pattern( regexp = RegexConstants.PHONE_NUMBER_REGEX, message = "Please provide a valid phone number")
    private String phoneNumber;

    private Boolean phoneVerified;

    @OneToMany( mappedBy = "workspaceCreatedBy")
    private Set<Workspace> workspaces;
}
