package sv.edu.udb.SistemaEducativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sv.edu.udb.SistemaEducativo.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {}