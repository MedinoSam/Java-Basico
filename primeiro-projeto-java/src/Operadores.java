public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "samuel" + " " + "medino" + " " + "da" + " " + "silva";
        System.out.println(nomeCompleto);

        int a, b;
        a = 1;
        b = 2;
        String resultado = a==b ? "verdadeiro" : "falso"; 
        System.out.println(resultado);

        String nomeUm = "samuel";
        String nomeDois = new String("samuel");
        System.out.println(nomeUm.equals(nomeDois));
        
    }
}
