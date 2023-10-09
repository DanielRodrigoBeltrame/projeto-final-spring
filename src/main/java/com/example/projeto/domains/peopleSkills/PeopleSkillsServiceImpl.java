package com.example.projeto.domains.peopleSkills;

import com.example.projeto.domains.peopleSkills.dto.PeopleSkillsDto;
import com.example.projeto.domains.skill.Skill;
import com.example.projeto.utils.ErrorMessages;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PeopleSkillsServiceImpl implements PeopleSkillsService {

    private final PeopleSkillsRepository peopleSkillsRepository;
    @Override
    public List<PeopleSkills> findAll() {
        return peopleSkillsRepository.findAll();
    }

    @Override
    public PeopleSkills findById(UUID id) {
        return peopleSkillsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(ErrorMessages.PEOPLESKILLS_NOT_FOUND));
    }

    @Override
    public PeopleSkills save(PeopleSkills request) {
        return peopleSkillsRepository.save(request);
    }

    @Override
    public PeopleSkills update(UUID id, PeopleSkills request) {
        PeopleSkills peopleSkills = peopleSkillsRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(ErrorMessages.PEOPLESKILLS_NOT_FOUND));
        return peopleSkillsRepository.save(request);
    }

    @Override
    public void deleteById(UUID id) {

    }
}
