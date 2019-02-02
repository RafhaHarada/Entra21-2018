package bean;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class Macarrao {
    
    private int id;
    private String tipo,marca;
    private boolean aldente,po;
    private double peso;

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isAldente() {
        return aldente;
    }

    public void setAldente(boolean aldente) {
        this.aldente = aldente;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isPo() {
        return po;
    }

    public void setPo(boolean po) {
        this.po = po;
    }
    
}
