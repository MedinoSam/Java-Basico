package construtores;
public class SistemaCadastro {
    public static void main(String[] args) {
        
        Pessoa alguem = new Pessoa("Samisson", "123456");
        
        alguem.setEndereco("rua jose");
        System.out.println(alguem.getNome() + " - " + alguem.getCpf() + " - " + alguem.getEndereco());
    }
}
