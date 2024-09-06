public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        // Testando Cartão de Crédito
        CartaoDeCredito cartao = new CartaoDeCredito(venilton, 500);
        cartao.fazerCompra(200);
        cartao.pagarFatura(100, cc);

        // Testando Seguro de Conta
        SeguroDeConta seguro = new SeguroDeConta(cc, 50);
        cc.sacar(300);  // Cria saldo negativo
        seguro.protegerConta();  // Aplica o seguro

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
