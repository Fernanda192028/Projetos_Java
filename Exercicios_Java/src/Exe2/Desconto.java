package Exe2;

public class Desconto {
    public static void main(String[] args){
        double precoOriginal = 100;
        double percentualDesconto = 10;

        System.out.print("O novo preço é " + (precoOriginal - precoOriginal * (percentualDesconto/100)));

    }
}
