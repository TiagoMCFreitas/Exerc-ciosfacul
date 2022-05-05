package lista;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n, cont, cont1;
        cont1 = 0;
        cont = 0;

        do {
            System.out.println("Forneça um número, para encerrar, digite (0) ");
            n = leia.nextInt();
            while (n < 0) {
                System.out.println("Número inválido, forneça outro: ");
                n = leia.nextInt();
            }
            if (n % 2 == 0) {
                cont++;
            } else {
                cont1++;
            }

        } while (n > 0);
        System.out.println("A quantidade de números ímpares são " + cont1);
        System.out.println("A quantidade de números pares são " + cont);

    }
}
