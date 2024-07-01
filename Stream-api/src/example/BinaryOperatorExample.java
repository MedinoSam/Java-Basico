package example;
import java.util.Arrays;
import java.util.List;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 8, 14, 18);

        int resultado = numeros.stream().reduce(0, (n1, n2) -> n1+n2);

        System.out.println("A soma total eh: "+ resultado);
    }
}
