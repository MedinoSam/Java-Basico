package enums;

public class SistemaEstados {
    public static void main(String[] args) {
        for(EstadoBrasileiro e : EstadoBrasileiro.values()){
            System.out.println(e.getNome() + " - " + e.getSigla() + " - " + e.getDdd());
        }
        
        EstadoBrasileiro eb = EstadoBrasileiro.ALAGOAS;
        System.out.println(eb.getNomeMaiusculo());
    }
}
