package com.salesianostriana.dam.Tarea_04_12.repository;

import com.salesianostriana.dam.Tarea_04_12.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
