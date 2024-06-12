import java.util.Locale;
import java.util.Scanner;



public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu saldo?: ");
        int saldo = scanner.nextInt();
        System.out.println("Quanto deseja sacar?: ");
        int valorDesejado = scanner.nextInt();
        int saldoFinal;
        if(valorDesejado <= saldo){
            saldoFinal = saldo - valorDesejado;
            System.out.println("saque efetuado com sucesso!\nsaldo final = " + saldoFinal);
        }
        else
            System.out.println("saldo insuficiente!");
        
    }
}
