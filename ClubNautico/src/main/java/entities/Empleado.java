package entities;

import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "EMPLEADO")
public class Empleado implements Serializable {
    private String codigo;
    private String Especialidad;

}
