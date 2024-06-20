package construtores.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno samuel = new Aluno();

        samuel.setNome("Samuel Medino");
        samuel.setIdade(19);
        System.out.println("o aluno " + samuel.getNome() + " possui " + samuel.getIdade() + " anos ");
    }
}
