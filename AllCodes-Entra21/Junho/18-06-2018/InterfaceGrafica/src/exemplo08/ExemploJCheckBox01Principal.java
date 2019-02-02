package exemplo08;

import java.awt.EventQueue;

/**
 *
 * @author Rafael Alipio Harada
 */
public class ExemploJCheckBox01Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ExemploJCheckBox01();
            }
        });
    }
    
}
