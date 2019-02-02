import dao.MacarraoDAO;
import bean.Macarrao;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class MacarraoDAOJUnitTest {
    
    @Test
    public void testarCadastro(){
        Macarrao nissin = new Macarrao();
        nissin.setMarca("Nissin");
        nissin.setPeso(100);
        nissin.setAldente(false);
        nissin.setTipo("Na hora");
        nissin.setPo(true);
        
        int identificador = new MacarraoDAO().cadastrar(nissin);
        
        assertNotSame(identificador, -1);
        
        Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(identificador);
        
        /*
        Verifica se o que foi guardado em um objeto java
        foi o que realmente foi armazenado no banco, ou seja
        consistir se as informações são iguais
        */
        
        assertEquals(nissin.getMarca(), macarraoBuscado.getMarca());
        assertEquals(nissin.getPeso(), macarraoBuscado.getPeso(), 0);
        assertEquals(nissin.isAldente(), macarraoBuscado.isAldente());
        assertEquals(nissin.getTipo(), macarraoBuscado.getTipo());
        assertEquals(nissin.isPo(), macarraoBuscado.isPo());
        
        System.out.println(
        "\nId do Macarrão: " + macarraoBuscado.getId()
        + "\nMarca do Macarrão: " + macarraoBuscado.getMarca()
        + "\nPeso do Macarrão: " + macarraoBuscado.getPeso()
        + "\nTipo do Macarrão: " + macarraoBuscado.getTipo()
        + "\nO Macarrão é aldente?: " + macarraoBuscado.isAldente()
        + "\nO Macarrão tem pó?: " + macarraoBuscado.isPo()
        );
    }
    
    @Test
    public void testarEdicao(){
        Macarrao magali = new Macarrao();
        magali.setMarca("Magali");
        magali.setPeso(80);
        magali.setAldente(true);
        magali.setTipo("Da hora");
        magali.setPo(true);
        
        int identificador = new MacarraoDAO().cadastrar(magali);
        magali.setId(identificador);
        
        magali.setMarca("Monica");
        magali.setPeso(8001);
        magali.setAldente(false);
        magali.setTipo("Na hora");
        magali.setPo(false);
        boolean alterado = new MacarraoDAO().alterar(magali);
        assertTrue(alterado);
        
        Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(identificador);
        assertNotNull(macarraoBuscado);
        assertEquals(magali.getMarca(), macarraoBuscado.getMarca());
        assertEquals(magali.getPeso(), macarraoBuscado.getPeso(), 0);
        assertEquals(magali.isAldente(), macarraoBuscado.isAldente());
        assertEquals(magali.getTipo(), macarraoBuscado.getTipo());
        assertEquals(magali.isPo(), macarraoBuscado.isPo());
        
    }
    
    @Test
    public void testarApagar(){
        Macarrao magali = new Macarrao();
        magali.setMarca("Magali");
        magali.setPeso(80);
        magali.setAldente(true);
        magali.setTipo("Da hora");
        magali.setPo(true);
        
        int identificador = new MacarraoDAO().cadastrar(magali);
        boolean excluir = new MacarraoDAO().apagar(identificador);
        assertTrue(excluir);
        
        Macarrao macarraoBuscado = new MacarraoDAO().obterPeloId(identificador);
        assertNull(macarraoBuscado);
        
    }
    
}
