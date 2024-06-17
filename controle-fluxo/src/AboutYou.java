import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AboutYou {
    public static void main(String[] args) {
        try{

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é: "+ altura);
        scanner.close();
        } 
        catch(InputMismatchException e){
            System.out.println("Idade e altura precisam ser numericos");
        }
    }
}
