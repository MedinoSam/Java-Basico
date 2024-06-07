import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência !");  
        String agencia = scanner.next();
        System.out.println("Por favor, digite o seu nome !");  
        String nome = scanner.next();
        System.out.println("Por favor, digite o seu sobrenome !");  
        String sobrenome = scanner.next();
        System.out.println("Por favor, digite o seu  número !");  
        int numero = scanner.nextInt();
        System.out.println("Por favor, digite o seu saldo !");  
        double saldo = scanner.nextDouble();
        String nomeCompleto = completarNome(nome, sobrenome);
        System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque");


        
    }

    public static String completarNome(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
