import java.util.Scanner;

public class OperacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        
        while(continuar){
            int opcao = scan.nextInt();

            switch(opcao){
                case 1:
                    /* System.out.println("Valor a depositar: "); */
                    double valorDepositar = scan.nextDouble();
                    saldo += valorDepositar;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                   
                    break;
                case 2:
                /* System.out.println("Valor a sacar: "); */
                double valorSacar = scan.nextDouble();
                if (saldo >= valorSacar){
                    saldo -= valorSacar;
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    
                }
                else{
                    System.out.println("Saldo insuficiente.");
                }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scan.close();
    }
}
