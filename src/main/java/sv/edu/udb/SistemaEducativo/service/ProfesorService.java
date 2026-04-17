package sv.edu.udb.SistemaEducativo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sv.edu.udb.SistemaEducativo.model.Profesor;
import sv.edu.udb.SistemaEducativo.repository.ProfesorRepository;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository repo;

    public List<Profesor> getAll() {
        return repo.findAll();
    }

    public Profesor getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Profesor save(Profesor profesor) {
        return repo.save(profesor);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}