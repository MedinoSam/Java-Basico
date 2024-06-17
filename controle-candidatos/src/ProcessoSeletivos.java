import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;

public class ProcessoSeletivos {
    public static void main(String[] args) {
        /* Scanner scan = new Scanner(System.in);
        System.out.println("salario pretendido: ");
        double salarioPretendido = scan.nextDouble();
        analisarCandidatos(salarioPretendido); */
        
        ArrayList<String> candidatoSelecionados = selecaoCandidatos();
        imprimirSelecionados(candidatoSelecionados);
    }

    public static ArrayList selecaoCandidatos(){
        ArrayList<String> candidatoSelecionado = new ArrayList<>();

        String[] candidatos = {"Alice", "Bruno", "Carla", "Daniel", "Elisa", "Fernando", "Gabriela", "Henrique", "Isabela", "Jorge"};
        int totalCandidatos = 0;
        double salarioBase = 2000;
        for (int i = 0; i< candidatos.length && totalCandidatos < 5; i++){
            String canndidatoAtual = candidatos[i];
            double salaroCandidatoAtual = valorPretendido();
            System.out.println("o candidato " + canndidatoAtual + " pretende receber " + salaroCandidatoAtual);
            if (salaroCandidatoAtual <= salarioBase){
                System.out.println("o candidato "+ canndidatoAtual + " foi selecionado para vaga");
                candidatoSelecionado.add(canndidatoAtual);
                totalCandidatos++;
            }
        }
        return candidatoSelecionado;
    }

    public static void imprimirSelecionados(ArrayList<String> candidatoSelecionado){

        for (String candidato : candidatoSelecionado) {
            System.out.println(candidato);
        }
    }
    
    public static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    public static void analisarCandidatos(double salarioPretendido){
        double salarioBase = 2000;
        if (salarioPretendido < salarioBase){
            System.out.println("LIGAR PARA O CANDITADO");
        }
        else if(salarioPretendido == salarioBase){
            System.out.println("LIGAR PARA O CANDITADO COM CONTRAPROPOSTA");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
