package br.com.gntech;

import br.com.gntech.imposto.CalculadoraImposto;
import br.com.gntech.imposto.ICMS;
import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        System.out.println(calculadoraImposto.calcular(orcamento, new ICMS()));
    }
}
