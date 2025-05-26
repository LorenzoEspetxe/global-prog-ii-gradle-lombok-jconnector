package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class ArticuloManufacturadoDetalle extends Base{
    private Integer cantidad;
    private ArticuloInsumo insumo;
}
