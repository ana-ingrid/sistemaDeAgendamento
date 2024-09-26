package com.br.agendamento.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer usuarioId;

    private String nome;
    private String email;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "codigo_pessoa", unique = true)
    private String codigoPessoa;
}
