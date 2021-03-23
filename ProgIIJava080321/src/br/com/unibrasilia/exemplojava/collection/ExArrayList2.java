package br.com.unibrasilia.exemplojava.collection;

import br.com.unibrasilia.exemplojava.modelo.objeto.Aluno;
import java.util.ArrayList;
import java.util.List;

public class ExArrayList2 {

    public static void main(String[] args) {

        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno a1 = new Aluno(1l, "Joao da silva", "M", 25);
        listaAlunos.add(a1);
        Aluno a2 = new Aluno();
        a2.setId(2l);
        a2.setNome("Maria da Silva");
        a2.setSexo("F");
        a2.setIdade(36);
        listaAlunos.add(a2);

        for (Aluno aluno : listaAlunos) {
            System.out.println("--------------------------------");
            System.out.println("Id....: " + aluno.getId());
            System.out.println("Nome..: " + aluno.getNome());
            System.out.println("Sexo..: " + aluno.getSexo());
            System.out.println("Idade.: " + aluno.getIdade());
        }

    }

}
