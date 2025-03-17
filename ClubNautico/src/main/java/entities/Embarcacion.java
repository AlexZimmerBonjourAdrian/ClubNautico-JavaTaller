package entities;

import Data.DTDimension;

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

@Table(name = "EMBARCACION")
public class Embarcacion implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Matricula;
    private String Nombre;
    private String Tipo;
    private DTDimension Dimension;
}
