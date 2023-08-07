package br.com.gntech.desconto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoOrcamentoComValorMaiorQuinhentos extends Desconto {

    public DescontoOrcamentoComValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
