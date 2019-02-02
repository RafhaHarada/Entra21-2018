package principal;

import java.awt.EventQueue;
import view.AlunosCadastro;

/**
 * @author Rafael Alipio Harada
 */
public class Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlunosCadastro();
            }
        });
    }
    
}
