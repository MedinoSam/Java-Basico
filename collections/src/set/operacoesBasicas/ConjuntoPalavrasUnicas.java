package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas(){
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra){
        Palavra palavraRemovida = null;
        boolean achado = false;
        for (Palavra p : palavraSet){
            if (p.getFrase() == palavra){
                palavraRemovida = p;
                achado = true;
                break;
            }
        }
        if (achado){
            palavraSet.remove(palavraRemovida);
        }
        else{
            System.out.println("Palavra " + palavra + " nao foi encontrada!");
        }
        
    }
    
    public void verificarPalavra(String palavra){
        boolean achado = false;

        for(Palavra p : palavraSet){
            if (p.getFrase() == palavra){
                achado = true;
                break;
            }
        }
        if (achado){
            System.out.println("A palavra " + palavra + " foi encontrada!");
        }
        else{
            System.out.println("Palavra " + palavra + " nao foi encontrada!");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();
    
        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");
    
        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem do conjunto
       
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();
    
        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");
    
        // Verificando se uma linguagem está no conjunto
        conjuntoLinguagens.verificarPalavra("Java");
        conjuntoLinguagens.verificarPalavra("Python");
    
        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
      }
}
