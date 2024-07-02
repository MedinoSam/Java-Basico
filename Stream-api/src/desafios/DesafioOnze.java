package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioOnze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream().map(n -> n*n).reduce(0, (a,b) -> a+b);

        System.out.println("A soma dos quadrados dos elementos na lista eh: "+ soma);
    }
}
