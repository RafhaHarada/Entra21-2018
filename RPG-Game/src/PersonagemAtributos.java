
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class PersonagemAtributos {

    private double hp, mp, sp;
    private String nomePersonagem, classe, raca, reino, alcunha, sexo;

    public void setSexo(String sexo) {this.sexo = sexo;}
    public String getSexo() {return sexo;}
    
    public void setNomePersonagem(String nomePersonagem){this.nomePersonagem = nomePersonagem;}
    public String getNomePersonagem(){return nomePersonagem;}
    
    public void setClasse(String classe){this.classe = classe;}
    public String getClasse(){return classe;}
    
    public void setRaca(String raca){this.raca = raca;}
    public String getRaca(){return raca;}
    
    public void setReino(String reino){this.reino = reino;}
    public String getReino(){return reino;}
    
    public void setAlcunha(String alcunha){this.alcunha = alcunha;}
    public String getAlcunha(){return alcunha;}
    
    public void setHP(double hp){this.hp = hp;}
    public double getHP(){return hp;}
    
    public void setMP(double mp){this.mp = mp;}
    public double getMP(){return mp;}
    
    public void setSp(double sp){this.sp = sp;}
    public double getSp(){return sp;}
}
