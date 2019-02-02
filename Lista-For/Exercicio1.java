/*
Enunciado:
1. Faça um algoritmo que apresente a tabuada de acordo com o número informado:
Exemplo número 12.
Tabuada do número 12
12 x 0 = 0
12 x 1 = 12
12 x 2 = 24
12 x 3 = 36
12 x 4 = 48
12 x 5 = 60
12 x 6 = 72
12 x 7 = 84
12 x 8 = 96
12 x 9 = 108
12 x 10 = 120
*/

import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um numero: ", "Tabuada do Usuário", JOptionPane.QUESTION_MESSAGE));
        String texto = "";
        for (int i = 0; i < 11; i++) {
            texto = texto + numero + "X" + i + " = " + (numero*i) + "\n";
        }
        JOptionPane.showMessageDialog(null, texto, "Tabuada do " + numero, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}