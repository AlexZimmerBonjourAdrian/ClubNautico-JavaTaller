package Data;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class DTDimension {
    private Float Largo;
    private Float Ancho;
    private Float Alto;

}
