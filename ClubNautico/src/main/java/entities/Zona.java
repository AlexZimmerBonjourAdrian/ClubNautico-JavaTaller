package entities;

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

@Table(name = "ZONA")
public class Zona implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Letra;
    private String Tipodebarcos;
    private Integer Numerodebarcos;
    private Double Saldo;
}
