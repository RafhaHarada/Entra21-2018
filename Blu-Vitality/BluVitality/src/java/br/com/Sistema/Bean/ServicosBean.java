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
    private String tipo_de_urgencia;
    //private Date tempo_execucao;

    public String getTipo_de_urgencia() {
        return tipo_de_urgencia;
    }

    public void setTipo_de_urgencia(String tipo_de_urgencia) {
        this.tipo_de_urgencia = tipo_de_urgencia;
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
