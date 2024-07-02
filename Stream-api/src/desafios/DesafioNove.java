package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioNove {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean distintos  = numeros.stream().distinct().count() == numeros.size();

        if(distintos){
            System.out.println("Nao existe numeros repetidos na lista");
        }
        else
        {
            System.out.println("Existem numeros repetidos na lista");
        }

    }
}
