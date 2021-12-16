package fr.formation.apicine.config;

import fr.formation.apicine.repositories.SeanceRepository;
import fr.formation.apicine.services.SeanceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SeanceConfiguration {
    @Bean
    public SeanceService SeanceService(SeanceRepository SeanceRepository) {
        return new SeanceService(SeanceRepository);
    }
}
