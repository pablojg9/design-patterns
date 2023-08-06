package br.com.gntech.imposto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImposto {
    public BigDecimal calcular(Orcamento orcamento, ITipoImposto tipoImposto) {
        return tipoImposto.calcular(orcamento);
    }
}
