package entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Data
@Entity
@Table(name = "EMBARCACIONAMARRE")
public class EmbarcacionAmarre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "lectura_contador_de_agua")
    private String LecturaContadorDeAgua;

    @Column(name = "lectura_contador_de_luz")
    private String LecturaContadorDeLuz;

    @Column(name = "servicios_de_mantenimiento_contratados")
    private Boolean ServiciosdeMantenimientocontratados;

    @ManyToOne
    @JoinColumn(name = "zona_id")
    private Zona zona;

    @ManyToOne
    @JoinColumn(name = "embarcacion_id")
    private Embarcacion embarcacion;


}
