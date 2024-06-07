public class MinhaClasse {
    
    public static void main (String [] args){
        String firstName = "Samuel";
        String secondName = "Medino";
        String completeName = completarNome(firstName, secondName);
        System.out.println(completeName);
    }

    public static String completarNome(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
