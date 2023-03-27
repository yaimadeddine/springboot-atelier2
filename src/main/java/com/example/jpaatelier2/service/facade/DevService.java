package com.example.jpaatelier2.service.facade;

import com.example.jpaatelier2.model.Developpeur;

import java.util.List;

public interface DevService {
    void ajouter(Developpeur developpeur);
    List<Developpeur> getDevs();
    void supprimer(long idDev);
    void modifier(Developpeur developpeur);
    Developpeur getDeveloppeur(long idDev);
    Developpeur getDeveloppeur(String email);

    List<Developpeur> getDevs(long idProjet);
    void affecterTache(long idDev,long idTache);
}
