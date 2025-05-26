package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class ArticuloInsumo extends Articulo {
    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    public void aumentarStockActual(Integer nuevoStock) {
        this.stockActual = this.stockActual + nuevoStock;
    }

    public void disminuirStockActual(Integer salidaDeStock) {
        this.stockActual = this.stockActual - salidaDeStock;
    }
}
