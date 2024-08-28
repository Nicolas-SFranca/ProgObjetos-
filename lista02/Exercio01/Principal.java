public class Principal {
  public static void main(String[] args) {
      Cliente cliente1 = new Cliente("Aldemir", "123456789-00", "Rua do money");
      Cliente cliente2 = new Cliente("Jair", "222222222-22", "Rua sete de setembro");

      ContaBancaria a1 = new ContaBancaria("140", 1000, cliente1);
      ContaBancaria a2 = new ContaBancaria("343", 2000, cliente2);

      a1.depositar(1000);
      a2.sacar(2000);

      a1.transferir(4000, a2);
  }
}
