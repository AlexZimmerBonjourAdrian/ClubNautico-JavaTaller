package entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

@Table(name = "EMBARCACCIONAMARRE")
public class EmbarcacionAmarre implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDate fechanacimiento;
}
