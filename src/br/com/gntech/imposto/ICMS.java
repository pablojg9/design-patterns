package br.com.gntech.imposto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS implements ITipoImposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
