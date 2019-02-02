
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Rafael Alipio Harada
 */

public class JanelaJUnitTest {
    
    @Test
    public void testeAltura() {
        Janela janela1 = new Janela();
        janela1.setAltura((double)35.5);
        assertEquals((double)35.5, janela1.getAltura(), 0);
    }
    
    @Test
    public void testeComprimento() {
        Janela janela1 = new Janela();
        janela1.setComprimento((double)1.5);
        assertEquals((double)1.5, janela1.getComprimento(), 0);
    }
    
    @Test
    public void testeLargura() {
        Janela janela1 = new Janela();
        janela1.setLargura((double)48.9);
        assertEquals((double)48.9, janela1.getLargura(), 0);
    }
    
    @Test
    public void testePreco() {
        Janela janela1 = new Janela();
        janela1.setPreco((double)799.99);
        assertEquals((double)799.99, janela1.getPreco(), 0);
    }
    
    @Test
    public void testeInsulfilm() {
        Janela janela1 = new Janela();
        janela1.setInsulfilm((boolean)true);
        assertEquals((boolean)true, janela1.getInsulfilm());
    }
    
    @Test
    public void testeModelo() {
        Janela janela1 = new Janela();
        janela1.setModelo("Premium");
        assertEquals("Premium", janela1.getModelo());
    }
    
}