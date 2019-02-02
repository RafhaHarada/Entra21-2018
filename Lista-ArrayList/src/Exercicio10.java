
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Alipio Harada
 */
/* Enunciado:
 10. Crie um ArrayList solicitando ao usuário sete números, após isso crie outro ArrayList
 solicitando ao usuário sete números. Verifique se os elementos que estão
 armazenados no primeiro são iguais aos elementos que estão armazenados no
 segundo ArrayList.
 */
public class Exercicio10 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros1 = new ArrayList<>();
        ArrayList<Integer> numeros2 = new ArrayList<>();
        ArrayList<Integer> numeros3 = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            numeros1.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", (i + 1) + "º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        }

        for (int i = 0; i < 7; i++) {
            numeros2.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", (i + 1) + "º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        }

        int quantidade = 0;
        String texto = "\n";
        
        aqui: for (int i = 0; i < numeros1.size(); i++) {
            for (int j = 0; j < numeros2.size(); j++) {
                for (int k = 0; k < numeros3.size(); k++) {
                    if (numeros1.get(i) == numeros3.get(k)) {
                        continue aqui;
                    }
                }
                if (numeros1.get(i) == numeros2.get(j)) {
                    quantidade++;
                    texto += numeros1.get(i) + "\n";
                    numeros3.add(numeros1.get(i));
                }
            }
        }
        if (quantidade > 0) {
            JOptionPane.showMessageDialog(null, "Foram encontrados " + quantidade + " números iguais.\n" + "Sendo eles:\n" + texto, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Não foram encontrados números iguais!", "Resultado", JOptionPane.WARNING_MESSAGE);

        }
    }

}
