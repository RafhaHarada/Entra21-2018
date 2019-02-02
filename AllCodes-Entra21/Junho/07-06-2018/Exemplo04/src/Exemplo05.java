
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
public class Exemplo05 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            while (true) {
                try {
                    numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número")));
                    while (numeros.get(i) < 0) {
                        JOptionPane.showMessageDialog(null, "Voce nao pode escrever numeros negativos");
                        numeros.remove(i);
                        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o " + (i + 1) + "º número")));
                    }
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Sua jamanta ♥, TA ESCRITO NUMERO", "AFF..", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        String texto = "";
        for (int i = 0; i < numeros.size(); i++) {
            texto += (i + 1) + "º Número = " + numeros.get(i) + "\n";
        }

        JOptionPane.showMessageDialog(null, texto);

    }

}
