import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double limiteDiario = scan.nextDouble();
        while (limiteDiario >= 0) {
            double valorSaque = scan.nextDouble();
            if (valorSaque == 0){
                System.out.println("Transacoes encerradas.");
                break;
            }
            else if(valorSaque > limiteDiario){
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            }
            else{
                limiteDiario -= valorSaque;
                System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
            }
        }
        scan.close();
    }
}
