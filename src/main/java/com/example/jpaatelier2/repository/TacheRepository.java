package com.example.jpaatelier2.repository;

import com.example.jpaatelier2.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TacheRepository extends JpaRepository<Tache,Long> {
    Tache findByIdTache(long idTache);
}
