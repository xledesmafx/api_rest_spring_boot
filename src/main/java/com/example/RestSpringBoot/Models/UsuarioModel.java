package com.example.RestSpringBoot.Models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")  //--> NOMBRE QUE SE VA PONER EN LA BASE DE DATOS
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    private String nombre;
    private String email;
    private Integer prioridad;
}
