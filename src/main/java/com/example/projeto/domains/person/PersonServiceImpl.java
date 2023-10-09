package com.example.projeto.domains.person;

import com.example.projeto.domains.person.dto.PersonDto;
import com.example.projeto.utils.ErrorMessages;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository personRepository;
    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public Person findById(UUID id) {
        return personRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(ErrorMessages.PERSON_NOT_FOUND)
        );
    }

    @Override
    public Person save(Person request) {
        return personRepository.save(request);
    }

    @Override
    public Person update(UUID id, Person request) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException(ErrorMessages.PERSON_NOT_FOUND));

        return personRepository.save(request);
    }

    @Override
    public void deleteById(UUID id) {
        if(!personRepository.existsById(id)){
            throw new EntityNotFoundException(ErrorMessages.PERSON_NOT_FOUND);
        }
        personRepository.deleteById(id);

    }

    public boolean existById(UUID id) {return personRepository.existsById(id);}
}


