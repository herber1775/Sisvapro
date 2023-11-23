package com.sisvapro.proyectowebv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sisvapro.proyectowebv2.model.Carro;

public interface ICarroRepository extends JpaRepository<Carro, Integer> {
}
