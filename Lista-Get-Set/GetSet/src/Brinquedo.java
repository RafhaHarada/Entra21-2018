
/**
@author Rafael Alipio Harada
 
Enunciado:
    2. Crie uma classe chamada Brinquedo que contenha os seguintes atributos:
-> Nome;
-> Marca;
-> Modelo;
-> Preço;
-> Código;
-> Código de barras;
-> Descrição.

Gerar os métodos Get e Set para cada um dos atributos.
Gerar a classe de teste garantindo que as informações foram gravadas com sucesso.
*/
public class Brinquedo {
    
    private String nome, marca, modelo, descricao;
    private double preco;
    private short codigo;
    private int codigoDeBarras;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setCodigo(short codigo){
        this.codigo = codigo;
    }
    public short getCodigo(){
        return codigo;
    }
    
    public void setCodigoDeBarras(int codigoDeBarras){
        this.codigoDeBarras = codigoDeBarras;
    }
    public int getCodigoDeBarras(){
        return codigoDeBarras;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
