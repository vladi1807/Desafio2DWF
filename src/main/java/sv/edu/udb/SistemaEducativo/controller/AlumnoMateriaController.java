package sv.edu.udb.SistemaEducativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.SistemaEducativo.model.AlumnoMateria;
import sv.edu.udb.SistemaEducativo.service.AlumnoMateriaService;

import java.util.List;

@RestController
@RequestMapping("/alumno-materia")
public class AlumnoMateriaController {

    @Autowired
    private AlumnoMateriaService service;

    @GetMapping
    public List<AlumnoMateria> listar() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AlumnoMateria obtener(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public AlumnoMateria guardar(@RequestBody AlumnoMateria alumnoMateria) {
        return service.save(alumnoMateria);
    }

    @PutMapping("/{id}")
    public AlumnoMateria actualizar(@PathVariable Long id, @RequestBody AlumnoMateria alumnoMateria) {
        alumnoMateria.setId(id);
        return service.save(alumnoMateria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
}