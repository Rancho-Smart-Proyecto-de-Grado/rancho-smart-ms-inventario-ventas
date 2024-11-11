package com.rancho_smart.ms_inventario_ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rancho_smart.ms_inventario_ventas.entity.AnimalVenta;
import com.rancho_smart.ms_inventario_ventas.repository.AnimalVentaRepository;

@Service
public class AnimalVentaService {

    @Autowired
    private AnimalVentaRepository animalVentaRepository;

    public List<AnimalVenta> getAllAnimalVentas() {
        return animalVentaRepository.findAll();
    }

    public List<AnimalVenta> getAnimalesByIdAnimal(Long idAnimal){
        return this.animalVentaRepository.findByIdAnimal(idAnimal);
    }

    public Optional<AnimalVenta> getAnimalVentaById(Long id) {
        return animalVentaRepository.findById(id);
    }

    public AnimalVenta saveAnimalVenta(AnimalVenta animalVenta) {
        return animalVentaRepository.save(animalVenta);
    }

    public void deleteAnimalVenta(Long id) {
        animalVentaRepository.deleteById(id);
    }
}
