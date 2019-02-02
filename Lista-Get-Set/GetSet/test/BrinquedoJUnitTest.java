/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author Rafael Alipio Harada
 */

public class BrinquedoJUnitTest {
    
    @Test
    public void testeNome() {
        Brinquedo brinquedo1 = new Brinquedo();
        brinquedo1.setNome("Doll");
        assertEquals("Doll", brinquedo1.getNome());
    }
    
    @Test
    public void testeMarca() {
        Brinquedo brinquedo1 = new Brinquedo();
        brinquedo1.setMarca("Sega");
        assertEquals("Sega", brinquedo1.getMarca());
    }
    
    @Test
    public void testeModelo() {
        Brinquedo brinquedo1 = new Brinquedo();
        brinquedo1.setModelo("Babysitter");
        assertEquals("Babysitter", brinquedo1.getModelo());
    }
    
    @Test
    public void testeDescricao() {
        Brinquedo brinquedo1 = new Brinquedo();
        brinquedo1.setDescricao("Is good");
        assertEquals("Is good", brinquedo1.getDescricao());
    }
    
    @Test
    public void testePreco() {
        Brinquedo brinquedo1 = new Brinquedo();
        brinquedo1.setPreco((double)25.99);
        assertEquals((double)25.99, brinquedo1.getPreco(), 0);
    }
    
}