package br.com.Sistema.Bean;

import java.sql.Time;

/**
 * @author Nattana Matos
 * @author Gustavo Rodrigues (gugaaroodrigues@gmail.com)
 */
public class CargosBean {

    private int id;
    private String nome;
    private String especialidade;
    private double salario;
    private Time carga_horaria;

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Time getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(Time carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
   
}
