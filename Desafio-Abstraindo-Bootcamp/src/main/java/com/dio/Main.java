package com.dio;

import com.dio.Bootcamp.Bootcamp;
import com.dio.Conteudo.Curso;
import com.dio.Conteudo.Mentoria;
import com.dio.Pessoa.Dev;
import com.dio.Plataforma.Plataforma;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Plataforma plataforma = new Plataforma();

        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução a Java");
        curso1.setDescricap("Descrição do curso "+curso1.getTitulo());
        curso1.setCargaHoraria(12);
        // System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Collections Java");
        curso2.setDescricap("Descrição do curso "+curso2.getTitulo());
        curso2.setCargaHoraria(26);
        // System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Introdução Java");
        mentoria1.setDescricap("Descrição da mentoria "+mentoria1.getTitulo());
        mentoria1.setData(LocalDate.of(2022,1,27));
        // System.out.println(mentoria1);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Java Developer");
        bootcampJava.setDescricao("Descrição do bootcamp "+bootcampJava.getNome());
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria1);


        Curso curso3 = new Curso();
        curso3.setTitulo("Introdução a Javascript");
        curso3.setDescricap("Descrição do curso "+curso3.getTitulo());
        curso3.setCargaHoraria(10);
        // System.out.println(curso3);

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Introdução Javascript");
        mentoria2.setDescricap("Descrição da mentoria "+mentoria2.getTitulo());
        mentoria2.setData(LocalDate.of(2022,2,10));
        // System.out.println(mentoria2);

        Bootcamp bootcampJavascript = new Bootcamp();
        bootcampJavascript.setNome("Javascript Developer");
        bootcampJavascript.setDescricao("Descrição do bootcamp "+bootcampJavascript.getNome());
        bootcampJavascript.getConteudos().add(curso3);
        bootcampJavascript.getConteudos().add(mentoria2);


        Dev Joao = new Dev("Joao","Paulo");
        Joao.inscreverBootcamp(bootcampJavascript);
        Joao.inscreverBootcamp(bootcampJava);
        plataforma.adcionarDev(Joao);

        Dev Maria = new Dev("Maria","Joana");
        Maria.inscreverBootcamp(bootcampJava);
        plataforma.adcionarDev(Maria);

        Dev Ana = new Dev("Ana","Claudia");
        Ana.inscreverBootcamp(bootcampJava);
        plataforma.adcionarDev(Ana);

        System.out.println("----------------");
        System.out.println(plataforma.getListaDevs());
        System.out.println("Cursos do bootcamp " + bootcampJava.getNome()+": " + bootcampJava.getConteudos());
        System.out.println("Cursos do bootcamp " + bootcampJavascript.getNome()+": " + bootcampJavascript.getConteudos());

        System.out.println("----------------");
        System.out.println("Nome do Dev: " + Joao.getNome() + " " +  Joao.getSobrenome());
        System.out.println("XP do Dev: " + Joao.calcularTotalXp());
        System.out.println("Cursos inscritos: " + Joao.getConteudosInscritos());
        System.out.println("Cursos concluidos: " + Joao.getConteudosConcluidos());

        System.out.println("----------------");
        System.out.println("Nome do Dev: " + Maria.getNome() + " " +  Maria.getSobrenome());
        System.out.println("XP do Dev: " + Maria.calcularTotalXp());
        System.out.println("Cursos inscritos: " + Maria.getConteudosInscritos());
        System.out.println("Cursos concluidos: " + Maria.getConteudosConcluidos());


        System.out.println("-------- Depois de ambos progredir três vezes --------");
        Maria.progredir();
        Maria.progredir();
        Maria.progredir();
        Maria.progredir();  // Operação inválida
        Joao.progredir();
        Joao.progredir();
        Joao.progredir();

        System.out.println("");

        System.out.println("Nome do Dev: " + Joao.getNome()+ " " + Joao.getSobrenome());
        System.out.println("XP do Dev: " + Joao.calcularTotalXp());
        System.out.println("Cursos inscritos: " + Joao.getConteudosInscritos());
        System.out.println("Cursos concluidos: " + Joao.getConteudosConcluidos());


        System.out.println("----------------");
        System.out.println("Nome do Dev: " + Maria.getNome() + " " +  Maria.getSobrenome());
        System.out.println("XP do Dev: " + Maria.calcularTotalXp());
        System.out.println("Cursos inscritos: " + Maria.getConteudosInscritos());
        System.out.println("Cursos concluidos: " + Maria.getConteudosConcluidos());



    }
}
