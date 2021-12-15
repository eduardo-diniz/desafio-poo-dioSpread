import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String [] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria em java");
        mentoria1.setDescricao("Descricao mentoria java");
        mentoria1.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao BootCamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Eduardo");
        dev1.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();

        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP : " + dev1.calcularTotalXp());

        Dev dev2= new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp1);

        System.out.println("Conteudos Inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("Conteudos Inscritos " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev2.getConteudosConcluidos());
        System.out.println("XP : " + dev2.calcularTotalXp());




    }
}
