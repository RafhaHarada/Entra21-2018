
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    5. Solicite ao usuário quatro nomes e um outro nome, com esse nome, deve-se
 verificar se ele está contido o ArrayList ou não e esta informação deve ser
 apresentada ao usuário.

 */
public class Exercicio05 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "1º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "2º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "3º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "4º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "5º Nomes", JOptionPane.QUESTION_MESSAGE));

        String comparacao = JOptionPane.showInputDialog(null, "Procure um nome:", "Nomes", JOptionPane.QUESTION_MESSAGE);

        for (int i = 0; i < nomes.size(); i++) {
            if (comparacao.equals(nomes.get(i))) {
                JOptionPane.showMessageDialog(null, "O nome " + comparacao + " foi encontrado no Array!","Resposta",JOptionPane.INFORMATION_MESSAGE);
                break;
            }
            if(i == nomes.size()-1){
                JOptionPane.showMessageDialog(null, "O nome " + comparacao + " não foi encontrado no Array!","Resposta",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
