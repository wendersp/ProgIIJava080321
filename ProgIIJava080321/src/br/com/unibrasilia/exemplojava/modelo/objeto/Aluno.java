package br.com.unibrasilia.exemplojava.modelo.objeto;

import java.util.Objects;

/**
 *
 * @author wender
 */
public class Aluno {

    private Long id;
    private String nome;
    private String sexo;
    private int idade;
    private String endereco;
    private double altura;
    private Curso curso;

    public Aluno() {

    }

    public Aluno(Long id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;        
        this.sexo = sexo;        
        this.idade = idade;
    }
    
    

    public Aluno(Long id, String nome, String sexo, int idade,
            String endereco, double altura, Curso curso) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.endereco = endereco;
        this.altura = altura;
        this.curso = curso;
    }

    public void imprimir() {
        System.out.println("------------------------------------------------");
        System.out.println("Id.......: " + this.id);
        System.out.println("Nome.....: " + this.nome);
        System.out.println("Sexo.....: " + this.sexo);
        System.out.println("Idade....: " + this.idade);
        System.out.println("Altura...: " + this.altura);
        System.out.println("Endereço.: " + this.endereco);
        System.out.println("Curso....: " + this.curso.getId() + " - " + this.curso.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", endereco=" + endereco + ", altura=" + altura + '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    
    
}
