package org.niidea;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString

public class Cliente extends Base {
    private Usuario usuario;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private ImagenCliente imagenCliente;
    private Set<Pedido> setDePedidos;

    public void agregarPedido(Pedido pedido) {
        if (setDePedidos == null) setDePedidos = new HashSet<>();
        this.setDePedidos.add(pedido);
    }
    public void eliminarPedido(Pedido pedido) {
        if (setDePedidos != null) this.setDePedidos.remove(pedido);
    }
}
