package br.edu.ifpb.ads.padroes.ativ2.gateways;


import br.edu.ifpb.ads.padroes.ativ2.sdk.StripeSDK;
import com.google.inject.Inject;

public class StripeGateway implements PagamentoGateway {
    private final StripeSDK stripeSDK;

    @Inject
    public StripeGateway(StripeSDK stripeSDK) {
        this.stripeSDK = stripeSDK;
    }

    @Override
    public void processarPagamento(double valor) {
        stripeSDK.charge(valor);
    }
}