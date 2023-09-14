package com.inmobiliaria.bondplant.repository;

import com.inmobiliaria.bondplant.entity.Oficina;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lorena
 */
@Repository
public interface OficinaRepository extends CrudRepository<Oficina, Object>,
        PagingAndSortingRepository<Oficina, Object> {

    @Query(value = "SELECT * FROM oficinas where id_estado = ?1", nativeQuery = true)
    List<Oficina> findAllByState(int id_estado);
}
