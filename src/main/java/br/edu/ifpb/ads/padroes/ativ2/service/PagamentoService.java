package br.edu.ifpb.ads.padroes.ativ2.service;

import br.edu.ifpb.ads.padroes.ativ2.gateways.PagamentoGateway;
import com.google.inject.Inject;

public class PagamentoService {
    private final PagamentoGateway gateway;

    // A dependência é injetada via construtor
    @Inject
    public PagamentoService(PagamentoGateway gateway) {
        System.out.println("Iniciando PagamentoService com o gateway: " + gateway.getClass().getSimpleName());
        this.gateway = gateway;
    }

    public void pagar(double valor) {
        System.out.println("Serviço de pagamento processando valor de R$ " + valor);
        gateway.processarPagamento(valor);
    }
}
