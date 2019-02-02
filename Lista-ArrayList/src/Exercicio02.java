
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    2. Desenvolver um algoritmo que crie um ArrayList para armazenar nomes, deve-se
 armazenar 9 nomes, apresentar todos os nomes contidos no ArrayList.
 Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).
 */
public class Exercicio02 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "1º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "2º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "3º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "4º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "5º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "6º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "7º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "8º Nomes", JOptionPane.QUESTION_MESSAGE));
        nomes.add(JOptionPane.showInputDialog(null, "Insira um nome:", "9º Nomes", JOptionPane.QUESTION_MESSAGE));
    
        JOptionPane.showMessageDialog(null, 
                "\n1º Nome: " + nomes.get(0) + 
                "\n2º Nome: " + nomes.get(1) + 
                "\n3º Nome: " + nomes.get(2) + 
                "\n4º Nome: " + nomes.get(3) + 
                "\n5º Nome: " + nomes.get(4) + 
                "\n6º Nome: " + nomes.get(5) + 
                "\n7º Nome: " + nomes.get(6) + 
                "\n8º Nome: " + nomes.get(7) + 
                "\n9º Nome: " + nomes.get(8),
                "Nomes",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
