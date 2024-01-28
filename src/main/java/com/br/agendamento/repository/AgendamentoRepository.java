package com.br.agendamento.repository;

import com.br.agendamento.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Integer> {
}
