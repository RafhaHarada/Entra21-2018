package br.com.Sistema.Bean;

import java.sql.Date;

/**
 * @author Nattana Matos (nattana.matos@Outlook.pt)
 */
public class ServicosBean {

    private int id;
    private int id_funcionario;
    private String nome;
    private String descricao;
    private String tipo;
    //private Date tempo_execucao;

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    public Date getTempo_execucao() {
//        return tempo_execucao;
//    }
//
//    public void setTempo_execucao(Date tempo_execucao) {
//        this.tempo_execucao = tempo_execucao;
//    }
//    
}
