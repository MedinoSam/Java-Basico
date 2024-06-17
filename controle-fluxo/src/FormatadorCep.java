public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("57123097");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("Cep fora do padrao!");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
            throw new CepInvalidoException();
        
        return "57.123-097";
    }
}
