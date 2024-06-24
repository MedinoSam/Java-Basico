public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

   
    public void tocar() {
        System.out.println("Tocando musica!");
    }

   
    public void pausar() {
        System.out.println("Pausando a musica");
    }

   
    public void selecionarMusica(String musica) {
        System.out.println("Nome da musica: " + musica);
        
    }


    public void exibirPagina(String url) {
        System.out.println("Sua pagina: " + url);
        
    }

    
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        
    }

   
    public void adicionarNovaAba() {
        System.out.println("adicionando nova aba!");
    }


    public void atualizarPagina() {
        System.out.println("Atualizando pagina!");
    }
}
