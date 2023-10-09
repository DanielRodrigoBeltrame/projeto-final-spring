package com.example.projeto.domains.skill;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/skill")
@RequiredArgsConstructor
public class SkillController {

    private final SkillService skillService;

    @GetMapping
    public ResponseEntity<List<Skill>> findAll(){
        return ResponseEntity.ok(skillService.findAll());
    }

    @PostMapping
    public ResponseEntity<Skill> save(@RequestBody Skill skill){
        return ResponseEntity.ok(skillService.save(skill));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Skill> update(@PathVariable UUID id, @RequestBody Skill skill){
        return ResponseEntity.ok(skillService.update(id, skill));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        skillService.deleteById(id);
    }
}
