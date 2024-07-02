package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioDezesseis {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
        System.out.println("Lista numeros pares: "+ numerosPares);
        System.out.println("Lista numeros impares: "+ numerosImpares);
        
    }
}
