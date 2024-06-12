import java.util.Locale;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("quer contar ate quanto?: ");
        int valor = scanner.nextInt();
        int inicio = 0;
        while(inicio <= valor){

            System.out.println("contando "+ inicio);


            inicio++;
        }
    }
}
