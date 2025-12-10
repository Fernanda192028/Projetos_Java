package Exe3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leitura.nextInt();

        System.out.printf("#### Tabuada do %d ####\n", num);
        for (int i = 1; i <= 10 ; i++) {
           int resul =  num * i;

            System.out.printf("%d x %d =  %d\n",num,i,resul);
        }
    }
}
