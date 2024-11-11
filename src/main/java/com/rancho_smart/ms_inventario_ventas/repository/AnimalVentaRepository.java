package com.rancho_smart.ms_inventario_ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rancho_smart.ms_inventario_ventas.entity.AnimalVenta;
import java.util.List;


@Repository
public interface AnimalVentaRepository extends JpaRepository<AnimalVenta, Long>{
    public List<AnimalVenta> findByIdAnimal(Long idAnimal);
}
