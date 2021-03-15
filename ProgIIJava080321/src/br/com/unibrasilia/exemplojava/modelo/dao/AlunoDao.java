
package br.com.unibrasilia.exemplojava.modelo.dao;

import br.com.unibrasilia.exemplojava.modelo.objeto.Aluno;
import java.util.List;

/**
 *
 * @author wender
 */
public class AlunoDao {
    
    private ConexaoBD conexaoBD;
    
    public void incluir(Aluno aluno) {
        //insert into 
    }
    
    public void alterar(Aluno aluno) {
        //update 
    }
    
    public void excluir(Aluno aluno) {
        //delete
    }
    
    public Aluno pesquisar(int id) {
        //SELECT ... WHERE id = ?
        return null;
    }
    
    public Aluno pesquisarPorCpf(String cpf) {
        //SELECT ... WHERE cpf = ?
        return null;
    }
    
    
    
    public List<Aluno> pesquisar(String nome) {
        //SELECT ... WHERE nome LIKE ?
        return null;
    }
        
    public List<Aluno> pesquisarAll() {
        //SELECT ...
        return null;
    }
    
}
