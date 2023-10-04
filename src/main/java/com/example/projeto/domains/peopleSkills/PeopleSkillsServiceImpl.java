package com.example.projeto.domains.peopleSkills;

import com.example.projeto.domains.peopleSkills.dto.PeopleSkillsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PeopleSkillsServiceImpl implements PeopleSkillsService {
    @Override
    public List<PeopleSkillsDto> findAll() {
        return null;
    }

    @Override
    public PeopleSkillsDto findById(UUID id) {
        return null;
    }

    @Override
    public PeopleSkillsDto save(PeopleSkillsDto request) {
        return null;
    }

    @Override
    public PeopleSkillsDto update(UUID id, PeopleSkillsDto request) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
