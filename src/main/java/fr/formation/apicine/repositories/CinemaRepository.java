package fr.formation.apicine.repositories;

import fr.formation.apicine.entities.Cinema;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRepository extends MongoRepository<Cinema, String> {
    Cinema findByNom(String nom);
}
