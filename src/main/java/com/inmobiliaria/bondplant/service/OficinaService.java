package com.inmobiliaria.bondplant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.inmobiliaria.bondplant.entity.Oficina;
import com.inmobiliaria.bondplant.repository.OficinaRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Lorena
 */
@Service
public class OficinaService {

    private static final Logger logger = LoggerFactory.getLogger(OficinaService.class);
    @Autowired
    OficinaRepository oficinaRepository;

    public Optional<Oficina> findById(String id) throws Exception{
        Optional<Oficina> oficina = oficinaRepository.findById(id);
       return oficina;
    }
    public Iterable<Oficina> findAll(){
       return oficinaRepository.findAll();
    }
    public Oficina save(Oficina oficina) {
        logger.info("===========save oficina " + oficina);
        Oficina aux = oficinaRepository.save(oficina);
        System.out.println("-----------la oficina se guardÃ³-------------" + aux);
        return aux;
    }
}
