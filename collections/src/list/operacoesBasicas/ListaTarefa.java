package list.operacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
        
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        //cria-se uma lista de tarefas para remover dentro da lista de tarefas
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //percorre e compara os elementos dentro da lista de tarefas com o elemento passado como parametro
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                //se for igual, adiciona na lista de tarefas a remover
                tarefasParaRemover.add(t);
            }
        }
        //utiliza a lista de tarefas a remover como collections da funcao removeAll
        tarefaList.removeAll(tarefasParaRemover);        
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
        
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa lt = new ListaTarefa();
        System.out.println("numero total de tarefas: " + lt.obterNumeroTotalTarefas());
        lt.adicionarTarefa("comer");
        lt.adicionarTarefa("comer");
        lt.adicionarTarefa("andar");
        System.out.println("numero total de tarefas: " + lt.obterNumeroTotalTarefas());
        lt.removerTarefa("comer");
        lt.obterDescricoesTarefas();
    }

}
