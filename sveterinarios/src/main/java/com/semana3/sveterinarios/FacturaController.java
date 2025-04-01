package com.semana3.sveterinarios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;   // Utilizo arreglos y listas para poder crearlos y luego añadir datos de prueba
import java.util.List;




@RestController
public class FacturaController {
   
    
    private List<Factura> facturas = new ArrayList<>();    //creo el arreglo-lista "factura" con la clase "Factura"
    //añado datos al arreglo con la estructura de la clase
    public FacturaController(){
        facturas.add(new Factura(1, "cachupin", "Diego Gonzalez", "Consulta basica", 15000));
        facturas.add(new Factura(2, "canela", "Barbara Lillo", "Vacunacion", 10000));
        facturas.add(new Factura(3, "snoopy", "Nicolas Escobar", "Esteriliacion",20000));
    }

     @GetMapping({"/facturas", "/facturas/{id}"})
    public ResponseEntity<?> getFacturas(@PathVariable(required = false) Integer id) {   //al hacer el path variable utilizo un solo mapping para ambos endpoint, buscando el id en este caso
        if (id != null) {
            for (Factura factura : facturas) {
                if (factura.getId() == id) {     
                    return ResponseEntity.ok(factura);
                }
            }                                                // en caso de no existir el id, devuelvo respuesta en pantalla
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Factura no encontrada");
        }
        return ResponseEntity.ok(facturas);
    }
    
    
}


