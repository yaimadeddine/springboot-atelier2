package com.example.jpaatelier2.controller;

import com.example.jpaatelier2.model.Tache;
import com.example.jpaatelier2.service.facade.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tache")
public class TacheController {
    @PostMapping
    public int save(@RequestBody Tache tache) {
        return tacheService.save(tache);
    }
    @GetMapping
    public List<Tache> lesTaches() {
        return tacheService.lesTaches();
    }

    @Autowired
    TacheService tacheService;

}
