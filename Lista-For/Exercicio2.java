/*
Enunciado:
2. Faça um algoritmo que apresente todas as tabuadas de 1 até 10, conforme abaixo:
1 x 0 = 0
1 x 1 = 1
1 x 2 = 2
1 x 3 = 3
1 x 4 = 4
1 x 5 = 5
1 x 6 = 6
1 x 7 = 7
1 x 8 = 8
1 x 9 = 9
1 x 10 = 10
2 x 0 = 0
2 x 1 = 2
…………
2 x 9 = 18
…………
10 x 8 = 80
10 x 9 = 90
10 x 10 = 100
*/

import javax.swing.JOptionPane;

public class Exercicio2 {
    
    public static void main(String[] args) {

        String texto = "";
        for (int c = 0; c < 5; c++) {
            if(c == 0){
                for (int i = 1; i < 3; i++) {
                    for (int j = 0; j < 11; j++) {
                        texto += i + "X" + j + " = " + (j*i) + "\n";
                    }
                    texto += "\n";
                }
            }
            if(c == 1){
                for (int i = 3; i < 5; i++) {
                    for (int j = 0; j < 11; j++) {
                        texto += i + "X" + j + " = " + (j*i) + "\n";
                    }
                    texto += "\n";
                }
            }
            if(c == 2){
                for (int i = 5; i < 7; i++) {
                    for (int j = 0; j < 11; j++) {
                        texto += i + "X" + j + " = " + (j*i) + "\n";
                    }
                    texto += "\n";
                }
            }
            if(c == 3){
                for (int i = 7; i < 9; i++) {
                    for (int j = 0; j < 11; j++) {
                        texto += i + "X" + j + " = " + (j*i) + "\n";
                    }
                    texto += "\n";
                }
            }
            if(c == 4){
                for (int i = 9; i < 11; i++) {
                    for (int j = 0; j < 11; j++) {
                        texto += i + "X" + j + " = " + (j*i) + "\n";
                    }
                    texto += "\n";
                }
            }
            JOptionPane.showMessageDialog(null, texto, "Tabuada", JOptionPane.INFORMATION_MESSAGE);
            texto = "";
        }
    }
    
}