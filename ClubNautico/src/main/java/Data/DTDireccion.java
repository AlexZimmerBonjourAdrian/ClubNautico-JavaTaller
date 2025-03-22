package Data;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class DTDireccion {
    private String calle;
    private Integer Numero;
    private String Ciudad;
}
