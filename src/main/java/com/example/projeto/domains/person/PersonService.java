package com.example.projeto.domains.person;

import com.example.projeto.domains.person.dto.PersonDto;
import com.example.projeto.interfaces.Crud;

import java.util.UUID;

public interface PersonService extends Crud<PersonDto, UUID> {
}
