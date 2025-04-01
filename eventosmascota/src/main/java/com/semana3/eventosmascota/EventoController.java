package com.semana3.eventosmascota;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class EventoController {
    private List<Evento> eventos = new ArrayList<>();

    public EventoController (){
        eventos.add(new Evento(1, "Carreras", "Parque Bicentenario", "10/04/25"));
        eventos.add(new Evento(2, "Acrobacias", "Paque Ohiggins", "23/04/25"));
        eventos.add(new Evento(3, "Belleza", "Espacio Riesco", "29/04/25"));
    }

    @GetMapping({"/eventos", "/eventos/{id}"})
    public ResponseEntity<?> getEvento(@PathVariable(required = false) Integer id) {
        if (id != null) {
            for (Evento evento : eventos) {
                if (evento.getId() == id) {
                    return ResponseEntity.ok(evento);
                }
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Evento no encontrado");
        }
        return ResponseEntity.ok(eventos);
    }
    
}
