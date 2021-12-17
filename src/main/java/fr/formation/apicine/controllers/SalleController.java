package fr.formation.apicine.controllers;

import fr.formation.apicine.entities.Salle;
import fr.formation.apicine.services.SalleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salles")
public class SalleController {
    private SalleService service;

    public SalleController(SalleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Salle> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{numero}")
    public Salle findByNom(@PathVariable int numero) {
        return this.service.findByNumero(numero);
    }
    
    @PostMapping
    public Salle create(@RequestBody Salle salle) {
        return this.service.save(salle);
    }

    @PutMapping
    public Salle update(@RequestBody Salle salle) {
        return this.service.save(salle);
    }

    @DeleteMapping
    public void delete(@RequestBody Salle salle) {
        this.service.delete(salle);
    }
}
