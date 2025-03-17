package entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Data;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "AMARRE")
public class Amarre implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String LecturaContadorDeAgua;
    private String LecturaContadorDeLuz;
    private Boolean ServiciosdeMantenimientocontratados;

}
