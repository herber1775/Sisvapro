package com.sisvapro.proyectowebv2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "carro")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carro")
    private int id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "origen")
    private String origen;

    @Column(name = "combustible")
    private String Combustible;

    @Column(name = "precio")
    private double precio;

    @Column(name = "stock")
    private int stock;
    
    @Column(name = "anio")
    private int anio;
    
    @Column(name = "nrserie")
    private String nrserie;
    
    @ManyToOne
    @JoinColumn(name = "id_marca")
    Marca objMarca;

}
