package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DesafioCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQueCinco = numeros.stream().filter(n -> n > 5).collect(Collectors.toList());

        long tamanhoList = maioresQueCinco.stream().count();

        long media = maioresQueCinco.stream().reduce(0, (a,b) -> a+b)/tamanhoList;

        System.out.println("A media dos elementos maiores que cinco eh: " + media);
    }
}
