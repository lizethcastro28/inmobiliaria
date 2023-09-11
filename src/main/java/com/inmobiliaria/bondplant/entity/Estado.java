package com.inmobiliaria.bondplant.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Lorena
 */
@Getter
@Setter
@Entity
@Table(name = "ESTADOS")
public final class Estado {

    @Id
    @Column(name = "ID_ESTADO")
    private Integer id;
    @Column(name = "ESTADO", nullable = false, length = 100, unique = true)
    private String estado;
}
