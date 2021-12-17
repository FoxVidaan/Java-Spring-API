package fr.formation.apicine.controllers;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import fr.formation.apicine.entities.Seance;
import fr.formation.apicine.services.SeanceService;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/seances")
public class SeanceController {
    private SeanceService service;

    public SeanceController(SeanceService service) {
        this.service = service;
    }

    @GetMapping
    public List<Seance> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{date}")
    public Seance findByNom(@PathVariable LocalDateTime date) {
        return this.service.findByDate(date);
    }
    
    @PostMapping
    public Seance create(@RequestBody Seance seance) {
        return this.service.save(seance);
    }

    @PutMapping
    public Seance update(@RequestBody Seance seance) {
        return this.service.save(seance);
    }

    @DeleteMapping
    public void delete(@RequestBody Seance seance) {
        this.service.delete(seance);
    }
}
