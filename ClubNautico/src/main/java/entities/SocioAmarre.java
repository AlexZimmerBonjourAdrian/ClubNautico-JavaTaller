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

@Table(name = "SOCIOAMARRE")
public class SocioAmarre implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private LocalDate fechanacimiento;

}
