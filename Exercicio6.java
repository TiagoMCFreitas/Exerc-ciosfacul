package lista;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int senhacadastrada = 42312;
        int senha;
        int cont = 1;
        System.out.println("Informe a senha cadastrada: ");
        senha = leia.nextInt();

        if (senha != senhacadastrada) {

            do {

                System.out.println("Senha invalida, digite a senha correta: ");
                senha = leia.nextInt();
                cont++;
                while (cont == 3) {
                    System.out.println("A sua conta foi bloqueada (pressione (0) para sair) ");
                    cont = leia.nextInt();
                    do {
                        System.out.println("Digite apenas (0), Digite novamente: ");
                        cont = leia.nextInt();

                    } while (cont != 0);

                    do {
                        System.out.println("Informe a senha cadastrada: ");
                        senha = leia.nextInt();

                    } while (cont != 0);

                }

            } while (senhacadastrada != senha);

            System.out.println("Parabéns, você acessou a sua conta");
        }
    }
}