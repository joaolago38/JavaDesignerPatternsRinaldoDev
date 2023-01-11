package br.com.rinaldo.designer.pattern;

import java.math.BigDecimal;

public class Adapter_1 {
    public static void main(String[] args) {
        MeuPagamentoCredito credito = new MeuPagamentoCredito();
        credito.debitar(new BigDecimal("100"));
    }
}
