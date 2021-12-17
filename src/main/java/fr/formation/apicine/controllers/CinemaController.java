package fr.formation.apicine.controllers;

import fr.formation.apicine.entities.Cinema;
import fr.formation.apicine.services.CinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cinemas")
public class CinemaController {
    private CinemaService service;

    public CinemaController(CinemaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Cinema> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{nom}")
    public Cinema findByNom(@PathVariable String nom) {
        return this.service.findByNom(nom);
    }
    
    @PostMapping
    public Cinema create(@RequestBody Cinema cinema) {
        return this.service.save(cinema);
    }

    @PutMapping
    public Cinema update(@RequestBody Cinema cinema) {
        return this.service.save(cinema);
    }

    @DeleteMapping
    public void delete(@RequestBody Cinema cinema) {
        this.service.delete(cinema);
    }
}
