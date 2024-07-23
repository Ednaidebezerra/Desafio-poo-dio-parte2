import com.br.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Criar os contrutores (ou seja, criando os objetos Curso e Mentoria e instanciando).

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição do curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js ");
        curso2.setDescricao("Descrição do curso ");
        curso2.setCargaHoraria(4);

        // Polimorfismo: Da pra criar um Objeto "curso" a partir de "Conteudo"
       // Conteudo conteudo = new Curso();
        //Conteudo conteudo1 = new Conteudo();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java ");
        mentoria.setDescricao("Descrição de mentoria ");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java daveloper ");
        bootcamp.setDescricao("Descrição Bootcamp java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEdna = new Dev();
        devEdna.setNome("Edna");
        devEdna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Edna: " + devEdna.getConteudosInscritos());
        devEdna.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Edna: " + devEdna.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Edna: " + devEdna.getConteudosConcluidos());

        System.out.println("-------------------------------");

        Dev devJoao = new Dev();
        devEdna.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--");

        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosConcluidos());

    }
}
