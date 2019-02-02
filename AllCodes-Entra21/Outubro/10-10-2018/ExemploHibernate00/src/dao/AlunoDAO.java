package dao;

import bean.Aluno;
import database.Conexao;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Rafael Alipio Harada(rafhaharada@gmail.com)
 */
public class AlunoDAO {

    public List<Aluno> obterTodos(){
        List<Aluno> alunos = new ArrayList<>();
        Conexao conexao = new Conexao();
        if(conexao.conectar()){
            alunos = conexao.session.createQuery("from Aluno").list();
            return alunos;
        }
        return null;
    }
    public Aluno obterPeloId(int id){
        Conexao conexao = new Conexao();
        if(conexao.conectar()){
            Aluno aluno = conexao.session.get(Aluno.class, id);
            conexao.desconectar();
            return aluno;
        }
        return null;
    }
    public int inserir(Aluno aluno){
        Conexao conexao = new Conexao();
        if(conexao.conectar()){
            conexao.session.save(aluno);
            conexao.desconectar();
            return aluno.getId();
        }
        return -1;
    }
    public boolean alterar(Aluno aluno){
        Conexao conexao = new Conexao();
        if(conexao.conectar()){
            conexao.session.update(aluno);
            conexao.desconectar();
            return true;
        }
        return false;
    }
    public boolean apagar(int id){
        Conexao conexao = new Conexao();
        if(conexao.conectar()){
            Aluno aluno = new Aluno();
            aluno.setId(id);
            conexao.session.remove(aluno);
            conexao.desconectar();
            return true;
        }
        return false;
    }
}
