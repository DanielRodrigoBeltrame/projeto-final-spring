package Skill;

import com.example.projeto.domains.skill.Skill;
import com.example.projeto.domains.skill.SkillRepository;
import com.example.projeto.domains.skill.SkillServiceImpl;
import com.example.projeto.utils.ErrorMessages;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.Optional;
import java.util.UUID;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class SkillServiceImplTest {

    @InjectMocks
    private SkillServiceImpl skillService;

    @Mock
    private SkillRepository skillRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testFindAll() {
        // Simule o comportamento do repositório
        List<Skill> skills = List.of(new Skill(), new Skill());
        when(skillRepository.findAll()).thenReturn(skills);

        List<Skill> result = skillService.findAll();

        assertEquals(2, result.size());
    }

    @Test
    void testFindById() {
        UUID id = UUID.randomUUID();
        Skill skill = new Skill();
        when(skillRepository.findById(id)).thenReturn(Optional.of(skill));

        Skill result = skillService.findById(id);

        assertEquals(skill, result);
    }

    @Test
    void testFindByIdNotFound() {
        UUID id = UUID.randomUUID();
        when(skillRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> skillService.findById(id));
    }

    @Test
    void testSave() {
        Skill skill = new Skill();
        when(skillRepository.save(skill)).thenReturn(skill);

        Skill result = skillService.save(skill);

        assertEquals(skill, result);
    }

    @Test
    void testUpdate() {
        UUID id = UUID.randomUUID();
        Skill skill = new Skill();
        when(skillRepository.findById(id)).thenReturn(Optional.of(skill));
        when(skillRepository.save(skill)).thenReturn(skill);

        Skill result = skillService.update(id, skill);

        assertEquals(skill, result);
    }

    @Test
    void testUpdateNotFound() {
        UUID id = UUID.randomUUID();
        when(skillRepository.findById(id)).thenReturn(Optional.empty());

        assertThrows(EntityNotFoundException.class, () -> skillService.update(id, new Skill()));
    }

    @Test
    void testDeleteById() {
        UUID id = UUID.randomUUID();
        when(skillRepository.existsById(id)).thenReturn(true);

        assertDoesNotThrow(() -> skillService.deleteById(id));
    }

    @Test
    void testDeleteByIdNotFound() {
        UUID id = UUID.randomUUID();
        when(skillRepository.existsById(id)).thenReturn(false);

        assertThrows(EntityNotFoundException.class, () -> skillService.deleteById(id));
    }

    @Test
    void testExistById() {
        UUID id = UUID.randomUUID();
        when(skillRepository.existsById(id)).thenReturn(true);

        assertTrue(skillService.existById(id));
    }

    @Test
    void testExistByIdNotFound() {
        UUID id = UUID.randomUUID();
        when(skillRepository.existsById(id)).thenReturn(false);

        assertFalse(skillService.existById(id));
    }
}

