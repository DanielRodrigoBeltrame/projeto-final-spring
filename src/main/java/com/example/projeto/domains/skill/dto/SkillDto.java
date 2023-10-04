package com.example.projeto.domains.skill.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkillDto {

    private UUID id;

    @NotNull
    @NotBlank
    private String description;

    @NotNull
    @NotBlank
    private String observation;

}
