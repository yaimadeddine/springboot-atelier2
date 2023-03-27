package com.example.jpaatelier2.service.facade;

import com.example.jpaatelier2.model.Tache;

import java.util.List;

public interface TacheService {
    int save(Tache tache);
    List<Tache> lesTaches();
}
