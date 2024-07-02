package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DesafioQuatorze {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> maiorPrimo = numeros.stream().filter(n -> n % 2 !=0).max(Comparator.naturalOrder());
        System.out.println("maior numero primo da lista: "+ maiorPrimo);
        
    }
}
