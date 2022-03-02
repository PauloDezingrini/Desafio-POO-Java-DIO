import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Curso Java","Descrição curso Java",16);
        Conteudo curso2 = new Curso("Curso JavaScript","Descrição curso JS",4);

        Conteudo mentoria1 = new Mentoria("Mentoria sobre Java","Descriçaõ da mentoria", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("GFT-Start-Java","Bootcamp sobre Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev eu = new Dev("Paulo Dezingrini");
        Dev aleatorio = new Dev("João");

        eu.inscreverBootcamp(bootcamp);
        aleatorio.inscreverBootcamp(bootcamp);

        eu.progredir();
        eu.progredir();
        aleatorio.progredir();

        System.out.println("=== Conteúdos Inscritos ===");
        System.out.println(eu.getConteudosInscritos());
        System.out.println("=== Conteúdos Concluidos ===");
        System.out.println(eu.getConteudosConcluidos());
        System.out.println("XP Total: " + eu.calcularXp());

        System.out.println("=== Conteúdos Inscritos ===");
        System.out.println(aleatorio.getConteudosInscritos());
        System.out.println("=== Conteúdos Concluidos ===");
        System.out.println(aleatorio.getConteudosConcluidos());
        System.out.println("XP Total: " + aleatorio.calcularXp());

    }
}
