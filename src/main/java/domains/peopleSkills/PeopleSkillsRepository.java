package domains.peopleSkills;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PeopleSkillsRepository extends JpaRepository<PeopleSkills, UUID> {
}
