package br.edu.ifpb.ads.padroes.ativ2.DI;

import br.edu.ifpb.ads.padroes.ativ2.gateways.PagamentoGateway;
import com.google.inject.AbstractModule;

public class PagamentoModule extends AbstractModule {

    private final Class<? extends PagamentoGateway> gatewayClass;

    public PagamentoModule(Class<? extends PagamentoGateway> gatewayClass) {
        this.gatewayClass = gatewayClass;
    }

    @Override
    protected void configure() {
        bind(PagamentoGateway.class).to(this.gatewayClass);
    }
}
