
import java.time.LocalDate;


/**
 * @author Rafael Alipio Harada

Enunciado:
    1. Crie uma classe chamada Filme com os seguintes atributos:
->Título
->Título Original;
->Gênero;
->Diretor;
->Ano Lançamento;
->Valor Faturamento;
->Valor Orçamento;
->Espectadores;
->Classificação;
->Média Preço;
->Data De Lançamento No Brasil;
->Idioma.
Gerar os métodos Get e Set para cada um dos atributos.
Gerar a classe de teste garantindo que as informações foram gravadas com sucesso.
*/
public class Filme {
    
    private String titulo, tituloOriginal, genero, diretor, classificacao, idioma;
    private short anoLancamento;
    private double valorFaturamento, valorOrcamento, mediaPreco;
    private int espectadores;
    private LocalDate dataLancamentoBrasil;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public void setTituloOriginal(String tituloOriginal){
        this.tituloOriginal = tituloOriginal;
    }
    public String getTituloOriginal(){
        return tituloOriginal;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return diretor;
    }
    
    public void setClassificacao(String classificacao){
        this.classificacao = classificacao;
    }
    public String getClassificacao(){
        return classificacao;
    }
    
    public void setIdioma(String idioma){
        this.idioma = idioma;
    }
    public String getIdioma(){
        return idioma;
    }
    
    public void setAnoLancamento(short anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public short getAnoLancamento(){
        return anoLancamento;
    }
    
    public void setValorFaturamento(double valorFaturamento){
        this.valorFaturamento = valorFaturamento;
    }
    public double getValorFaturamento(){
        return valorFaturamento;
    }
    
    public void setValorOrcamento(double valorOrcamento){
        this.valorOrcamento = valorOrcamento;
    }
    public double getValorOrcamento(){
        return valorOrcamento;
    }
    
    public void setEspectadores(int espectadores){
        this.espectadores = espectadores;
    }
    public int getEspectadores(){
        return espectadores;
    }
    
    public void setMediaPreco(double mediaPreco){
        this.mediaPreco = mediaPreco;
    }
    public double getMediaPreco(){
        return mediaPreco;
    }
    
    public void setDataLancamentoBrasil(LocalDate dataLancamentoBrasil){
        this.dataLancamentoBrasil = dataLancamentoBrasil;
    }
    public LocalDate getDataLancamentoBrasil(){
        return dataLancamentoBrasil;
    }
    
}
