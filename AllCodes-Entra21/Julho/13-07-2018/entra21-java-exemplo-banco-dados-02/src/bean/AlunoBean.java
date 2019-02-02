package bean;

/*
 * @author Airam
 */
public class AlunoBean {
    
    private int id;
    private double nota1, nota2, nota3, nota4;
    private String nome, materia, descricao;
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nota1
     */
    public double getNota1(){
        return nota1;
    }
    
    /**
     * @param Nota1 the nota1 to set
     */
    
    public void setNota1(double Nota1){
        this.nota1 = Nota1;
    }
    
    /**
     * @return the nota2
     */
    public double getNota2(){
        return nota2;
    }
    
    /**
     * @param Nota2 the nota2 to set
     */
    
    public void setNota2(double Nota2){
        this.nota2 = Nota2;
    }
    
    /**
     * @return the nota3
     */
    public double getNota3(){
        return nota3;
    }
    
    /**
     * @param Nota3 the nota3 to set
     */
    
    public void setNota3(double Nota3){
        this.nota3 = Nota3;
    }
    
    /**
     * @return the bota4
     */
    public double getNota4(){
        return nota4;
    }
    
    /**
     * @param Nota4 the bota4 to set
     */
    
    public void setNota4(double Nota4){
        this.nota4 = Nota4;
    }
    
    /**
     * @return the nome
     */
    
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the materia
     */
    
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    /**
     * @return the descricao
     */
    
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}