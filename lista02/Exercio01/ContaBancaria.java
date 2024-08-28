public class ContaBancaria {
    String numerodaconta;
    double saldo;
    Cliente cliente;

    public ContaBancaria(String numeroConta, double saldo, Cliente cliente) {
        this.numerodaconta = numeroConta;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public void mostrar() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    public void depositar(double valor) {
        this.saldo += valor;
        mostrar();
    }

    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Não há saldo suficiente!!!");
        } else {
            this.saldo -= valor;
            mostrar();
        }
    }

    public void transferir(double valor, ContaBancaria receber) {
        if (valor > this.saldo) {
            System.out.println("Não há saldo suficiente!!!");
        } else {
            this.saldo -= valor;
            receber.depositar(valor);
            System.out.println("TRANSFERÊNCIA REALIZADA COM SUCESSO!");
        }
    }
}



