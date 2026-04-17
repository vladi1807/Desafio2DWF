package sv.edu.udb.SistemaEducativo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.SistemaEducativo.model.Alumno;
import sv.edu.udb.SistemaEducativo.repository.AlumnoRepository;

import java.util.List;

@Service
public class AlumnoService {

    @Autowired
    private AlumnoRepository repo;

    public List<Alumno> getAll() {
        return repo.findAll();
    }

    public Alumno getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Alumno save(Alumno alumno) {
        return repo.save(alumno);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}