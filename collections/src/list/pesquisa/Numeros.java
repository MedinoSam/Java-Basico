package list.pesquisa;

public class Numeros {
    private int numero;

    public Numeros(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String toString() {
        return "\nValor: "+ numero;
    }

}
