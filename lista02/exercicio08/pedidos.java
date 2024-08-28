import java.util.ArrayList;
import java.util.List;

public class Pedidos{
  int numero;
  String data;
  List<ItemPedido> lista;

  public Pedidos(int numero, String data){
    this.numero = numero;
    this.data = data;
    this.lista = new ArrayList<>();
  }
  public void calc_valor_total(){
    double valor_total = 0;
    for(int i = 0; i < lista.size(); i++){
      valor_total += this.lista.get(i).quantidade * this.lista.get(i).preco;
    }
    System.out.println("Valor total do pedido: " + valor_total);
  }

  public void adicionar_item(ItemPedido novo_item){
    this.lista.add(novo_item);
    System.out.println("Item adicionado com sucesso!");
  }

  public void remover_item(String intem_remover){
    for(int i = 0; i < lista.size(); i++){
      if(this.lista.get(i).produto == intem_remover){
        this.lista.remove(i);
        System.out.println("Item removido com sucesso!");
        return;
      }
    }
    System.out.println(" Não encontrado o  iten!");
  }

  public void exibir(){
    if (lista.size() == 0){
      System.out.println("Nenhum item  encontrado!");
    }
    for(int i = 0; i < lista.size(); i++){
      System.out.println("\nProduto: " + this.lista.get(i).produto + 
      "\nQuantidade: " + this.lista.get(i).quantidade + 
      "\nPreco: " + this.lista.get(i).preco);
      }
    }

  
}
