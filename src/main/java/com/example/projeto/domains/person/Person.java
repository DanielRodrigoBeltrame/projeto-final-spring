package com.example.projeto.domains.person;

import com.example.projeto.domains.peopleSkills.PeopleSkills;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Person")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate birthDate;

    @Column(nullable = false)
    private String identificationDocument;

    @Column(nullable = true)
    private String email;

    @ManyToOne
    private PeopleSkills peopleSkills;
}
