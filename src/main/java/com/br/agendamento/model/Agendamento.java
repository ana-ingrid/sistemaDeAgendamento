package com.br.agendamento.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "Agendamentos")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_agendamento;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    private String data_escolhida;
    private String hora_escolhida;
    private Date horario_agendamento;


}
