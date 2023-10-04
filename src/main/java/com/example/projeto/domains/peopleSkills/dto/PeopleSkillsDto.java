package com.example.projeto.domains.peopleSkills.dto;

import com.example.projeto.domains.peopleSkills.SkillLevel;
import com.example.projeto.domains.person.Person;
import com.example.projeto.domains.skill.Skill;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeopleSkillsDto {

    private UUID id;

    private Person person;

    private Skill skill;

    private SkillLevel skillLevel;

    private String observation;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateSkill;
}
