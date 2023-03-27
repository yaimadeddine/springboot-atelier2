package com.example.jpaatelier2.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTache;
    private Date duree;
    @ManyToOne
    private ProjetDev projetDev;

    public long getIdTache() {
        return idTache;
    }

    public void setIdTache(long idTache) {
        this.idTache = idTache;
    }

    public Date getDuree() {
        return duree;
    }

    public void setDuree(Date duree) {
        this.duree = duree;
    }

    public ProjetDev getProjetDev() {
        return projetDev;
    }

    public void setProjetDev(ProjetDev projetDev) {
        this.projetDev = projetDev;
    }
}
