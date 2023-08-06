package br.com.gntech.imposto;

import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public interface ITipoImposto {

    BigDecimal calcular(Orcamento orcamento);
}
