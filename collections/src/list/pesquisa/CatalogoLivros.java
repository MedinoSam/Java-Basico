package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    } 

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){

        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!livroList.isEmpty()){

            for(Livro livroAtual : livroList){
                if (livroAtual.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livroAtual);
                }
            }

            
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
            
            for(Livro livroAtual : livroList){
                if(livroAtual.getAnoPublicacao() <= anoFinal && livroAtual.getAnoPublicacao() >= anoInicial){
                    livrosPorIntervaloAnos.add(livroAtual);
                }
            }
        }

        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            for(Livro livroAtual : livroList){
                if(livroAtual.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = livroAtual;
                    break;
                }
            }
        }
    return livroPorTitulo;
    }
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("torre", "samissonn", 2015);
        catalogoLivros.adicionarLivro("rainha", "james", 2130);
        catalogoLivros.adicionarLivro("rei", "stewart", 2020);
        catalogoLivros.adicionarLivro("bispo", "xadrez", 2020);
        catalogoLivros.adicionarLivro("peao", "samissonn", 2016);
        System.out.println(catalogoLivros.pesquisarPorAutor("samissonn"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2));

    }
}
