public class CartaoDeCredito {
    private double limite;
    private double saldoUtilizado;
    private Cliente cliente;

    public CartaoDeCredito(Cliente cliente, double limite) {
        this.cliente = cliente;
        this.limite = limite;
        this.saldoUtilizado = 0;
    }

    public void fazerCompra(double valor) {
        if (valor <= (limite - saldoUtilizado)) {
            saldoUtilizado += valor;
            System.out.println("Compra realizada no valor de: " + valor);
        } else {
            System.out.println("Limite insuficiente.");
        }
    }

    public void pagarFatura(double valor, Conta conta) {
        if (valor <= conta.getSaldo()) {
            conta.sacar(valor);
            saldoUtilizado -= valor;
            System.out.println("Fatura paga no valor de: " + valor);
        } else {
            System.out.println("Saldo insuficiente na conta.");
        }
    }

    public double getSaldoUtilizado() {
        return saldoUtilizado;
    }

    public double getLimiteDisponivel() {
        return limite - saldoUtilizado;
    }
}
