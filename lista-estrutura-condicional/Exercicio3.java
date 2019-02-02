/*Enunciado

3.Solicite para o usuário dois números e apresente o seguinte menu:
MENU
1Somar
2Subtrair
3Multiplicar
4Dividir

Após usuário escolher o número do menu, deve-se apresentar o cálculo dos dois números
solicitados de acordo com o menu solicitado.

*/

import javax.swing.*;
import java.awt.*;

public class Exercicio3 {
    
    public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, "Calculadora simples");

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero 1:"));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero 2:"));

        int entrada = Integer.parseInt(JOptionPane.showInputDialog(
        	"Menu:\n\n"+
        	"1 - Soma\n" +
        	"2 - Subtracao\n" +
        	"3 - Multiplicacao\n" +
        	"4 - Divisao\n\n"
        	));

        double saida = 0;

        if (entrada == 1){
        	saida = numero1 + numero2;
            JOptionPane.showMessageDialog(null,
                "A soma de " + numero1 +
                " e " + numero2 +
                " eh igual a " + saida
                );
        }

        else if (entrada == 2){
        	saida = numero1 - numero2;
            JOptionPane.showMessageDialog(null,
                "A subtracao de " + numero1 +
                " e " + numero2 +
                " eh igual a " + saida
                );
        }

        else if (entrada == 3){
        	saida = numero1 * numero2;
            JOptionPane.showMessageDialog(null,
                "A multiplicacao de " + numero1 +
                " e " + numero2 +
                " eh igual a " + saida
                );
        }

        else if (entrada == 4){
        	saida = numero1 / numero2;
            JOptionPane.showMessageDialog(null,
                "A divisao de " + numero1 +
                " e " + numero2 +
                " eh igual a " + saida
                );
        }
        
        else{
            JOptionPane.showMessageDialog(null,
                "Este operador eh invalido!"
                );
        }

	}
}
