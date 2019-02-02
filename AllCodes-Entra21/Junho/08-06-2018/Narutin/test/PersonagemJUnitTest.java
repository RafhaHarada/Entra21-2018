
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Rafael Alipio Harada
 */
public class PersonagemJUnitTest {
    
    @Test
    public void testeDefinirEObterNome(){
        Personagem sakura = new Personagem();
        sakura.setNome("Sakura");
        assertEquals("Sakura", sakura.getNome());
        sakura.setNome("Sakura Haruno");
        assertEquals("Sakura Haruno", sakura.getNome());
    }
    
    @Test
    public void testeDefinirEObterIdade(){
        Personagem choji = new Personagem();
        choji.setNome("Choji");
        choji.setIdade((byte)17);
        assertEquals(17, choji.getIdade());
    }
    
    @Test
    public void testeDefinirEObterSexo(){
        Personagem zabuza = new Personagem();
        zabuza.setNome("Zabuza");
        zabuza.setSexo('m');
        assertEquals('m', zabuza.getSexo());
    }
    
    @Test
    public void testeDefinirEObterNivelChakra(){
        Personagem deidara = new Personagem();
        deidara.setNome("Deidara");
        deidara.setNivelChakra(500);
        assertEquals(500, deidara.getNivelChakra());
    }
    
    @Test
    public void testeDefinirEObterAldeia(){
        Personagem rocklee = new Personagem();
        rocklee.setNome("Rocklee");
        rocklee.setAldeia("Folha");
        assertEquals("Folha", rocklee.getAldeia());
    }
    
    @Test
    public void testeDefinirEObterCla(){
        Personagem hinata = new Personagem();
        hinata.setNome("Hinata");
        hinata.setCla("Hyuuga");
        assertEquals("Hyuuga", hinata.getCla());
    }
    
    @Test
    public void testeDefinirEObterIdadeMental(){
        Personagem jiraya = new Personagem();
        jiraya.setNome("Choji");
        jiraya.setIdadeMental((byte)-10);
        assertEquals(-10, jiraya.getIdadeMental());
    }
    
}
