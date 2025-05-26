package org.niidea;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Pedido extends Base{
    private Sucursal sucursal;
    private Domicilio domicilio;
    private Factura factura;
    private Set<DetallePedido> setDeDetallePedido;
    private Set<DetallePromocion> setDeDetallePromocion;
    private LocalTime horaEstimadaFinalizacion;
    private LocalDate fechaPedido;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private FormaPago formaPago;

    public void agregarDetallePedido(DetallePedido detalle) {
        if (setDeDetallePedido == null) setDeDetallePedido = new HashSet<>();
        this.setDeDetallePedido.add(detalle);
    }
    public void eliminarDetallePedido(DetallePedido detalle) {
        if (setDeDetallePedido != null) this.setDeDetallePedido.remove(detalle);
    }

    public void agregarDetallePromocion(DetallePromocion detalle) {
        if (setDeDetallePromocion == null) setDeDetallePromocion = new HashSet<>();
        this.setDeDetallePromocion.add(detalle);
    }
    public void eliminarDetallePromocion(DetallePromocion detalle) {
        if (setDeDetallePromocion != null) this.setDeDetallePromocion.remove(detalle);
    }
}
