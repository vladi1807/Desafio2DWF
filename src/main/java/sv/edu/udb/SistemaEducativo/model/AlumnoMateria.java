package sv.edu.udb.SistemaEducativo.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class AlumnoMateria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_alumno")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "id_materia")
    private Materia materia;
}