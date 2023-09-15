package com.inmobiliaria.bondplant.controller;

import com.inmobiliaria.bondplant.entity.Oficina;
import com.inmobiliaria.bondplant.service.OficinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author Lorena
 */
@RestController
@RequestMapping(path = "/api")
public class OficinaController {

    private static final Logger logger = LoggerFactory.getLogger(OficinaController.class);
    @Autowired
    OficinaService oficinaService;

    @GetMapping("/oficinas")
    public ResponseEntity getOficinas() {
        Iterable<Oficina> oficinas = oficinaService.findAll();
        if (oficinas.iterator().hasNext()) {
            return ResponseEntity.ok().body(oficinas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/oficinas/estados/{id_estado}")
    public ResponseEntity getOficinasPorEstado(@PathVariable int id_estado) {
        Iterable<Oficina> oficinas = oficinaService.findAllByState(id_estado);
        if (oficinas.iterator().hasNext()) {
            return ResponseEntity.ok().body(oficinas);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/oficinas/{id}")
    public ResponseEntity getOficina(@PathVariable String id) throws Exception {
        Optional<Oficina> oficina = oficinaService.findById(id);
        if (oficina.isPresent()) {
            return ResponseEntity.ok().body(oficina.get());
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @PostMapping("/oficinas")
    public ResponseEntity addOficina(@Valid @RequestBody Oficina oficina) {
        Oficina aux = oficinaService.save(oficina);
        return ResponseEntity.ok().body(aux);
    }

    @DeleteMapping("/oficinas/{id}")
    public ResponseEntity deleteOficina(@PathVariable String id) throws Exception {
        if (oficinaService.existById(id)) {
            oficinaService.deleteById(id);
            return ResponseEntity.ok().body(id);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

}
