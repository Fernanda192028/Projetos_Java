package Exe3;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = leitura.nextInt();

        if (num >= 0){
            System.out.println("Número positivo");
        }else{
            System.out.println("Número negativo");
        }
    }
}
