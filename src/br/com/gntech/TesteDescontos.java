package br.com.gntech;

import br.com.gntech.desconto.CalculadoraDesconto;
import br.com.gntech.imposto.CalculadoraImposto;
import br.com.gntech.imposto.ICMS;
import br.com.gntech.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDesconto calculadoraImposto = new CalculadoraDesconto();
        System.out.println(calculadoraImposto.calcular(orcamento));
        System.out.println(calculadoraImposto.calcular(orcamentoSegundo));
    }
}
