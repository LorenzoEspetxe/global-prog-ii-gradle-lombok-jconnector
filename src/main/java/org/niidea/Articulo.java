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

public abstract class Articulo extends Base {
    private String nombre;
    private Double precioVenta;
    private UnidadDeMedida unidadDeMedida;
    private Set<Imagen> setDeImagenes;

    public void agregarImagen(Imagen imagen) {
        if (setDeImagenes == null) setDeImagenes = new HashSet<>();
        this.setDeImagenes.add(imagen);
    }

    public void eliminarImagenes(Imagen imagen) {
        if (setDeImagenes != null) this.setDeImagenes.remove(imagen);
    }
}
