package set.ordenacao;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, long matricula, double nota) {
        this.nome = nome;
        this.matricula = (int) matricula;
        this.nota = nota;
    }

    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "\n[Aluno: " + nome + " matricula: " + matricula + " nota: " + nota + "]\n";
    }

    
}

    class ComparatorPorNota implements Comparator<Aluno>{

        
        public int compare(Aluno a1, Aluno a2) {
            return Double.compare(a1.getNota(), a2.getNota());
        }
        
    }
