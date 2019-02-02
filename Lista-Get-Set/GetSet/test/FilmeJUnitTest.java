
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Rafael Alipio Harada
 */

public class FilmeJUnitTest {
    
    @Test
    public void testeTitulo(){
        Filme filme1 = new Filme();
        filme1.setTitulo("Cocada");
        assertEquals("Cocada", filme1.getTitulo());
    }
    
    @Test
    public void testeTituloOriginal(){
        Filme filme2 = new Filme();
        filme2.setTituloOriginal("Goiabada");
        assertEquals("Goiabada", filme2.getTituloOriginal());
    }
    
    @Test
    public void testeGenero(){
        Filme filme3 = new Filme();
        filme3.setGenero("Ação");
        assertEquals("Ação", filme3.getGenero());
    }
    
    @Test
    public void testeDiretor(){
        Filme filme4 = new Filme();
        filme4.setDiretor("Dougras");
        assertEquals("Dougras", filme4.getDiretor());
    }
    
    @Test
    public void testeClassificacao(){
        Filme filme5 = new Filme();
        filme5.setClassificacao("+16");
        assertEquals("+16", filme5.getClassificacao());
    }
    
    @Test
    public void testeIdioma(){
        Filme filme6 = new Filme();
        filme6.setIdioma("English");
        assertEquals("English", filme6.getIdioma());
    }
    
    @Test
    public void testeAnoLancamento(){
        Filme filme7 = new Filme();
        filme7.setAnoLancamento((short)2018);
        assertEquals((short)2018, filme7.getAnoLancamento());
    }
    
    @Test
    public void testeValorFaturamento(){
        Filme filme8 = new Filme();
        filme8.setValorFaturamento((double)25.5);
        assertEquals((double)25.5, filme8.getValorFaturamento(), 0);
    }
    
    @Test
    public void testeValorOrcamento(){
        Filme filme9 = new Filme();
        filme9.setValorOrcamento((double)35.5);
        assertEquals((double)35.5, filme9.getValorOrcamento(), 0);
    }
    
    @Test
    public void testeEspectadores(){
        Filme filme10 = new Filme();
        filme10.setEspectadores((int)356);
        assertEquals((int)356, filme10.getEspectadores());
    }
    
    @Test
    public void testeMediaPreco(){
        Filme filme11 = new Filme();
        filme11.setMediaPreco((double)653.5);
        assertEquals((double)653.5, filme11.getMediaPreco(), 0);
    }
    
    @Test
    public void testeDataLancamentoBrasil(){
        Filme filme12 = new Filme();
        filme12.setDataLancamentoBrasil(null);
        assertEquals(null, filme12.getDataLancamentoBrasil());
    }

}