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

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> setDeSucursales;

    public void agregarSucursal(Sucursal sucursal) {
        if (setDeSucursales == null) setDeSucursales = new HashSet<>();
        setDeSucursales.add(sucursal);
    }

    public void eliminarSucursal(Sucursal sucursal) {
        if (setDeSucursales != null) setDeSucursales.remove(sucursal);
    }
}
