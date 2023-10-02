package domains.peopleSkills;

import domains.person.Person;

import domains.skill.Skill;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
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
    private Person person;

    @Column(nullable = false)
    private Skill skill;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SkillLevel skillLevel;

    @Column(nullable = false)
    private String observation;

    @Column(nullable = false)
    private LocalDate dateSkill;

}
