package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros(){
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente(){
         List<Numero> numeroCrescente = new ArrayList<>(numeroList);
         Collections.sort(numeroCrescente);

         return numeroCrescente;

    }

    public List<Numero> ordenarDescedente(){
        List<Numero> numeroDecrescente = new ArrayList<>(numeroList);
        Collections.sort(numeroDecrescente, Collections.reverseOrder());
        return numeroDecrescente;

   }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
          OrdenacaoNumeros ordenacaoNumero = new OrdenacaoNumeros();
      
          // Adicionando numeros à lista
          ordenacaoNumero.adicionarNumero(21);
          ordenacaoNumero.adicionarNumero(32);
          ordenacaoNumero.adicionarNumero(145);
          ordenacaoNumero.adicionarNumero(4);
      
          // Exibindo a lista de numeros adicionadas
          System.out.println(ordenacaoNumero.numeroList);
      
       
          System.out.println(ordenacaoNumero.ordenarAscendente());

          System.out.println(ordenacaoNumero.ordenarDescedente());
 
         
        }
}
