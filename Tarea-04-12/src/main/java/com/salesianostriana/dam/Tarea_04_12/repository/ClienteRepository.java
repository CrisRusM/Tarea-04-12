package com.salesianostriana.dam.Tarea_04_12.repository;

import com.salesianostriana.dam.Tarea_04_12.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
