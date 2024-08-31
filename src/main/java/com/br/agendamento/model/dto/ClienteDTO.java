package com.br.agendamento.model.dto;

import com.br.agendamento.model.Cliente;

import java.util.Date;

public record ClienteDTO(String nome_cliente, String email_cliente, Date data_nascimento, String codigo_pessoa) {

    public ClienteDTO(Cliente cliente){
        this(cliente.getNome_cliente(), cliente.getEmail_cliente(), cliente.getData_nascimento(), cliente.getCodigo_pessoa());
    }

}
