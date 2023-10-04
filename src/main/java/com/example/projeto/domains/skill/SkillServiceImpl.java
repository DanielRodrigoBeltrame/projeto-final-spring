package com.example.projeto.domains.skill;

import com.example.projeto.domains.skill.dto.SkillDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {
    @Override
    public List<SkillDto> findAll() {
        return null;
    }

    @Override
    public SkillDto findById(UUID id) {
        return null;
    }

    @Override
    public SkillDto save(SkillDto request) {
        return null;
    }

    @Override
    public SkillDto update(UUID id, SkillDto request) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
