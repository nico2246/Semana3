package com.semana3.eventosmascota;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController
public class ParticipanteController {
    private List<Participante> participantes = new ArrayList<>();

    public ParticipanteController (){
        participantes.add(new Participante(1, "Cachupin", 1, "Perro", "Barbara Lillo"));
        participantes.add(new Participante(2, "Canela", 2, "Perro", "Nicolas Escobar"));
        participantes.add(new Participante(3, "Pelusa", 2, "Perro", "Antonio Rosales"));
    }
    

    @GetMapping({"/participantes", "/participantes/{id}"})
    public ResponseEntity<?> getParticipante(@PathVariable(required = false) Integer id) {
        if (id != null) {
            for (Participante participante : participantes) {
                if (participante.getId() == id) {
                    return ResponseEntity.ok(participante);
                }
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Participante no encontrado");
        }
        return ResponseEntity.ok(participantes);
    }
    

}
