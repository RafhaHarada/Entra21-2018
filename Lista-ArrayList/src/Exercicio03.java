
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    3. Desenvolver um algoritmo que crie um ArrayList para armazenar char, deve-se
armazenar 15 caracteres, apresentar todos os caracteres armazenados no ArrayList.
Obs.: não é permitido utilizar nenhuma estrutura de repetição (for, while, do while).

 */
public class Exercicio03 {

    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();

        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "1º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "2º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "3º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "4º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "5º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "6º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "7º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "8º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "9º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "10º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "11º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "12º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "13º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "14º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));
        chars.add(JOptionPane.showInputDialog(null, "Insira um caracter:", "15º Caracter", JOptionPane.QUESTION_MESSAGE).charAt(0));

        JOptionPane.showMessageDialog(null, 
                "\n1º Caracter: " + chars.get(0) + 
                "\n2º Caracter: " + chars.get(1) + 
                "\n3º Caracter: " + chars.get(2) + 
                "\n4º Caracter: " + chars.get(3) + 
                "\n5º Caracter: " + chars.get(4) + 
                "\n6º Caracter: " + chars.get(5) + 
                "\n7º Caracter: " + chars.get(6) + 
                "\n8º Caracter: " + chars.get(7) + 
                "\n9º Caracter: " + chars.get(8) + 
                "\n10º Caracter: " + chars.get(9) + 
                "\n11º Caracter: " + chars.get(10) +
                "\n12º Caracter: " + chars.get(11) +
                "\n13º Caracter: " + chars.get(12) +
                "\n14º Caracter: " + chars.get(13) +
                "\n15º Caracter: " + chars.get(14),
                "Caracters",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
