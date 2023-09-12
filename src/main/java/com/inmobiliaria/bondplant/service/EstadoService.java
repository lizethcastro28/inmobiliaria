package com.inmobiliaria.bondplant.service;

import com.inmobiliaria.bondplant.entity.Estado;
import com.inmobiliaria.bondplant.entity.Oficina;
import com.inmobiliaria.bondplant.repository.EstadoRepository;
import com.inmobiliaria.bondplant.repository.OficinaRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lorena
 */
@Service
public class EstadoService {
    private static final Logger logger = LoggerFactory.getLogger(OficinaService.class);
    @Autowired
    EstadoRepository estadoRepository;

    public Iterable<Estado> findAll(){
       return estadoRepository.findAll();
    }
}
