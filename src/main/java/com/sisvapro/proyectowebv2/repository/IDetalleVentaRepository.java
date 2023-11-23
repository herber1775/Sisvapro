package com.sisvapro.proyectowebv2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sisvapro.proyectowebv2.model.DetalleVenta;
import com.sisvapro.proyectowebv2.model.Venta;

import java.util.List;

@Repository
public interface IDetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
    List<DetalleVenta> findByVentaId(int id);
    List<DetalleVenta> findByVenta(Venta venta);
   // List<DetalleVenta> findByVentaId(int id);
}
