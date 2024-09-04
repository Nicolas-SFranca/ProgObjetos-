public class FolhadePagamento {
  public static void main(String[] args) {
      Funcionario[] vetor = new Funcionario[]{
          new Funcionario(1, 20, 160, 10),
          new Funcionario(2, 18, 150, 5),
          new Funcionario(3, 22, 170, 8),
          new Funcionario(4, 25, 180, 12),
          new Funcionario(5, 20, 160, 7),
          new Funcionario(6, 19, 165, 6),
          new Funcionario(7, 21, 175, 9),
          new Funcionario(8, 23, 160, 11),
          new Funcionario(9, 20, 155, 4),
          new Funcionario(10, 22, 162, 10),
          new Funcionario(11, 20, 168, 8),
          new Funcionario(12, 17, 158, 3),
          new Funcionario(13, 24, 172, 14),
          new Funcionario(14, 19, 167, 6),
          new Funcionario(15, 21, 169, 7),
          new Funcionario(16, 18, 163, 4),
          new Funcionario(17, 22, 171, 9),
          new Funcionario(18, 20, 159, 5),
          new Funcionario(19, 23, 174, 10),
          new Funcionario(20, 21, 160, 8),
          new Funcionario(21, 19, 155, 2),
          new Funcionario(22, 24, 178, 13),
          new Funcionario(23, 22, 167, 7),
          new Funcionario(24, 18, 164, 4),
          new Funcionario(25, 20, 170, 9),
          new Funcionario(26, 23, 161, 11),
          new Funcionario(27, 21, 173, 6),
          new Funcionario(28, 18, 157, 3),
          new Funcionario(29, 25, 169, 12),
          new Funcionario(30, 19, 162, 5),
          new Funcionario(31, 20, 176, 9),
          new Funcionario(32, 21, 166, 7),
          new Funcionario(33, 17, 158, 4),
          new Funcionario(34, 24, 180, 14),
          new Funcionario(35, 22, 159, 6),
          new Funcionario(36, 20, 175, 8),
          new Funcionario(37, 19, 163, 5),
          new Funcionario(38, 23, 172, 10),
          new Funcionario(39, 21, 168, 9),
          new Funcionario(40, 18, 154, 3),
          new Funcionario(41, 24, 179, 12),
          new Funcionario(42, 22, 165, 5),
          new Funcionario(43, 19, 210, 6),
          new Funcionario(44, 20, 170, 7),
          new Funcionario(45, 21, 156, 8),
          new Funcionario(46, 25, 177, 15),
          new Funcionario(47, 22, 164, 4),
          new Funcionario(48, 19, 158, 3),
          new Funcionario(49, 23, 174, 11),
          new Funcionario(50, 20, 161, 9)
      };

      ordenar(vetor);
      exibir(vetor);
  }

  public static void ordenar(Funcionario[] vetor) {
      for (int x = 0; x < vetor.length; x++) {
          for (int y = x + 1; y < vetor.length; y++) {
              if (vetor[y].calcularSalario() > vetor[x].calcularSalario()) {
                  Funcionario aux = vetor[x];
                  vetor[x] = vetor[y];
                  vetor[y] = aux;
              }
          }
      }
  }

  public static void exibir(Funcionario[] vetor) {
      for (Funcionario funcionario : vetor) {
          funcionario.exibir();
      }
  }
}
