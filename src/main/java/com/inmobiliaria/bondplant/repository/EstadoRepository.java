package com.inmobiliaria.bondplant.repository;

import com.inmobiliaria.bondplant.entity.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * @author Lorena
 */
@RepositoryRestResource(path = "estados")
public interface EstadoRepository extends CrudRepository<Estado, Object>{
    
}
