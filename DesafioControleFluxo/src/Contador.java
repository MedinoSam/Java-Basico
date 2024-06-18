import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("valor do primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("valor do segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }
        catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException{
        
        if (primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException();
        }
        else
        {
             int ocorrencias = segundoParametro - primeiroParametro;
             for (int i = 1; i<= ocorrencias; i++){
                System.out.println("Imprimindo o numero " + i);
            }
        }

        
    }
}
