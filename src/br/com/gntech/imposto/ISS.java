package br.com.gntech.imposto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements ITipoImposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
