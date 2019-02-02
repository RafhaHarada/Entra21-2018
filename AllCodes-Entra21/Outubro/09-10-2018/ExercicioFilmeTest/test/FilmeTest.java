import dao.FilmeDAO;
import bean.Filme;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class FilmeTest {
    FilmeDAO dao = new FilmeDAO();
    Filme filme = new Filme();
    
    @Test
    public void testCadastro(){
        limpar();
        filme.setAno((byte)2018);
        filme.setAtorPrincipal("Goku");
        filme.setCategoria("aventura");
        filme.setDiretor("Dougras");
        filme.setDublado(true);
        filme.setFaixaEtaria("+16");
        filme.setFaturamento(20000);
        filme.setIdiomaOriginal("Pt-Br");
        filme.setLegenda(true);
        filme.setNome("Filme + de 8000");
        filme.setOrcamento(8001);
        filme.setTempoFilme((short)646);
        
        int identificador = dao.cadastrar(filme);
        assertNotSame(identificador, -1);
        
        Filme filmeBuscado = dao.obterPeloId(identificador);
        assertNotNull(filmeBuscado);
        assertEquals(filme.getAno(),filmeBuscado.getAno());
        assertEquals(filme.getAtorPrincipal(),filmeBuscado.getAtorPrincipal());
        assertEquals(filme.getCategoria(),filmeBuscado.getCategoria());
        assertEquals(filme.getDiretor(),filmeBuscado.getDiretor());
        assertEquals(filme.getFaixaEtaria(),filmeBuscado.getFaixaEtaria());
        assertEquals(filme.getFaturamento(),filmeBuscado.getFaturamento(),0);
        assertEquals(filme.getIdiomaOriginal(),filmeBuscado.getIdiomaOriginal());
        assertEquals(filme.getNome(),filmeBuscado.getNome());
        assertEquals(filme.getOrcamento(),filmeBuscado.getOrcamento(),0);
        assertEquals(filme.getTempoFilme(),filmeBuscado.getTempoFilme());
        assertEquals(filme.isDublado(),filmeBuscado.isDublado());
        assertEquals(filme.isLegenda(),filmeBuscado.isLegenda());
    }
    
    @Test
    public void testEditar(){
        limpar();
        filme.setAno((byte)2018);
        filme.setAtorPrincipal("Goku");
        filme.setCategoria("aventura");
        filme.setDiretor("Dougras");
        filme.setDublado(true);
        filme.setFaixaEtaria("+16");
        filme.setFaturamento(20000);
        filme.setIdiomaOriginal("Pt-Br");
        filme.setLegenda(true);
        filme.setNome("Filme + de 8000");
        filme.setOrcamento(8001);
        filme.setTempoFilme((short)646);
        
        int identificador = dao.cadastrar(filme);
        
        filme.setId(identificador);
        filme.setAno((byte)2018);
        filme.setAtorPrincipal("Gohan");
        filme.setCategoria("Terror");
        filme.setDiretor("Irineu");
        filme.setDublado(false);
        filme.setFaixaEtaria("+18");
        filme.setFaturamento(80000);
        filme.setIdiomaOriginal("En-Us");
        filme.setLegenda(false);
        filme.setNome("Filme + de 9000");
        filme.setOrcamento(8002);
        filme.setTempoFilme((short)464);
        
        boolean alterou = dao.editar(filme);
        assertTrue(alterou);
        
        Filme filmeBuscado = dao.obterPeloId(identificador);
        assertNotNull(filmeBuscado);
        assertEquals(filme.getAno(),filmeBuscado.getAno());
        assertEquals(filme.getAtorPrincipal(),filmeBuscado.getAtorPrincipal());
        assertEquals(filme.getCategoria(),filmeBuscado.getCategoria());
        assertEquals(filme.getDiretor(),filmeBuscado.getDiretor());
        assertEquals(filme.getFaixaEtaria(),filmeBuscado.getFaixaEtaria());
        assertEquals(filme.getFaturamento(),filmeBuscado.getFaturamento(),0);
        assertEquals(filme.getIdiomaOriginal(),filmeBuscado.getIdiomaOriginal());
        assertEquals(filme.getNome(),filmeBuscado.getNome());
        assertEquals(filme.getOrcamento(),filmeBuscado.getOrcamento(),0);
        assertEquals(filme.getTempoFilme(),filmeBuscado.getTempoFilme());
        assertEquals(filme.isDublado(),filmeBuscado.isDublado());
        assertEquals(filme.isLegenda(),filmeBuscado.isLegenda());
        
    }
    
    @Test
    public void testApagar(){
        limpar();
        filme.setAno((byte)2018);
        filme.setAtorPrincipal("Goku");
        filme.setCategoria("aventura");
        filme.setDiretor("Dougras");
        filme.setDublado(true);
        filme.setFaixaEtaria("+16");
        filme.setFaturamento(20000);
        filme.setIdiomaOriginal("Pt-Br");
        filme.setLegenda(true);
        filme.setNome("Filme + de 8000");
        filme.setOrcamento(8001);
        filme.setTempoFilme((short)646);
        
        int identificador = dao.cadastrar(filme);
        
        boolean apagou = dao.excluir(identificador);
        assertTrue(apagou);
        
        Filme filmeBuscado = dao.obterPeloId(identificador);
        assertNull(filmeBuscado);
    }
    
    
    public void limpar(){
        filme.setAno((byte)0);
        filme.setAtorPrincipal("");
        filme.setCategoria("");
        filme.setDiretor("");
        filme.setDublado(false);
        filme.setFaixaEtaria("");
        filme.setFaturamento(0);
        filme.setIdiomaOriginal("");
        filme.setLegenda(false);
        filme.setNome("");
        filme.setOrcamento(0);
        filme.setTempoFilme((short)0);
    }
}
