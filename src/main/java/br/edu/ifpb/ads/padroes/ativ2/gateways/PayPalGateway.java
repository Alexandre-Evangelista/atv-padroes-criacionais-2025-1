package br.edu.ifpb.ads.padroes.ativ2.gateways;

import br.edu.ifpb.ads.padroes.ativ2.sdk.PayPalSDK;
import com.google.inject.Inject;

public class PayPalGateway implements PagamentoGateway {
    private final PayPalSDK payPalSDK;

    @Inject
    public PayPalGateway(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void processarPagamento(double valor) {
        payPalSDK.sendPayment(valor);
    }
}
