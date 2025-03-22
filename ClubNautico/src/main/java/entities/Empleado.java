package entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "EMPLEADO")
public class Empleado extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "codigo")
    protected String codigo;

    @Column(name = "especialidad", nullable = false)
    protected String especialidad;
}
