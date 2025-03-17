package entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "PERSONA")
public class Persona implements Serializable {
    @Id
    private Long id;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private String nombre;
    private String Direccion;
    private String Telefono;


}
