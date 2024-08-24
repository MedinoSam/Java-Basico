import java.util.Scanner;

public class VelocidadeMediaConexao {

    // Função para calcular a velocidade média de conexão de internet
    public static double calcularVelocidadeMedia(String[] velocidades) {
        int soma_total = 0;
        int i = 0;
        while (i != velocidades.length){
            soma_total += Integer.parseInt(velocidades[i]);
            i++;
        }


        // TODO: Some todas as velocidades registradas e calcule a média
        return (double) soma_total/velocidades.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Calculando a velocidade média de conexão
        double velocidadeMedia = calcularVelocidadeMedia(velocidades);

        // Exibindo a velocidade média de conexão
        System.out.println((int)velocidadeMedia + " Mbps");

        scanner.close();
    }
}