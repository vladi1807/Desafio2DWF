package sv.edu.udb.SistemaEducativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.SistemaEducativo.model.Profesor;
import sv.edu.udb.SistemaEducativo.service.ProfesorService;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {

    @Autowired
    private ProfesorService service;

    @GetMapping
    public List<Profesor> listar() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Profesor obtener(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Profesor guardar(@RequestBody Profesor profesor) {
        return service.save(profesor);
    }

    @PutMapping("/{id}")
    public Profesor actualizar(@PathVariable Long id, @RequestBody Profesor profesor) {
        profesor.setId(id);
        return service.save(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
}