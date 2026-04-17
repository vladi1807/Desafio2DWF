package sv.edu.udb.SistemaEducativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.SistemaEducativo.model.Alumno;
import sv.edu.udb.SistemaEducativo.service.AlumnoService;

import java.util.List;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService service;

    @GetMapping
    public List<Alumno> listar() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Alumno obtener(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Alumno guardar(@RequestBody Alumno alumno) {
        return service.save(alumno);
    }

    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        alumno.setId(id);
        return service.save(alumno);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
}