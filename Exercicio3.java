package lista;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner leia = new Scanner(System.in)) {
            int n1, n2;

            do {
                System.out.println("Informe o primeiro número ");
                n1 = leia.nextInt();
                System.out.println("Informe o segundo número ");
                n2 = leia.nextInt();
            } while (n1 > n2);

            do {

                n1 = n1 + 1;
                System.out.println(":" + n1);

            } while (n1 < n2);
        }

    }
}
