package exemplo09;

import java.awt.EventQueue;

/**
 *
 * @author Alunos
 */
public class ExemploJTable01Principal {
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new ExemploJTable01();
            }
        });
        
    }
    
}
