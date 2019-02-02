
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    6. Desenvolver um algoritmo que crie um ArrayList para armazenar números inteiros .
Solicite ao usuário quinze números e ao final apresente os números que estão
armazenados no ArrayList.
 */
public class Exercicio06 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "1º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "2º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "3º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "4º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "5º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "6º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "7º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "8º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "9º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "10º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "11º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "12º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "13º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "14º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", "15º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));

        JOptionPane.showMessageDialog(null, 
                "\n1º Número Inteiro: " + numeros.get(0) + 
                "\n2º Número Inteiro: " + numeros.get(1) + 
                "\n3º Número Inteiro: " + numeros.get(2) + 
                "\n4º Número Inteiro: " + numeros.get(3) + 
                "\n5º Número Inteiro: " + numeros.get(4) + 
                "\n6º Número Inteiro: " + numeros.get(5) + 
                "\n7º Número Inteiro: " + numeros.get(6) + 
                "\n8º Número Inteiro: " + numeros.get(7) + 
                "\n9º Número Inteiro: " + numeros.get(8) + 
                "\n10º Número Inteiro: " + numeros.get(9) + 
                "\n11º Número Inteiro: " + numeros.get(10) +
                "\n12º Número Inteiro: " + numeros.get(11) +
                "\n13º Número Inteiro: " + numeros.get(12) +
                "\n14º Número Inteiro: " + numeros.get(13) +
                "\n15º Número Inteiro: " + numeros.get(14),
                "Números",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

}
