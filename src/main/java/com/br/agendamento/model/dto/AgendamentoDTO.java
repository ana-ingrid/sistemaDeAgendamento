package com.br.agendamento.model.dto;

import com.br.agendamento.model.Agendamento;
import com.br.agendamento.model.Cliente;

import java.util.Date;

public record AgendamentoDTO(Cliente cliente, String data_escolhida, String horario_escolhido, Date horario_agendamento) {

    public AgendamentoDTO(Agendamento agendamento){
        this(agendamento.getCliente(), agendamento.getData_escolhida(), agendamento.getHora_escolhida(), agendamento.getHorario_agendamento());
    }

}
