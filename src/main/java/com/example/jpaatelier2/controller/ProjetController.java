package com.example.jpaatelier2.controller;

import com.example.jpaatelier2.model.Projet;
import com.example.jpaatelier2.model.ProjetDev;
import com.example.jpaatelier2.model.ProjetRes;
import com.example.jpaatelier2.model.Tache;
import com.example.jpaatelier2.service.facade.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjetController {
    @GetMapping
    public List<Projet> lesProjets() {
        return projetService.lesProjets();
    }
    @GetMapping("/dev")
    public List<ProjetDev> getProjetsDev() {
        return projetService.getProjetsDev();
    }
    @GetMapping("/res")
    public List<ProjetRes> getProjetsRes() {
        return projetService.getProjetsRes();
    }
    @PostMapping
    public Projet ajouterProjet(@RequestBody Projet p) {
        return projetService.ajouterProjet(p);
    }
    @PostMapping("/dev")
    public ProjetDev ajouterProjetDev(@RequestBody ProjetDev p) {
        return projetService.ajouterProjetDev(p);
    }
    @PostMapping("/res")
    public ProjetRes ajouterProjetRes(@RequestBody ProjetRes p) {
        return projetService.ajouterProjetRes(p);
    }

    public void supprimer(long idProjet) {
        projetService.supprimer(idProjet);
    }

    public void modifier(Projet projet) {
        projetService.modifier(projet);
    }

    public Projet getProjet(long idProjet) {
        return projetService.getProjet(idProjet);
    }
    @PostMapping("/{idProjet}")
    public void ajouterTache(@PathVariable long idProjet,@RequestBody Tache tache) {
        projetService.ajouterTache(idProjet, tache);
    }
    @GetMapping("/{idProjet}/tache")
    public List<Tache> getTaches(long idProjet) {
        return projetService.getTaches(idProjet);
    }

    public List<ProjetDev> lesProjetsDev() {
        return projetService.lesProjetsDev();
    }

    public ProjetDev getProjetDev(long idProjet) {
        return projetService.getProjetDev(idProjet);
    }

    @Autowired
    private ProjetService projetService;
}
