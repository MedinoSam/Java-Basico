import java.util.Scanner;

public class VerificarElegibilidadeConta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idade = scan.nextInt();
        if(idade >= 18){
            System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }
        else{
            System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }
        scan.close();
    }
}
