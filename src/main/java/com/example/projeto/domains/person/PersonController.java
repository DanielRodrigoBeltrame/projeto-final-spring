package com.example.projeto.domains.person;

import com.example.projeto.domains.skill.Skill;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> finAll() {
        return ResponseEntity.ok(personService.findAll());
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person){
        return ResponseEntity.ok(personService.save(person));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@PathVariable UUID id, @RequestBody Person person){
        return ResponseEntity.ok(personService.update(id, person));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        personService.deleteById(id);
    }
}
