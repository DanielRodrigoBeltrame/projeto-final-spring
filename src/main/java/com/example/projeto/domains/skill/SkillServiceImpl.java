package com.example.projeto.domains.skill;

import com.example.projeto.domains.skill.dto.SkillDto;
import com.example.projeto.utils.ErrorMessages;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;
    @Override
    public List<Skill> findAll() {
        return skillRepository.findAll();
    }

    @Override
    public Skill findById(UUID id) {
        return skillRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(ErrorMessages.SKILL_NOT_FOUND));
    }

    @Override
    public Skill save(Skill request) {
        return skillRepository.save(request);
    }

    @Override
    public Skill update(UUID id, Skill request) {
        Skill skill = skillRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(ErrorMessages.SKILL_NOT_FOUND));
        return skillRepository.save(request);
    }

    @Override
    public void deleteById(UUID id) {
        if(!skillRepository.existsById(id)){
            throw new EntityNotFoundException(ErrorMessages.SKILL_NOT_FOUND);
        }
        skillRepository.deleteById(id);
    }

    public boolean existById(UUID id){
        return skillRepository.existsById(id);
    }
}
