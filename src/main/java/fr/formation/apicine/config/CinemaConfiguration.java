package fr.formation.apicine.config;

import fr.formation.apicine.repositories.CinemaRepository;
import fr.formation.apicine.services.CinemaService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CinemaConfiguration {
    @Bean
    public CinemaService cinemaService(CinemaRepository cinemaRepository) {
        return new CinemaService(cinemaRepository);
    }
}
