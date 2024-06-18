import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = scan.nextDouble();
        double saque = scan.nextDouble();
        if (saque > saldo ){
            if (saque - saldo <= 500){
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            }
            else{
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }
        else{
            System.out.println("Transação realizada com sucesso.");
        }
       
        scan.close();
    }
}
