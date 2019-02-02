/*
Enunciado:
3. Faça um algoritmo que apresente o quadrado abaixo utilizando for.
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
* * * * * * * * * * * * * * * * * * * * *
*/

import javax.swing.JOptionPane;

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        String texto = "";
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 21; j++) {
                texto += "  *   ";
            }
            texto += "\n";
        }
        JOptionPane.showMessageDialog(null, texto, "Quadrado Estelar", JOptionPane.PLAIN_MESSAGE);
    }
    
}