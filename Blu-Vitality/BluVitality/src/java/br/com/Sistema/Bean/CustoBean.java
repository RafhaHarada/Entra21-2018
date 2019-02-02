package br.com.Sistema.Bean;

import java.sql.Date;

/**
 * @author @Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class CustoBean {
    private int id;
    private Date dataCusto;
    private double manutencao;
    private double salarioFuncionarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCusto() {
        return dataCusto;
    }

    public void setDataCusto(Date dataCusto) {
        this.dataCusto = dataCusto;
    }

    public double getManutencao() {
        return manutencao;
    }

    public void setManutencao(double manutencao) {
        this.manutencao = manutencao;
    }

    public double getSalarioFuncionarios() {
        return salarioFuncionarios;
    }

    public void setSalarioFuncionarios(double salarioFuncionarios) {
        this.salarioFuncionarios = salarioFuncionarios;
    }
    
}
