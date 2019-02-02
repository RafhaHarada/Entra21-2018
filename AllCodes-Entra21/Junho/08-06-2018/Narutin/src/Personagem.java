
import java.util.ArrayList;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Personagem {
    
    private String nome, cla, aldeia;
    private long nivelChakra;
    private char sexo;
    private byte idade, idadeMental;
    ArrayList<String> poderes = new ArrayList<>();
    
    public void setNome(String nome) {
        
        /*if(nome.trim().equals("")){
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        
        if(nome.trim().length() < 3){
            throw new IllegalArgumentException("Nome tem que conter no mínimo 3 caracteres");
        }*/
        
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setCla(String cla) {
        this.cla = cla;
    }
    
    public String getCla(){
        return cla;
    }
    
    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }
    
    public String getAldeia(){
        return aldeia;
    }
    
    public void setNivelChakra(long nivelChakra) {
        this.nivelChakra = nivelChakra;
    }
    
    public long getNivelChakra(){
        return nivelChakra;
    }
    
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    
    public byte getIdade(){
        return idade;
    }
    
    public void setIdadeMental(byte idadeMental) {
        this.idadeMental = idadeMental;
    }
    
    public byte getIdadeMental(){
        return idadeMental;
    }
    
}
