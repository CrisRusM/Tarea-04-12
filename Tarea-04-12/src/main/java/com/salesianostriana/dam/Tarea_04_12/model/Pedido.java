package com.salesianostriana.dam.Tarea_04_12.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double total;

    @ManyToOne
    @JoinColumn(foreignKey =
    @ForeignKey(name = "fk_cliente_pedido"))
    private Cliente cliente;
}
