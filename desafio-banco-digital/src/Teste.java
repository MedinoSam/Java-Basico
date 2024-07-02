public class Teste {
    public static void main(String[] args) {
        Cliente samuel = new Cliente();
        samuel.setNome("Samuel");

        Conta cc = new ContaCorrente(samuel);
        Conta pp = new ContaPoupanca(samuel);

        Banco santander = new Banco();
        santander.setNome("Santander");
        

        cc.depositar(450);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
