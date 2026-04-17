package sv.edu.udb.SistemaEducativo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sv.edu.udb.SistemaEducativo.model.Materia;
import sv.edu.udb.SistemaEducativo.service.MateriaService;

import java.util.List;

@RestController
@RequestMapping("/materias")
public class MateriaController {

    @Autowired
    private MateriaService service;

    @GetMapping
    public List<Materia> listar() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Materia obtener(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public Materia guardar(@RequestBody Materia materia) {
        return service.save(materia);
    }

    @PutMapping("/{id}")
    public Materia actualizar(@PathVariable Long id, @RequestBody Materia materia) {
        materia.setId(id);
        return service.save(materia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
}
