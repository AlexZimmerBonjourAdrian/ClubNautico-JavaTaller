package entities;

import jakarta.persistence.*;
import lombok.*;
import Data.DTDireccion;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre", nullable = false)
    protected String nombre;

    @Embedded
    protected DTDireccion direccion;


    @Column(name = "telefono", nullable = false)
    protected String telefono;
}
