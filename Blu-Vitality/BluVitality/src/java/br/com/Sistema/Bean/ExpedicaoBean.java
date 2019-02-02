/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Bean;

import java.sql.Date;
import java.sql.Time;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
public class ExpedicaoBean {
    private int id;
    private int id_usuario;
    private int id_funcionario;
    private String tipo;
    private String nome;
    private Date data_expedicao;
    private double custo;
    private UsuarioBean usuario;
    private FuncionarioBean funcionario;
    private Time hora_expedicao;

    public Time getHora_expedicao() {
        return hora_expedicao;
    }

    public void setHora_expedicao(Time hora_expedicao) {
        this.hora_expedicao = hora_expedicao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getData_expedicao() {
        return data_expedicao;
    }

    public void setData_expedicao(Date data_expedicao) {
        this.data_expedicao = data_expedicao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public UsuarioBean getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioBean usuario) {
        this.usuario = usuario;
    }

    public FuncionarioBean getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(FuncionarioBean funcionario) {
        this.funcionario = funcionario;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }
}
