
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Alipio Harada
 */
/* Enunciado:
    9. Desenvolver um algoritmo que solicite 5 números ao usuário e deve se verificar se o
elemento que está contido na primeira posição é igual ao último elemento deste
ArrayList.

 */
public class Exercicio09 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número inteiro:", (i + 1) + "º Número Inteiro", JOptionPane.QUESTION_MESSAGE)));
        }
        
        if(numeros.get(0) == numeros.get(numeros.size()-1)){
            JOptionPane.showMessageDialog(null, "Os números da primeira e ultima posição são iguais","Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Os números da primeira e ultima posição não  são iguais","Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
