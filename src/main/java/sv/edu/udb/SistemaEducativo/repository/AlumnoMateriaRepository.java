package sv.edu.udb.SistemaEducativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.SistemaEducativo.model.AlumnoMateria;

@Repository
public interface AlumnoMateriaRepository extends JpaRepository<AlumnoMateria, Long> {}
