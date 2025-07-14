package br.edu.ifpb.ads.padroes.ativ2.gateways;

import br.edu.ifpb.ads.padroes.ativ2.sdk.PagSeguroSDK;
import com.google.inject.Inject;

public class PagSeguroGateway implements PagamentoGateway {
    private final PagSeguroSDK pagSeguroSDK;

    @Inject
    public PagSeguroGateway(PagSeguroSDK pagSeguroSDK) {
        this.pagSeguroSDK = pagSeguroSDK;
    }

    @Override
    public void processarPagamento(double valor) {
        pagSeguroSDK.realizarCobranca(valor);
    }
}
