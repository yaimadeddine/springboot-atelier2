package com.example.jpaatelier2.service.impl;

import com.example.jpaatelier2.model.Projet;
import com.example.jpaatelier2.model.ProjetDev;
import com.example.jpaatelier2.model.ProjetRes;
import com.example.jpaatelier2.model.Tache;
import com.example.jpaatelier2.repository.ProjetRepository;
import com.example.jpaatelier2.repository.TacheRepository;
import com.example.jpaatelier2.service.facade.ProjetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements ProjetService {
    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    TacheRepository tacheRepository;

    @Override
    public List<Projet> lesProjets() {
        return projetRepository.findAll();
    }

    @Override
    public void supprimer(long idProjet) {
        projetRepository.deleteById(idProjet);
    }

    @Override
    public void modifier(Projet projet) {
        Projet p = getProjet(projet.getIdProjet());
        if (p != null) {
            p.setDescription(projet.getDescription());
            projetRepository.save(p);
        }


    }

    @Override
    public Projet getProjet(long idProjet) {
        return projetRepository.findByIdProjet(idProjet);
    }

    @Override
    public void ajouterTache(long idProjet, Tache tache) {
        ProjetDev p = getProjetDev(idProjet);
        if (p!=null){
            tache.setProjetDev(p);
            tacheRepository.save(tache);
        }
    }

    @Override
    public List<Tache> getTaches(long idProjet) {
        return projetRepository.getTaches(idProjet);
    }

    @Override
    public List<ProjetDev> lesProjetsDev() {
        return projetRepository.getProjetsDev();
    }

    @Override
    public ProjetDev getProjetDev(long idProjet) {
        return projetRepository.getProjetDev(idProjet);
    }

    @Override
    public List<ProjetDev> getProjetsDev() {
        return projetRepository.getProjetsDev();
    }

    @Override
    public List<ProjetRes> getProjetsRes() {
        return projetRepository.getProjetsRes();
    }

    @Override
    public Projet ajouterProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public ProjetDev ajouterProjetDev(ProjetDev p) {
        return projetRepository.save(p);
    }

    @Override
    public ProjetRes ajouterProjetRes(ProjetRes p) {
        return projetRepository.save(p);
    }
}
