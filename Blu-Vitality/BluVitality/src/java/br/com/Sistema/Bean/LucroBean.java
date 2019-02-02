package br.com.Sistema.Bean;

import java.sql.Date;

/**
 * @author @Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class LucroBean {
    private int id;
    private int idReceita;
    private int idCusto;
    private Date dataLucro;
    private double total;
    private ReceitaBean receita;
    private CustoBean custo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdReceita() {
        return idReceita;
    }

    public void setIdReceita(int idReceita) {
        this.idReceita = idReceita;
    }

    public int getIdCusto() {
        return idCusto;
    }

    public void setIdCusto(int idCusto) {
        this.idCusto = idCusto;
    }

    public Date getDataLucro() {
        return dataLucro;
    }

    public void setDataLucro(Date dataLucro) {
        this.dataLucro = dataLucro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ReceitaBean getReceita() {
        return receita;
    }

    public void setReceita(ReceitaBean receita) {
        this.receita = receita;
    }

    public CustoBean getCusto() {
        return custo;
    }

    public void setCusto(CustoBean custo) {
        this.custo = custo;
    }
    
}
