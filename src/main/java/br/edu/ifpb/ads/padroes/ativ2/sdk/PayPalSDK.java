package br.edu.ifpb.ads.padroes.ativ2.sdk;

public class PayPalSDK {
    public void sendPayment(double amount) {
        System.out.printf("PayPal: Pagamento de R$ %.2f realizado com sucesso.\n", amount);
    }
}
