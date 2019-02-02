package bean;

/**
 * @author Rafael Alipio Harada
 */
public class AlunoBean {
    
    private int id;
    private String nome,codigo_matricula,status;
    private float nota_1,nota_2,nota_3,media;
    private byte frequencia;

    public AlunoBean(){
    }
    
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

    public String getCodigo_matricula() {
        return codigo_matricula;
    }
    public void setCodigo_matricula(String codigo_matricula) {
        this.codigo_matricula = codigo_matricula;
    }

    public float getNota_1() {
        return nota_1;
    }
    public void setNota_1(float nota_1) {
        this.nota_1 = nota_1;
    }

    public float getNota_2() {
        return nota_2;
    }
    public void setNota_2(float nota_2) {
        this.nota_2 = nota_2;
    }

    public float getNota_3() {
        return nota_3;
    }
    public void setNota_3(float nota_3) {
        this.nota_3 = nota_3;
    }

    public byte getFrequencia() {
        return frequencia;
    }
    public void setFrequencia(byte frequencia) {
        this.frequencia = frequencia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
}
