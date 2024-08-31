package com.br.agendamento.resource;

import com.br.agendamento.model.dto.ClienteDTO;
import com.br.agendamento.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/agendamento")
public class ClienteController {

    @Autowired
    protected ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteDTO>> listaClientes() {
        return ResponseEntity.ok(clienteService.listaClientes());
    }

}
