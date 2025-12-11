import java.util.Scanner;

public class ContaBancaria {
     public static void main(String[] args){
         Scanner leitura = new Scanner(System.in);
         double saldo_inicial = 25000;
         int escolha = 0;

          String DadosCliente = """ 
                 ***********************
                 Dados iniciais do cliente:
                 
                 Nome: Noah Oliveira
                 Tipo conta: Corrente
                 Saldo inicial: R$ 2500,00
                 ***********************
              """;

         System.out.println(DadosCliente);

          String Menu = """
                 
                 Operações
                 
                 1- Consultar saldos
                 2- Receber valor
                 3- Transferir valor
                 4- Sair
                 
                 Digite a opção desejada:""";


          while (escolha != 4 ) {
              System.out.println(Menu);
              escolha = leitura.nextInt();

             if (escolha == 1 ) {
                 System.out.println("O saldo atual é R$" + saldo_inicial);

             }else if (escolha == 2){

                 System.out.println("Informe o valor a receber:");
                 double receber = leitura.nextDouble();
                 saldo_inicial += receber;
                 System.out.println("Saldo atualizado R$ " + saldo_inicial);


             }else if (escolha == 3 ) {
                 System.out.println("Informe o valor que deseja transferir:");
                 double transferir = leitura.nextDouble();
                 if (transferir > saldo_inicial) {
                     System.out.println("Não há saldo suficiente para fazer essa transferência!");

                 } else {
                     saldo_inicial -= transferir;
                     System.out.println("O saldo atualizado R$ " + saldo_inicial);
                 }
             }else {
                 System.out.println("Opção inválida");

             }
         }
         System.out.println("Você saiu!");
     }
}
