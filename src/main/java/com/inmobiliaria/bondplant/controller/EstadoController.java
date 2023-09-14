package com.inmobiliaria.bondplant.controller;

import com.inmobiliaria.bondplant.entity.Estado;
import com.inmobiliaria.bondplant.service.EstadoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lorena
 */
@RestController
@RequestMapping(path = "/api")
public class EstadoController {

    private static final Logger logger = LoggerFactory.getLogger(OficinaController.class);
    @Autowired
    EstadoService estadoService;

    @GetMapping("/estados")
    public ResponseEntity getEstados() {
        Iterable<Estado> estados = estadoService.findAll();
        if (estados.iterator().hasNext()) {
            return ResponseEntity.ok().body(estados);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
