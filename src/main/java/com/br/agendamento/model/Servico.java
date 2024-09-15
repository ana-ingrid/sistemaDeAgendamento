package com.br.agendamento.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id_servico;

    @ManyToMany
    @JoinTable(name = "profissional_servico",
    joinColumns = @JoinColumn(name = "servico_id"),
    inverseJoinColumns = @JoinColumn(name = "profissional_id"))
    List<Profissional> profissionais;

    private String nome_servico;
    private String descricao;
    private double valor;

}
