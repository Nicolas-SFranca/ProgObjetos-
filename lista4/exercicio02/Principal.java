public class Principal {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        
        
        c1.setTitular("LOGAN");
        c1.setSaldo(1000.00);
        c1.setNumeroConta(2020);
        c1.setPreco(18000.00);
        c1.Sacar(500);
        c1.Depositar(150);
        

        c1.exibir();
    }    
}
