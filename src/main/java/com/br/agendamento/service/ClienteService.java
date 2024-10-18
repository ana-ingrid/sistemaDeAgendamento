package com.br.agendamento.service;


import com.br.agendamento.config.ModelMapperConfig;
import com.br.agendamento.exceptions.ClienteCadastradoException;
import com.br.agendamento.model.Cliente;
import com.br.agendamento.model.dtos.CadastraClienteDTO;
import com.br.agendamento.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class ClienteService {


    public ModelMapper modelMapper;

    private UsuarioRepository usuarioRepository;

}

