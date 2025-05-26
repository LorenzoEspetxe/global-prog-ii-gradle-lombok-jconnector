package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class DetallePromocion extends Base{
    private Integer cantidad;
    private Double subTotal;
    private Promocion promocion;
}
