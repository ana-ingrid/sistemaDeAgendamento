package com.br.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_agendamento;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "profissional_id")
    private Profissional profissional;

    @OneToOne(mappedBy = "agendamento", cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    private Pagamento pagamento;

    @ManyToOne
    @JoinColumn(name = "servico_id")
    private Servico servico;

    private Date data_escolhida;
    private Timestamp hora_escolhida;
    private Date horario_agendamento;

}
