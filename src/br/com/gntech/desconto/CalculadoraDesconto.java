package br.com.gntech.desconto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoOrcamentoComMaisCincoItens(
                new DescontoOrcamentoComValorMaiorQuinhentos(
                        new SemDesconto()));
        return cadeiaDeDescontos.calcular(orcamento);
    }
}
