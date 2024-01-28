package com.br.agendamento.repository;

import com.br.agendamento.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {



}
