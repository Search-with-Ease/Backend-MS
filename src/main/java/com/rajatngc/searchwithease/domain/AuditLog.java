package com.rajatngc.searchwithease.domain;

import com.rajatngc.searchwithease.domain.enumeration.LogActionType;
import com.rajatngc.searchwithease.domain.enumeration.LogUserType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "audit_log")
public class AuditLog {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    @NotNull( message = "User type is mandatory")
    @NotBlank( message = "User type is mandatory")
    @Enumerated(EnumType.STRING)
    private LogUserType userType;

    private Long userId;

    private String associateType;

    private Long associateId;

    @NotNull( message = "Action is mandatory")
    @NotBlank( message = "Action is mandatory")
    @Enumerated(EnumType.STRING)
    private LogActionType actionType;

    @NotNull( message = "Date time of log is mandatory")
    @NotBlank( message = "Date time of log is mandatory")
    private LocalDateTime loggedOn;

}
