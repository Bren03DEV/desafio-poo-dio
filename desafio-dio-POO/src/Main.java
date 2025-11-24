
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso JAVA");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp .setNome("Bootcamp Java Developer");
        bootcamp .setDescricao("Descrição Bootcamp Java Developer");
        bootcamp .getConteudos().add(curso1);
        bootcamp .getConteudos().add(curso2);
        bootcamp .getConteudos().add(mentoria);

        Dev devBreno = new Dev();
        devBreno .setNome("Breno");
        devBreno.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Breno:" + devBreno.getConteudoInscritos());

        devBreno.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Breno:" + devBreno.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Breno:" + devBreno.getConteudosConcluidos());
        System.out.println("XP:" + devBreno.calcularTotalXp());


        System.out.println("--------");

        Dev devDouglas = new Dev();
        devDouglas .setNome("Douglas");
        devDouglas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Douglas:" + devDouglas.getConteudoInscritos());

        devDouglas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Douglas:" + devDouglas.getConteudoInscritos());
        System.out.println("Conteudos Concluidos Douglas:" + devDouglas.getConteudosConcluidos());
        System.out.println("XP:" + devDouglas.calcularTotalXp());






    }
}