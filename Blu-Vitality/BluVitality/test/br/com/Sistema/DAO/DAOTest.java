/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Sistema.DAO;

import br.com.Sistema.Bean.CargosBean;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gus
 */
public class DAOTest {
    
    public DAOTest() {
    }

    @Test(expected=NullPointerException.class)
    public void inserir() {
        CargosBean cargo = new CargosBean();
        CargosDAO dao = new CargosDAO();
        
        if ( dao.alterar(cargo)) {
            System.out.print("Salvo com sucesso");
            
        } else {
            fail("Erro");
        }
        
    }
    
}
