package com.example.projeto.domains.peopleSkills;

import com.example.projeto.domains.skill.Skill;
import com.example.projeto.domains.skill.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/people-skill")
@RequiredArgsConstructor
public class PeopleSkillsController {

    private final PeopleSkillsService peopleSkillsService;

    @GetMapping
    public ResponseEntity<List<PeopleSkills>> findAll(){
        return ResponseEntity.ok(peopleSkillsService.findAll());
    }

    @PostMapping
    public ResponseEntity<PeopleSkills> save(@RequestBody PeopleSkills peopleSkills){
        return ResponseEntity.ok(peopleSkillsService.save(peopleSkills));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PeopleSkills> update(@PathVariable UUID id, @RequestBody PeopleSkills peopleSkills){
        return ResponseEntity.ok(peopleSkillsService.update(id, peopleSkills));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        peopleSkillsService.deleteById(id);
    }

}
