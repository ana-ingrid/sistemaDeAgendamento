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

    @Column(name = "data_escolhida")
    private Date dataEscolhida;

    @Column(name = "hora_escolhida")
    private Timestamp horaEscolhida;

    @Column(name = "horario_agendamento")
    private Date horarioAgendamento;

}
