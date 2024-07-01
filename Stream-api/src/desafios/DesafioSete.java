package desafios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class DesafioSete {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> optionalMaiorElemento = numeros.stream().max(Comparator.naturalOrder());

        Integer maiorElemento = optionalMaiorElemento.orElse(null);

        Optional<Integer> optionalSegundoMaiorelemento = numeros.stream().filter(n -> n != maiorElemento).max(Comparator.naturalOrder());

        Integer segundoMaiorElemento = optionalSegundoMaiorelemento.orElse(null);

        System.out.println("O segundo maior elemento eh: " + segundoMaiorElemento);

        /* Optional<Integer> outraFormaSegundoMaior = numeros.stream()
        .distinct() // Remove duplicatas para garantir que o segundo maior seja único
        .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
        .skip(1) // Pula o primeiro elemento (o maior)
        .findFirst(); // Pega o segundo elemento (o segundo maior)

        Integer outroJeitoSegundoMaior = outraFormaSegundoMaior.orElse(null);

        System.out.println("O segundo maior elemento eh: " + outroJeitoSegundoMaior); */
    }
}
