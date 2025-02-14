package com.tpspring.services;

import com.tpspring.entities.Annonce;
import com.tpspring.repositories.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnnonceService {

    @Autowired
    private AnnonceRepository annonceRepository;
    public List<Annonce> getAllAnnonces() {
        return this.annonceRepository.findAll();
    }

    public Annonce getAnnonceById(Long id) {
        return annonceRepository.findById(id).orElse(null);
    }

    public Annonce saveAnnonce(Annonce annonce) {
        return annonceRepository.save(annonce);
    }

    public void deleteAnnonce(Long id) {
        annonceRepository.deleteById(id);
    }
}