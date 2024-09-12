package com.br.agendamento.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario;

    private String nome;
    private String email;
    private Date data_nascimento;
    private String codigo_pessoa;
}
