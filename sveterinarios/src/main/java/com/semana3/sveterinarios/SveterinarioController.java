package com.semana3.sveterinarios;


import org.springframework.http.HttpStatus;            
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;                // Utilizo arreglos y listas para poder crearlos y luego añadir datos de prueba
import java.util.List;

@RestController
public class SveterinarioController {
    private List<Servicio> servicios = new ArrayList<>();

    public SveterinarioController (){
        servicios.add(new Servicio(1, "Consulta", "Consulta basica para diagnostico", 15000));
        servicios.add(new Servicio(2, "Vacunacion", "Servicio de vacuna para mascotas", 10000));
        servicios.add(new Servicio(3, "Esterilizacion", "Servicio de esterelizacion para mascotas", 20000));
    }
    
    

    @GetMapping({"/servicios", "/servicios/{id}"})                                                    //al hacer el path variable utilizo un solo mapping para ambos endpoint, buscando el id en este caso
    public ResponseEntity<?> getServicio(@PathVariable(required = false) Integer id) {
        if (id != null) {
            for (Servicio servicio : servicios) {
                if (servicio.getId() == id) {
                    return ResponseEntity.ok(servicio);
                }
            }                                       // en caso de no existir el id, devuelvo respuesta en pantalla
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento no encontrado");
        }
        return ResponseEntity.ok(servicios);        
    }
    
    
}


