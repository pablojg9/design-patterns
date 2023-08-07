package br.com.gntech.desconto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoComMaisCincoItens extends Desconto {

    public DescontoOrcamentoComMaisCincoItens(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuatidadeItens() > 5;
    }
}
