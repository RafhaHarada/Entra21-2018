package br.com.Sistema.Bean;

import java.sql.Date;
import java.util.List;

/**
 * @author @Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class ReceitaBean {
    private int id;
    private double pagamentoConvenio;
    private double pagamentoAVista;
    private Date dataReceita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPagamentoConvenio() {
        return pagamentoConvenio;
    }

    public void setPagamentoConvenio(double pagamentoConvenio) {
        this.pagamentoConvenio = pagamentoConvenio;
    }
    
    public double getPagamentoAVista() {
        return pagamentoAVista;
    }

    public void setPagamentoAVista(double pagamentoAVista) {
        this.pagamentoAVista = pagamentoAVista;
    }

    public Date getDataReceita() {
        return dataReceita;
    }

    public void setDataReceita(Date dataReceita) {
        this.dataReceita = dataReceita;
    }

}
