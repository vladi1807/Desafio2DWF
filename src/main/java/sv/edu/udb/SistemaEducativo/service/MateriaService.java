package sv.edu.udb.SistemaEducativo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.SistemaEducativo.model.Materia;
import sv.edu.udb.SistemaEducativo.repository.MateriaRepository;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepository repo;

    public List<Materia> getAll() {
        return repo.findAll();
    }

    public Materia getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Materia save(Materia materia) {
        return repo.save(materia);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}