package com.example.projeto.domains.skill;

import com.example.projeto.domains.peopleSkills.PeopleSkills;
import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Entity
@Table(name = "Skill")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String observation;

    @ManyToOne
    @JoinColumn(name = "people_skills_id")
    private PeopleSkills peopleSkills;

}
