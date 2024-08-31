package com.br.agendamento.service;


import com.br.agendamento.model.dto.ClienteDTO;
import com.br.agendamento.repository.AgendamentoRepository;
import com.br.agendamento.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    protected AgendamentoRepository agendamentoRepository;

    @Autowired
    protected ClienteRepository clienteRepository;


    public List<ClienteDTO> listaClientes() {
        return clienteRepository.findAll().stream().map(ClienteDTO::new).toList();
    }


}
