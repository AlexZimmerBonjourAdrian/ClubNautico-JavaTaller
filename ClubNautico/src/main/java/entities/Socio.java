package entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "SOCIO")
public class Socio extends Persona {

    @Id
    @Column(name = "dni", nullable = false, unique = true)
    private String dni;

    @Column(name = "nombre", nullable = false)
    protected String nombre;

    @Column(name = "direccion", nullable = false)
    protected String direccion;

    @Column(name = "telefono", nullable = false)
    protected String telefono;

    @Column(name = "fechanacimiento", nullable = false)
    private LocalDate fechanacimiento;

    @OneToMany(mappedBy = "duenio", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE}, orphanRemoval = true)
    private List<Embarcacion> embarcacions;
}
