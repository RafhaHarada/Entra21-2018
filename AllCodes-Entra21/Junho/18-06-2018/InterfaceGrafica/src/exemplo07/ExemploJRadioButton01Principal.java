
package exemplo07;

import exemplo06.*;
import java.awt.EventQueue;

/**
 *
 * @author Rafael Alipio Harada
 */
public class ExemploJRadioButton01Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new ExemploJRadioButton01();
            }
        });
    }
}
