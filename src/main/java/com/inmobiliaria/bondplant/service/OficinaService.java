package com.inmobiliaria.bondplant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inmobiliaria.bondplant.entity.Oficina;
import com.inmobiliaria.bondplant.repository.OficinaRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Lorena
 */
@Service
public class OficinaService {

    private static final Logger logger = 
            LoggerFactory.getLogger(OficinaService.class);
    @Autowired
    OficinaRepository oficinaRepository;

    public Iterable<Oficina> findAll() {
        return oficinaRepository.findAll(Pageable.unpaged());
    }

    public Optional<Oficina> findById(String id) throws Exception {
        Optional<Oficina> oficina = oficinaRepository.findById(id);
        return oficina;
    }

    public Iterable<Oficina> findAllByState(int id_estado) {
        return oficinaRepository.findAllByState(id_estado);
    }

    public Oficina save(Oficina oficina) {
        return oficinaRepository.save(oficina);
    }
    
    public void deleteById(String id_oficina) {
        oficinaRepository.deleteById(id_oficina);
    }
    public boolean existById(String id_oficina) {
        return oficinaRepository.existsById(id_oficina);
    }
}
