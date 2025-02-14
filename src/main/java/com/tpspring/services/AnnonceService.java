package com.tpspring.services;

import com.tpspring.entities.Annonce;
import com.tpspring.repositories.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnnonceService {

    private final AnnonceRepository annonceRepository;

    @Autowired
    public AnnonceService(AnnonceRepository annonceRepository) {
        this.annonceRepository = annonceRepository;
    }

    public List<Annonce> getAllAnnonces() {
        return this.annonceRepository.findAll();
    }

    public Annonce getAnnonceById(Long id) {
        return annonceRepository.findById(id).orElse(null);
    }

    @Transactional
    public Annonce saveAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    @Transactional
    public void deleteAnnonce(Long id) {
        annonceRepository.deleteById(id);
    }
}