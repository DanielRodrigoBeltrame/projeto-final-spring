package com.example.projeto.domains.peopleSkills;

import com.example.projeto.domains.person.Person;

import com.example.projeto.domains.skill.Skill;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "PeopleSkills")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PeopleSkills {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;

    @Column(nullable = false)
    private String observation;

    @Column(nullable = false)
    private LocalDate dateSkill;

    @ManyToOne
    private Person person;

    @OneToMany(mappedBy = "peopleSkills")
    private Set<Skill> skills = new LinkedHashSet<>();

}
