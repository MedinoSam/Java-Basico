package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet =  new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
        Set<Tarefa> tarefaRemover = new HashSet<>();
        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaRemover.add(t);
            }
        }
        tarefaSet.removeAll(tarefaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaSet);
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas  = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if(t.getConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for(Tarefa t : tarefaSet){
            if(!t.getConcluida()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){

        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){

        for(Tarefa t : tarefaSet){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluida(false);
                break;
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();
    
        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");
    
        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();
    
        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
    
        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
    
        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());
    
        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
    
        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());
    
        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();
    
        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
      }
    
}
