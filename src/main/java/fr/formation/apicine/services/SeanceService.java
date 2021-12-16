package fr.formation.apicine.services;

import fr.formation.apicine.entities.Seance;
import fr.formation.apicine.repositories.SeanceRepository;

import java.util.Date;
import java.util.List;

public class SeanceService {
    private SeanceRepository repository;

    public SeanceService(SeanceRepository repository) {
        this.repository = repository;
    }

    public List<Seance> findAll() {
        return this.repository.findAll();
    }

    public Seance findByDate(Date date) {
        return this.repository.findByDate(date);
    }

    public Seance save(Seance Seance) {
        return this.repository.save(Seance);
    }

    public void delete(Seance Seance) {
        this.repository.delete(Seance);
    }
}
