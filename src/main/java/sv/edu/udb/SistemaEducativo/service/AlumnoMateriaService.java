package sv.edu.udb.SistemaEducativo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.SistemaEducativo.model.AlumnoMateria;
import sv.edu.udb.SistemaEducativo.repository.AlumnoMateriaRepository;

import java.util.List;

@Service
public class AlumnoMateriaService {

    @Autowired
    private AlumnoMateriaRepository repo;

    public List<AlumnoMateria> getAll() {
        return repo.findAll();
    }

    public AlumnoMateria getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public AlumnoMateria save(AlumnoMateria alumnoMateria) {
        return repo.save(alumnoMateria);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}