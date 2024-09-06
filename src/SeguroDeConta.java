public class SeguroDeConta {
    private Conta conta;
    private double valorSeguro;

    public SeguroDeConta(Conta conta, double valorSeguro) {
        this.conta = conta;
        this.valorSeguro = valorSeguro;
    }

    public void protegerConta() {
        if (conta.getSaldo() < 0) {
            System.out.println("Saldo negativo detectado! Aplicando seguro no valor de: " + valorSeguro);
            conta.depositar(valorSeguro);
        } else {
            System.out.println("Sua conta está protegida.");
        }
    }
}
