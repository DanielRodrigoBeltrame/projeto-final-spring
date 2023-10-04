package com.example.projeto.domains.person;

import com.example.projeto.domains.person.dto.PersonDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    @Override
    public List<PersonDto> findAll() {
        return null;
    }

    @Override
    public PersonDto findById(UUID id) {
        return null;
    }

    @Override
    public PersonDto save(PersonDto request) {
        return null;
    }

    @Override
    public PersonDto update(UUID id, PersonDto request) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
