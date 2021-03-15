
package br.com.unibrasilia.exemplojava.visao;

import br.com.unibrasilia.exemplojava.modelo.objeto.Aluno;
import br.com.unibrasilia.exemplojava.modelo.objeto.Curso;

/**
 *
 * @author wender
 */
public class ExemploJava {
   
    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        Curso curso2 = new Curso(2, "Adm de Empresas");
        curso1.setId(1);
        curso1.setNome("Analise e Desenv. de Sistemas");
        
        
        
        Aluno aluno01 = new Aluno(); 
        Aluno aluno02 = new Aluno();
        Aluno aluno03 = new Aluno(3, "Jose", "M", 30, "Av 8", 1.70, curso1);
        
        aluno01.setId(1);
        aluno01.setNome("Joao");
        aluno01.setIdade(21);
        aluno01.setSexo("M");
        aluno01.setEndereco("Rua 23a");
        aluno01.setAltura(1.80);
        aluno01.setCurso(curso1);
        
        
        aluno02.setId(2);
        aluno02.setNome("Maria");
        aluno02.setIdade(20);
        aluno02.setSexo("F");
        aluno02.setEndereco("Rua A5");
        aluno02.setAltura(1.65);
        aluno02.setCurso(curso2);
      
        
        aluno01.imprimir();
        aluno02.imprimir();
        aluno03.imprimir();
       
    }
    
}
