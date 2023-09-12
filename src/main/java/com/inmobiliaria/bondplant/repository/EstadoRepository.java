package com.inmobiliaria.bondplant.repository;

import com.inmobiliaria.bondplant.entity.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lorena
 */
@Repository
public interface EstadoRepository extends CrudRepository<Estado, Object>{
    
}
