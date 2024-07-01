package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioTres {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean maiorQueZero = numeros.stream().allMatch(n -> n > 0);
        if(maiorQueZero){
            System.out.println("Todos os elementos da lista sao maiores que 0");
        }
        else{
            System.out.println("Algum elemento da lista eh menor que 0");
        }
    }
}
