public class Principal {
    public static void main(String[] args)
    {
      Produto p1 = new Produto("meia", 5.50, 50);
      p1.adicionar_produtos(10);
      p1.exibir();

      p1.remover_produtos(5);
      p1.exibir();

      p1.ajustar_preco(100);
      p1.exibir();


    }
}
