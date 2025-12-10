package Exe3;

import java.util.Scanner;

public class MaiorMenorIgual {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = leitura.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = leitura.nextInt();

        if (num1 == num2) {
            System.out.println("São números iguais");
        } else if (num1 < num2) {
            System.out.println("O número " + num2 + " é maior");
        }else {
            System.out.println("O número " + num1 + " é maior");
        }
    }
}
