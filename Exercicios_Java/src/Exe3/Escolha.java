package Exe3;

import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("""
                ############ Escolha uma opção ############ 
                
                       1. Calcular área do quadrado
                       2. Calcular área do círculo
                Digite:
                """);
        int escolha = leitura.nextInt();

        if(escolha == 1){
            System.out.println("Digite o tamanho do lado do quadrado:");
            double lado = leitura.nextDouble();

            double area = lado*lado;

            System.out.println("A área do quadrado é " + area);
        } else{
            System.out.println("Digite o raio do círculo:");
            double raio = leitura.nextDouble();

            double area2 = 3.14*raio*raio;

            System.out.println("A área do círculo é " + area2);
        }
    }
}
