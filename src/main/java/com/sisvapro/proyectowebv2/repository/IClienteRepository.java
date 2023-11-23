package com.sisvapro.proyectowebv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sisvapro.proyectowebv2.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByDni(String dni);
}
