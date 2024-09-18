package com.br.agendamento.service;


import com.br.agendamento.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ClienteService {

    private UsuarioRepository usuarioRepository;

}
