package entities;
import jakarta.persistence.*;
import lombok.Data;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Entity
@Table(name = "AMARRE")
@Data
public class Amarre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "nombre")
    private String nombre;

    @Column(name = "lectura_contador_de_agua")
    private String LecturaContadorDeAgua;

    @Column(name = "lectura_contador_de_luz")
    private String LecturaContadorDeLuz;

    @Column(name = "servicios_de_mantenimiento_contratados")
    private Boolean ServiciosdeMantenimientocontratados;

    @ManyToOne
    @JoinColumn(name = "zona_id")
    private Zona zona;

    @OneToMany
    @JoinColumn(name = "embarkationAmarres_id")
    private List<EmbarcacionAmarre> embarcacionAmarres;
}
