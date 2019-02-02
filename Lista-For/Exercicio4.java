/*
Enunciado:
4. Faça um algoritmo que apresente o quadrado abaixo:
* * * * * * * * * * * * * * * * * * * * *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
*                                       *
* * * * * * * * * * * * * * * * * * * * *
*/

import javax.swing.JOptionPane;

public class Exercicio4 {
    
    public static void main(String[] args) {
        
        String texto = "";
        for (int i = 0; i < 21; i++) {
            if(i == 0 || i == 20){
                for (int j = 0; j < 21; j++) {
                    texto += "   *   ";
                }
            }
            else{
                for (int j = 0; j < 21; j++) {
                    if(j == 0 || j == 20){
                        texto += "  *";

                    }
                    else{
                        texto += "        ";
                    }
                }
            }
            texto += "\n";
        }
        JOptionPane.showMessageDialog(null, texto, "Quadrado Estelar", JOptionPane.PLAIN_MESSAGE);
    }
    
}