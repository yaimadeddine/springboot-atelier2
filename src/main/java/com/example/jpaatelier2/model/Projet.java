package com.example.jpaatelier2.model;

import jakarta.persistence.*;

@Entity
@Inheritance
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idProjet;
    @Column(length = 120)
    private String description;

    public long getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(long idProjet) {
        this.idProjet = idProjet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
