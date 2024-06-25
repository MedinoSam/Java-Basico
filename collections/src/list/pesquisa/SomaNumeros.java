package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numeros> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(new Numeros(numero));
    }

    public int calcularSoma(){
        int soma = 0;
        if(!numerosList.isEmpty()){
            for(Numeros n : numerosList){
                soma += n.getNumero();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maior = -9999999;
        if(!numerosList.isEmpty()){
            for(Numeros n : numerosList){
                if (n.getNumero() > maior){
                    maior = n.getNumero();
                }
            }
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = 9999999;
        if(!numerosList.isEmpty()){
            for(Numeros n : numerosList){
                if (n.getNumero() < menor){
                    menor = n.getNumero();
                }
            }
        }
        return menor;
    }

    public void exibirNumeros(){
        System.out.println(numerosList);
    }

    public static void main(String[] args) {
        SomaNumeros valor = new SomaNumeros();

        valor.exibirNumeros();
        valor.adicionarNumero(54);
        valor.adicionarNumero(45);
        valor.exibirNumeros();
        System.out.println(valor.calcularSoma());
        System.out.println(valor.encontrarMaiorNumero());
        System.out.println(valor.encontrarMenorNumero());
        
    }
}
