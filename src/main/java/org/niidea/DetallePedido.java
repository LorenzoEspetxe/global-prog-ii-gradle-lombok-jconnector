package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class DetallePedido extends Base{
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
}
