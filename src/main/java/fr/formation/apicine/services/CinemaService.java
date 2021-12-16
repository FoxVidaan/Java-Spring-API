package fr.formation.apicine.services;

import fr.formation.apicine.entities.Cinema;
import fr.formation.apicine.repositories.CinemaRepository;

import java.util.List;

public class CinemaService {
    private CinemaRepository repository;

    public CinemaService(CinemaRepository repository) {
        this.repository = repository;
    }

    public List<Cinema> findAll() {
        return this.repository.findAll();
    }

    public Cinema findByNom(String nom) {
        return this.repository.findByNom(nom);
    }

    public Cinema save(Cinema cinema) {
        return this.repository.save(cinema);
    }

    public void delete(Cinema cinema) {
        this.repository.delete(cinema);
    }
}
