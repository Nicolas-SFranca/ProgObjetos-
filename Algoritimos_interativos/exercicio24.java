public class numeroperfeito {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 1;
        int menor = 0;

        while (contador < 10) {
            if (ehPerfeito(numero)) {
                System.out.println("O menor número perfeito é: " + menor);
                System.out.println("Número perfeito:" + numero);
                contador++;
                if (contador == 1) {
                    menor = numero; 
                } else if (numero < menor) {
                    menor = numero;
                }
            }
            numero++;
        }

    }
    public static boolean ehPerfeito(int numero) {
        int soma = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma == numero;
    }
}
