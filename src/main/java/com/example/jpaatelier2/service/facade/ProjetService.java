package com.example.jpaatelier2.service.facade;

import com.example.jpaatelier2.model.Projet;
import com.example.jpaatelier2.model.ProjetDev;
import com.example.jpaatelier2.model.ProjetRes;
import com.example.jpaatelier2.model.Tache;

import java.util.List;

public interface ProjetService {
    public List<Projet> lesProjets();
    void supprimer(long idProjet);
    void modifier(Projet projet);
    Projet getProjet(long idProjet);

    void ajouterTache(long idProjet, Tache tache);

    List<Tache> getTaches(long idProjet);
    List<ProjetDev> lesProjetsDev();
    ProjetDev getProjetDev(long idProjet);
    public List<ProjetDev> getProjetsDev();
    public List<ProjetRes> getProjetsRes();
    public Projet ajouterProjet(Projet p);
    public ProjetDev ajouterProjetDev(ProjetDev p);
    public ProjetRes ajouterProjetRes(ProjetRes p);
}
