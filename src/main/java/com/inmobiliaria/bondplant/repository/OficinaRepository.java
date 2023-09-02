package com.inmobiliaria.bondplant.repository;

import com.inmobiliaria.bondplant.entity.Oficina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lorena
 */
@Repository
public interface OficinaRepository extends CrudRepository<Oficina, Object>{
    
}
