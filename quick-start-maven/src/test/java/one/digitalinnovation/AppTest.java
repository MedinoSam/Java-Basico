package one.digitalinnovation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest 
{
    @Test
     void testHelloWorld()
    {
        assertEquals("Hello World!", getGreeting());
    }

    public String getGreeting()
    {
        return "Hello World!";
    }

    @Test
     void validarLancamento(){
        int[] listaUm = {1,2,3,4,5};
        int[] listaDois = {1,2,4,5,3};
        Assertions.assertArrayEquals(listaUm, listaDois);
    }
}