package com.example.jpaatelier2.repository;

import com.example.jpaatelier2.model.Developpeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DevRepository extends JpaRepository<Developpeur,Long> {
    Developpeur findByIdDeveloppeur(long idDev);
    Developpeur findByEmail(String email);
    Developpeur findByNom(String nom);

    @Query(value = "select d from Developpeur d join d.taches t where t.projetDev.idProjet=:idP")
    List<Developpeur> getDevs(@Param("idP")long idProjet);


}
