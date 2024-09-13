package com.br.agendamento.model.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumStatusPagamento {

    AGUARDANDO_PAGAMENTO("Aguardando pagamento"),
    PAGAMENTO_APROVADO("Pagamento aprovado"),
    PAGAMENTO_RECUSADO("Pagamento recusado");

    private String descricao;

}
