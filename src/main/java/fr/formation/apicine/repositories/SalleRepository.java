package fr.formation.apicine.repositories;

import fr.formation.apicine.entities.Film;
import fr.formation.apicine.entities.Salle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends MongoRepository<Salle, String> {
    Salle findByNumero(int numero);
}
