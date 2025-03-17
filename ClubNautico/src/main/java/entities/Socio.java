package entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "SOCIO")
public class Socio implements Serializable {

    @Id
    private String dni;

    @GeneratedValue(strategy = GenerationType.AUTO)

    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate  fechanacimiento;
}
