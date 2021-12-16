package fr.formation.apicine.services;

import fr.formation.apicine.entities.Film;
import fr.formation.apicine.repositories.FilmRepository;

import java.util.List;

public class FilmService {
    private FilmRepository repository;

    public FilmService(FilmRepository repository) {
        this.repository = repository;
    }

    public List<Film> findAll() {
        return this.repository.findAll();
    }

    public Film findByNom(String nom) {
        return this.repository.findByNom(nom);
    }

    public Film save(Film Film) {
        return this.repository.save(Film);
    }

    public void delete(Film Film) {
        this.repository.delete(Film);
    }
}
