public class Produto{
    String nome;
    double preco;
    int quantidade_estoque;
  
    public Produto(String nome, double preco, int quantidade_estoque){
      this.nome = nome;
      this.preco = preco;
      this.quantidade_estoque = quantidade_estoque;
    }
  
    public void remover_produtos(int quantidade) {
      if (quantidade > this.quantidade_estoque){
        System.out.println("Quantidade insuficiente!");
      }else{
        this.quantidade_estoque -= quantidade;
        System.out.println("Quantidade removida!");
      }
    }
    public void adicionar_produtos(int quantidade){
      this.quantidade_estoque += quantidade;
      System.out.println("Quantidade adicionada no estoque");
    }
    public void ajustar_preco(double percentual) {
      this.preco += this.preco * (percentual/100);
      System.out.println("Preço atualizado:");
    }
    public void exibir(){
      System.out.println("Produto: " + this.nome
      + "\n Prço: " + this.preco
      + "\n Quantidade em estoque: " + this.quantidade_estoque);
    }
  
  
  }
