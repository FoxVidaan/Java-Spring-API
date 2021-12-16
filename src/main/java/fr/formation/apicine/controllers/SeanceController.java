package fr.formation.apicine.controllers;

import fr.formation.apicine.entities.Seance;
import fr.formation.apicine.services.SeanceService;
import org.springframework.web.bind.annotation.*;

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
    public Seance findByNom(@PathVariable Date date) {
        return this.service.findByDate(date);
    }
    
    @PostMapping
    public Seance create(@RequestBody Seance Seance) {
        return this.service.save(Seance);
    }

    @DeleteMapping
    public void delete(@RequestBody Seance Seance) {
        this.service.delete(Seance);
    }
}
