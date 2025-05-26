package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Domicilio domicilio;
    private Set<Categoria> setDeCategorias;
    private Set<Promocion> setDePromociones;

    public void agregarCategoria(Categoria categoria) {
        if (setDeCategorias == null) setDeCategorias = new HashSet<>();
        setDeCategorias.add(categoria);
    }

    public void eliminarCategoria(Categoria categoria) {
        if (setDeCategorias != null) setDeCategorias.remove(categoria);
    }

    public void agregarPromocion(Promocion promocion) {
        if (setDePromociones == null) setDePromociones = new HashSet<>();
        setDePromociones.add(promocion);
    }

    public void eliminarPromocion(Promocion promocion) {
        if (setDePromociones != null) setDePromociones.remove(promocion);
    }
}
