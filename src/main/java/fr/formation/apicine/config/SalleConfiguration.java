package fr.formation.apicine.config;

import fr.formation.apicine.repositories.SalleRepository;
import fr.formation.apicine.services.SalleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SalleConfiguration {
    @Bean
    public SalleService SalleService(SalleRepository SalleRepository) {
        return new SalleService(SalleRepository);
    }
}
