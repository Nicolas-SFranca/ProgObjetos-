public class exerc25 {
    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;
        int[] primos = new int[3];
        int indice = 0;

        while (contador < 100) {
            if (primo(numero)) {
                primos[indice % 3] = numero;
                indice++;
                if (indice >= 3) {
                    int numeroPiramidal = primos[0] + primos[1] + primos[2];
                    System.out.println(primos[0] + " + " + primos[1] + " + " + primos[2] + " = " + numeroPiramidal);
                    contador++;
                }
            }
            numero++;
        }
    }

    public static boolean primo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    }

