package com.sisvapro.proyectowebv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisvapro.proyectowebv2.model.TipoEmpleado;

@Repository
public interface ITipoRepository extends JpaRepository<TipoEmpleado, Integer> {
}
