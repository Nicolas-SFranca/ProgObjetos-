import java.util.Scanner;

public class CPFverificador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os 9 primeiros dígitos do CPF: ");
        String cpf = scanner.nextLine();

        int[] cpfArray = new int[11];
        for (int i = 0; i < 9; i++) {
            cpfArray[i] = Character.getNumericValue(cpf.charAt(i));
            //Character faz a troca de string para numeros inteiros, necessario para calcular.
        }

        int numero = 0;
        for (int i = 0; i < 9; i++) {
            numero += cpfArray[i] * (10 - i);
        }
        int primeiroN = 11 - (numero % 11);
        cpfArray[9] = (primeiroN >= 10) ? 0 : primeiroN;

        numero = 0;
        for (int i = 0; i < 10; i++) {
            numero += cpfArray[i] * (11 - i);
        }
        int segundoN = 11 - (numero % 11);
        cpfArray[10] = (segundoN >= 10) ? 0 : segundoN;

        System.out.println("O penultimo numero é: " + cpfArray[9] );
        System.out.println("O ultimo numero é: " + cpfArray[10]);
    }
}
