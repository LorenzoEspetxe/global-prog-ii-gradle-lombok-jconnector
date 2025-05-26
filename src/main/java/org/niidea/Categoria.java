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

public class Categoria extends Base {
    private String nombre;
    @ToString.Exclude
    private Categoria categoriaPadre;
    private Set<Articulo> setDeArticulos;
    private Set<Categoria> setDeSubcategorias;

    public void agregarSubcategoria(Categoria subcategoria) {
        if (setDeSubcategorias == null) setDeSubcategorias = new HashSet<>();
        this.setDeSubcategorias.add(subcategoria);
        subcategoria.setCategoriaPadre(this);
    }

    public void eliminarSubcategoria(Categoria subcategoria) {
        if (setDeSubcategorias != null) this.setDeSubcategorias.remove(subcategoria);
        subcategoria.setCategoriaPadre(null);
    }

    public void agregarArticulo(Articulo articulo) {
        if (setDeArticulos == null) setDeArticulos = new HashSet<>();
        this.setDeArticulos.add(articulo);
    }
    public void eliminarArticulo(Articulo articulo) {
        if (setDeArticulos != null) this.setDeArticulos.remove(articulo);
    }
}
