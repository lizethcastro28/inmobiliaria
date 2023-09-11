package com.inmobiliaria.bondplant.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Lizeth Castro
 */
@Getter
@Setter
@Entity
@Table(name = "OFICINAS")
public class Oficina {

    @Id
    @Column(name = "ID_OFICINA")
    private String id;

    @Column(name = "NOMBRE", nullable = false, length = 100, unique = true)
    private String nombre;

    @Column(name = "TELEFONO", nullable = false, length = 13)
    private String telefono;

    @Column(name = "EMAIL", nullable = false, length = 30)
    @Email
    private String email;
    @Column(name = "TIPO_OFICINA")
    private boolean principal;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "WEB", length = 60)
    private String web;
    @ManyToOne
    private Estado estado;

}
