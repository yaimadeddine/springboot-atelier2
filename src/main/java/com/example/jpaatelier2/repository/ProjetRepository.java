package com.example.jpaatelier2.repository;

import com.example.jpaatelier2.model.Projet;
import com.example.jpaatelier2.model.ProjetDev;
import com.example.jpaatelier2.model.ProjetRes;
import com.example.jpaatelier2.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjetRepository extends JpaRepository<Projet,Long> {
    Projet findByIdProjet(Long idProjet);

    @Query("select dev from ProjetDev dev")
    List<ProjetDev> getProjetsDev();
    @Query("select res from ProjetRes res")

    List<ProjetRes> getProjetsRes();

    @Query(value = "select t from Tache t where t.projetDev.idProjet=:idProjet")
    List<Tache> getTaches(@Param("idProjet")long idProjet);

    @Query(value = "select p from ProjetDev p where idProjet=:idP")
    ProjetDev getProjetDev(@Param("idP")long id);
}
