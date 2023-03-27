package com.example.jpaatelier2.service.impl;

import com.example.jpaatelier2.model.Developpeur;
import com.example.jpaatelier2.model.Tache;
import com.example.jpaatelier2.repository.DevRepository;
import com.example.jpaatelier2.repository.TacheRepository;
import com.example.jpaatelier2.service.facade.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DevServiceImpl implements DevService {
    @Autowired
    DevRepository devRepository;
    @Autowired
    TacheRepository tacheRepository;
    @Override
    public void ajouter(Developpeur developpeur) {
        devRepository.save(developpeur);
    }

    @Override
    public List<Developpeur> getDevs() {
        return devRepository.findAll();
    }

    @Override
    public void supprimer(long idDev) {
        devRepository.deleteById(idDev);
    }

    @Override
    public void modifier(Developpeur developpeur) {
//        Developpeur d = devRepository.getById(developpeur.getIdDevelopeur());
//        if (d!=null)
//            devRepository.save(d);
        Optional<Developpeur> r = devRepository.findById(developpeur.getIdDevelopeur());
        Developpeur d = r.get();
        d.setNom(developpeur.getNom());
        d.setEmail(developpeur.getEmail());
        devRepository.save(d);
    }

    @Override
    public Developpeur getDeveloppeur(long idDev) {
        return devRepository.findByIdDeveloppeur(idDev);
    }

    @Override
    public Developpeur getDeveloppeur(String email) {
        return devRepository.findByEmail(email);
    }

    @Override
    public List<Developpeur> getDevs(long idProjet) {
        return devRepository.getDevs(idProjet);
    }

    @Override
    public void affecterTache(long idDev, long idTache) {
        Developpeur dev = devRepository.getById(idDev);
        Tache tache = tacheRepository.getById(idTache);
        if (dev != null && tache != null) {
            dev.getTaches().add(tache);
            devRepository.save(dev);
        }
    }
}
