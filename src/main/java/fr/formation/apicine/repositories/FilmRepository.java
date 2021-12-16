package fr.formation.apicine.repositories;

import fr.formation.apicine.entities.Cinema;
import fr.formation.apicine.entities.Film;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends MongoRepository<Film, String> {
    Film findByNom(String nom);
}
