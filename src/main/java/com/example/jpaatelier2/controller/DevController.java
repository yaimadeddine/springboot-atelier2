package com.example.jpaatelier2.controller;

import com.example.jpaatelier2.model.Developpeur;
import com.example.jpaatelier2.service.facade.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devs")
public class DevController {
    @PostMapping
    public void ajouter(@RequestBody Developpeur developpeur) {
        devService.ajouter(developpeur);
    }
    @GetMapping
    public List<Developpeur> getDevs() {
        return devService.getDevs();
    }

    @GetMapping("/{id}")
    public Developpeur getDeveloppeur(long idDev) {
        return devService.getDeveloppeur(idDev);
    }

    @GetMapping("/projet/{idProjet}")
    public List<Developpeur> getDevs(@PathVariable long idProjet) {
        return devService.getDevs(idProjet);
    }

    @PostMapping("/{idDev}/{idTache}")
    public void affecterTache(@PathVariable long idDev,@PathVariable long idTache) {
        devService.affecterTache(idDev, idTache);
    }

    @Autowired
    private DevService devService;
}
