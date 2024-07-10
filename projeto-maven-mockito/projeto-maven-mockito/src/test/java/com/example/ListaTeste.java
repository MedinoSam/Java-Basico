package com.example;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.Mock;
import org.mockito.Mockito;

@ExtendWith(MockitoExtension.class)
public class ListaTeste {

    @Mock
    private List<String> letras;

    @Test
    public void adicionarItemNaLista(){
        Mockito.when(letras.get(0)).thenReturn("b");

        Assertions.assertEquals("b", letras.get(0));
    }
    
}