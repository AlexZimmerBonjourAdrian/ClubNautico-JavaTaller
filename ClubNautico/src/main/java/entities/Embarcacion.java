package entities;

import java.io.Serializable;
import java.util.List;
import Data.DTDimension;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Data
@Table(name = "EMBARCACION")
public class Embarcacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "lectura_contador_de_agua")
    private String LecturaContadorDeAgua;

    @Column(name = "lectura_contador_de_luz")
    private String LecturaContadorDeLuz;

    @Column(name = "servicios_de_mantenimiento_contratados")
    private Boolean ServiciosdeMantenimientocontratados;


    @Embedded
    private DTDimension Dimension;

    @JoinColumn(name = "embarcacion_id")
    @OneToMany(mappedBy = "duenio", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REMOVE}, orphanRemoval = true)
    private List<EmbarcacionAmarre> embarcacionAmarres;
}
