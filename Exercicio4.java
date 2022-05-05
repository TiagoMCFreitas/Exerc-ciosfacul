package lista;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            int n;

            System.out.println("Digite um número de 1 a 5: ");
            n = leia.nextInt();
            while (n < 1 || n > 5) {
                System.out.println("Entrada inválida, Digite um número de 1 a 5: ");
                n = leia.nextInt();
            }

            if (n >= 1 || n <= 5) {
                System.out.println("Parabéns, o número digitado é: " + n);
            }
        }

    }
}
