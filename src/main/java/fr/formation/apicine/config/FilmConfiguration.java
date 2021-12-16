package fr.formation.apicine.config;

import fr.formation.apicine.repositories.FilmRepository;
import fr.formation.apicine.services.FilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmConfiguration {
    @Bean
    public FilmService FilmService(FilmRepository FilmRepository) {
        return new FilmService(FilmRepository);
    }
}
