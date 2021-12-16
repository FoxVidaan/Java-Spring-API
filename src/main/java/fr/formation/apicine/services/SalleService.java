package fr.formation.apicine.services;

import fr.formation.apicine.entities.Salle;
import fr.formation.apicine.repositories.SalleRepository;

import java.util.List;

public class SalleService {
    private SalleRepository repository;

    public SalleService(SalleRepository repository) {
        this.repository = repository;
    }

    public List<Salle> findAll() {
        return this.repository.findAll();
    }

    public Salle findByNumero(int numero) {
        return this.repository.findByNumero(numero);
    }

    public Salle save(Salle Salle) {
        return this.repository.save(Salle);
    }

    public void delete(Salle Salle) {
        this.repository.delete(Salle);
    }
}
