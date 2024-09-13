package com.br.agendamento.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumTipoPagamento {

    DEBITO("Débito"),
    CREDITO("Crédito"),
    BOLETO("Boleto");

    private String descricao;

}
