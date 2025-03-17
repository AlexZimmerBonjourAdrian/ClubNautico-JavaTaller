package entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "EMPLEADOZONA")
public class EmpleadoZona implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer cantidadBarcos;

}
