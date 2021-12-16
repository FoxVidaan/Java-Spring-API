package fr.formation.apicine.repositories;

import fr.formation.apicine.entities.Salle;
import fr.formation.apicine.entities.Seance;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import javax.naming.directory.SearchControls;
import java.util.Date;

@Repository
public interface SeanceRepository extends MongoRepository<Seance, String> {
    Seance findByDate(Date date);
}
