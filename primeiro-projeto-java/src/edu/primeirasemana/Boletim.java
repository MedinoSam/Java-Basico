package edu.primeirasemana;
public class Boletim {

    public static void main(String[] args) {
        int mediaFinal = 6;
        if(mediaFinal < 6)
            System.out.println("REPROVADO");
        else if(mediaFinal == 6)
            System.out.println("RECUPERACAO");
        else
            System.out.println("APROVADO");
    }
}
