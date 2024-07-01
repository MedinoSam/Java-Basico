package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioSeis {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean condicao = numeros.stream().anyMatch(n -> n > 10);

        if(condicao){
            System.out.println("Algum elemento da lista eh maior que 10 ");
        }
        else{
            System.out.println("Nenhum elemento da lista eh maior que 10" );
        }
    }
}
