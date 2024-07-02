package desafios;

import java.util.Arrays;
import java.util.List;

public class DesafioOito {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDigitos = numeros.stream().mapToInt(DesafioOito::retornaDigitos).sum();

        System.out.println("O total de digitos da lista eh: "+ somaDigitos);
    }




    public static int retornaDigitos(int numero) {
        int cont = 0;
        while (numero != 0) {
            numero = numero / 10; // Adiciona o último dígito ao total
            cont++; // Remove o último dígito do número
        }
        return cont;
    }
}
