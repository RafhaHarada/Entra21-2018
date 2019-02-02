import javax.swing.JOptionPane;

public class ExemploFor4 {
    
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println(i + " x " + j + " = " + i*j);
            }
            System.out.println("");
        }

    }
}