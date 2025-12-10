package Exe3;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int num = leitura.nextInt();

        if (num % 2 == 0) {
            System.out.println("Esse número é par");
        } else {
            System.out.println("Esse número é ímpar");
        }
    }
}
