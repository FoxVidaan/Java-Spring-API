package fr.formation.apicine.controllers;

import fr.formation.apicine.entities.Film;
import fr.formation.apicine.services.FilmService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {
    private FilmService service;

    public FilmController(FilmService service) {
        this.service = service;
    }

    @GetMapping
    public List<Film> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{nom}")
    public Film findByNom(@PathVariable String nom) {
        return this.service.findByNom(nom);
    }
    
    @PostMapping
    public Film create(@RequestBody Film Film) {
        return this.service.save(Film);
    }

    @DeleteMapping
    public void delete(@RequestBody Film Film) {
        this.service.delete(Film);
    }
}
