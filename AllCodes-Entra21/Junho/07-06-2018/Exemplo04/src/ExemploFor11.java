
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
public class ExemploFor11 {

    public static void main(String[] args) {
        
        primeiro: for (int i = 0; i < 3; i++) {
            segundo: for (int j = 0; j < 3; j++) {
                if(i == 1){
                    continue primeiro;
                }
                System.out.println(i + " " + j);
            }
        }
    }

}
