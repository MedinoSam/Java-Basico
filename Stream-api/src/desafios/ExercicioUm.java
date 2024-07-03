package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();

        int quantidadeTransacoes = scanner.nextInt();

        List<String> transacoes = new ArrayList<>();

        for(int i = 1; i <= quantidadeTransacoes; i++){

            char tipoTransacao = scanner.next().toUpperCase().charAt(0);
            double valorTransacao = scanner.nextDouble();

            if(tipoTransacao == 'D'){
                saldoInicial += valorTransacao;
                transacoes.add("Deposito de " + valorTransacao);
            }
            else if(tipoTransacao == 'S'){
                saldoInicial -= valorTransacao;
                transacoes.add("Saque de " + valorTransacao);
            }
            else{
                System.out.println("Opção inválida. Utilize D para depósito ou S para saque.");
                i--;
            }
        }
        System.out.println("Saldo: "+ saldoInicial+ "\nTransacoes:");

        for(int i = 0; i< transacoes.size(); i++){
            System.out.println((i+1) + ". " + transacoes.get(i));
        }

        scanner.close();

    }
}
