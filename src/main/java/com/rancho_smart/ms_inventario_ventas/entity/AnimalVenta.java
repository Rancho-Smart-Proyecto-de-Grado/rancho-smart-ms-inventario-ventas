package com.rancho_smart.ms_inventario_ventas.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ANIMAL_VENTA")
public class AnimalVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAnimalVenta;

    @Column(name = "ID_ANIMAL")
    private Long idAnimal;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PRECIO")
    private Float precio;

    @Column(name = "MONEDA")
    private Moneda moneda;

    public AnimalVenta() {
    }

    public AnimalVenta(Long idAnimal, String descripcion, Float precio, Moneda moneda) {
        this.idAnimal = idAnimal;
        this.descripcion = descripcion;
        this.precio = precio;
        this.moneda = moneda;
    }

    public Long getIdAnimalVenta() {
        return idAnimalVenta;
    }

    public void setIdAnimalVenta(Long idAnimalVenta) {
        this.idAnimalVenta = idAnimalVenta;
    }

    public Long getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(Long idAnimal) {
        this.idAnimal = idAnimal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }

}
