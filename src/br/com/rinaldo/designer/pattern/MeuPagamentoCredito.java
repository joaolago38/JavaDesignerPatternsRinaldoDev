package br.com.rinaldo.designer.pattern;

import java.math.BigDecimal;

public class MeuPagamentoCredito {
    SdkPagamentoCredito sdkPagamentoCredito = new SdkPagamentoCredito();

    public void debitar(BigDecimal valor) {
        sdkPagamentoCredito.autorizar(valor);
        sdkPagamentoCredito.capturar(valor);
    }

    public void creditar(BigDecimal valor) {
        sdkPagamentoCredito.creditar(valor);
    }
}
