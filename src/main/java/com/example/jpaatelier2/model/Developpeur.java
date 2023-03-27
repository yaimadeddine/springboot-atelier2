package com.example.jpaatelier2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Developpeur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDeveloppeur;
    @Column(nullable = false)
    private String nom;
    @Column(unique = true)
    private String email;
    @ManyToMany
    @JoinTable(name = "taches_dev",joinColumns = @JoinColumn(name = "dev_id"),inverseJoinColumns = @JoinColumn(name = "tache_id"))
    private List<Tache> taches;

    public long getIdDevelopeur() {
        return idDeveloppeur;
    }

    public void setIdDevelopeur(long idDevelopeur) {
        this.idDeveloppeur = idDevelopeur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }
}
