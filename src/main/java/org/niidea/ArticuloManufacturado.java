package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class ArticuloManufacturado extends Articulo {
    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> setDetalleInsumos;


    public void agregarDetalleInsumos(ArticuloManufacturadoDetalle detalleInsumos) {
        if (setDetalleInsumos == null) setDetalleInsumos = new HashSet<>();
        this.setDetalleInsumos.add(detalleInsumos);
    }

    public void eliminarDetalleInsumos(ArticuloManufacturadoDetalle detalleInsumos) {
        this.setDetalleInsumos.remove(detalleInsumos);
    }
}
