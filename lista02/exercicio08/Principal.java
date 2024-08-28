public class Principal {
  public static void main(String[] args)
  {
    Pedidos p1 = new Pedidos(001, "28/08/2024");

    ItemPedido i1 = new ItemPedido("pc", 10, 5999);
    
    p1.adicionar_item(i1);
    p1.exibir();
    p1.calc_valor_total();
    p1.remover_item("Canetas");
    p1.mostrar();

  }
}
