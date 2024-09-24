package com.br.agendamento.resource;

import com.br.agendamento.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cadastro")
@AllArgsConstructor
public class ClienteController {

    protected final ClienteService clienteService;

}
