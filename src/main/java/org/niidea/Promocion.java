package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Promocion extends Base {
    private String nombre; // Nombre me parece mas ilustrativo que denominacion.
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Imagen> setDeImagenes;
    private Set<Articulo> setDeArticulos;

    public void agregarArticulos(Articulo articulo) {
        if (setDeArticulos == null) setDeArticulos = new HashSet<>();
        this.setDeArticulos.add(articulo);
    }

    public void eliminarArticulos(Articulo articulo) {
        if (setDeArticulos != null) this.setDeArticulos.remove(articulo);
    }

    public void agregarImagenes(Imagen imagen) {
        if (setDeImagenes == null) setDeImagenes = new HashSet<>();
        this.setDeImagenes.add(imagen);
    }

    public void eliminarImagenes(Imagen imagen) {
        if (setDeImagenes != null) this.setDeImagenes.remove(imagen);
    }
}
