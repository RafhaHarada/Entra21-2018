/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.Bean;

/**
 *
 * @author Cidmar da Silva Ribeiro (cidmardsr@gmail.com)
 */
public class EquipamentoBean {
    private int id;
    private String nome;
    private String descricao;
    private String status;
    private int quantidade;
    private double valor;
    private String tempo_de_uso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTempo_de_uso() {
        return tempo_de_uso;
    }

    public void setTempo_de_uso(String tempo_de_uso) {
        this.tempo_de_uso = tempo_de_uso;
    }
}
