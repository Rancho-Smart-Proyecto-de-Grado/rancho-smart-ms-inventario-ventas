package com.rancho_smart.ms_inventario_ventas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.rancho_smart.ms_inventario_ventas.entity.AnimalVenta;
import com.rancho_smart.ms_inventario_ventas.service.AnimalVentaService;

@RestController
@RequestMapping("/animales-venta")
public class AnimalVentaRESTController {

    @Autowired
    private AnimalVentaService animalVentaService;

    @GetMapping
    public ResponseEntity<List<AnimalVenta>> getAllAnimalVentas() {
        List<AnimalVenta> animalVentas = animalVentaService.getAllAnimalVentas();
        return new ResponseEntity<>(animalVentas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalVenta> getAnimalVentaById(@PathVariable Long id) {
        Optional<AnimalVenta> animalVenta = animalVentaService.getAnimalVentaById(id);
        return animalVenta.map(ResponseEntity::ok)
                          .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<AnimalVenta> createAnimalVenta(@RequestBody AnimalVenta animalVenta) {
        AnimalVenta newAnimalVenta = animalVentaService.saveAnimalVenta(animalVenta);
        return new ResponseEntity<>(newAnimalVenta, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnimalVenta> updateAnimalVenta(@PathVariable Long id, @RequestBody AnimalVenta animalVenta) {
        if (!animalVentaService.getAnimalVentaById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        animalVenta.setIdAnimalVenta(id);
        AnimalVenta updatedAnimalVenta = animalVentaService.saveAnimalVenta(animalVenta);
        return new ResponseEntity<>(updatedAnimalVenta, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnimalVenta(@PathVariable Long id) {
        if (!animalVentaService.getAnimalVentaById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        animalVentaService.deleteAnimalVenta(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
