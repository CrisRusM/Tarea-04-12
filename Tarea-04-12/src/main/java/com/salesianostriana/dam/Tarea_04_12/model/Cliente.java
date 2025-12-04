package com.salesianostriana.dam.Tarea_04_12.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;

    @OneToMany(mappedBy = "cliente")
    @Builder.Default
    @ToString.Exclude
    private List<Pedido> pedidos =new ArrayList<Pedido>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nombre, cliente.nombre) && Objects.equals(email, cliente.email) && Objects.equals(pedidos, cliente.pedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, email, pedidos);
    }
}
