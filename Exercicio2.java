package lista;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n, cont;
        cont = 0;
        do {
            System.out.println("Informe um número");
            n = leia.nextInt();
            cont++;
        } while (n >= 0);
        System.out.println("Quantidade de númeos positivos " + cont);
    }
}
