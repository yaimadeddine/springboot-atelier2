package com.example.jpaatelier2.service.impl;

import com.example.jpaatelier2.model.Tache;
import com.example.jpaatelier2.repository.TacheRepository;
import com.example.jpaatelier2.service.facade.TacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TacheServiceImpl implements TacheService {
    @Autowired
    TacheRepository tacheRepository;
    @Override
    public int save(Tache tache) {
        tacheRepository.save(tache);
        return 1;
    }

    @Override
    public List<Tache> lesTaches() {
        return tacheRepository.findAll();
    }
}
