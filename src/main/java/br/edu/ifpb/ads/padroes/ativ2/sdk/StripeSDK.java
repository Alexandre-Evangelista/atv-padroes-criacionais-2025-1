package br.edu.ifpb.ads.padroes.ativ2.sdk;

public class StripeSDK {
    public void charge(double amount) {
        System.out.printf("Stripe: Cobrança de R$ %.2f efetuada com sucesso.\n", amount);
    }
}
