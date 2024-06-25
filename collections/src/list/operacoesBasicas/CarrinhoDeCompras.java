package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> carrinhoList;

    public CarrinhoDeCompras(){
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensRemover = new ArrayList<>();

        for(Item i : carrinhoList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensRemover);
    }

    public double calcularValorTotal(){
        int quantidadeList;
        double precoList;
        double total = 0;
        for(Item i : carrinhoList){
            quantidadeList = i.getQuantidade();
            precoList = i.getPreco();
            total += precoList*quantidadeList;
            }
            return total;
        }

    public void exibirItens(){
        System.out.println(carrinhoList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras james = new CarrinhoDeCompras();
        james.exibirItens();
        james.adicionarItem("Cuscuz", 4, 10);
        james.adicionarItem("Cuscuz", 4, 10);
        james.adicionarItem("bolacha", 65, 10);
        james.removerItem("cuscuz");
        james.exibirItens();
        System.out.println("valor total: " + james.calcularValorTotal());
    }
}



