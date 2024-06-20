package enums;

public enum EstadoBrasileiro {

    ALAGOAS ("Alagoas", "AL",82),
    SAO_PAULO ("Sao Paulo", "SP",11),
    PERNAMBUCO ("Pernambuco", "PE",81);  

    private String nome;
    private String sigla;
    private int ddd;
    
    private EstadoBrasileiro(String nome, String sigla, int ddd){
        this.sigla = sigla;
        this.nome = nome;
        this.ddd = ddd;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getDdd() {
        return ddd;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
