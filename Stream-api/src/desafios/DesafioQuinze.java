package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioQuinze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean aoMenosUmNegativo = numeros.stream().anyMatch(n -> n < 0);
        if(aoMenosUmNegativo){
            System.out.println("Existe ao menos um numero negativo na lista");
        }
        else{
            System.out.println("Nao existem numeros negativos na lista");
        }
    }
}
