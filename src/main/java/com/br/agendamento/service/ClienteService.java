package com.br.agendamento.service;


import com.br.agendamento.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import lombok.NoArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteService {


    public ModelMapper modelMapper;

    private UsuarioRepository usuarioRepository;

}

