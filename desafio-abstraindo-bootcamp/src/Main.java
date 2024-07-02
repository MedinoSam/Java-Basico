import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;

public class Main {
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Mentorando");
        mentoria.setData(LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java desenvolvimento");
        bootcamp.setDescricao("Descricao java desenvolvimento");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devSamuel = new Dev();
        devSamuel.setNome("Samuel");
        devSamuel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos: "+ devSamuel.getConteudosInscritos());
        devSamuel.progredir();
        System.out.println("Conteudos concluidos: "+ devSamuel.getConteudosConcluidos());
        System.out.println("Xp: "+ devSamuel.calcularTotalXp());
        System.out.println("Conteudos inscritos: "+ devSamuel.getConteudosInscritos());
        devSamuel.progredir();
        System.out.println("Xp: "+ devSamuel.calcularTotalXp());
        
    }
}
