package sv.edu.udb.SistemaEducativo.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;
}
