
/**
@author Rafael Alipio Harada
 
Enunciado:
    3. Crie uma classe chamada Janela que contenha os seguintes atributos:
-> Comprimento;
-> Largura;
-> Altura;
-> Preço;
-> Marca;
-> Possui insulfilm.
Gerar os métodos Get e Set para cada um dos atributos.
Gerar a classe de teste garantindo que as informações foram gravadas com sucesso.
*/
public class Janela {
    
    private String modelo;
    private double comprimento, largura, altura, preco;
    private boolean insulfilm;

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
    
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double getComprimento(){
        return comprimento;
    }
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getLargura(){
        return largura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setInsulfilm(boolean insulfilm){
        this.insulfilm = insulfilm;
    }
    public boolean getInsulfilm(){
        return insulfilm;
    }
}
