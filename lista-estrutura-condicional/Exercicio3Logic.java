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
        	"Escolha uma operacao:\n\n"+
        	"1 - Soma\n" +
        	"2 - Subtracao\n" +
        	"3 - Multiplicacao\n" +
        	"4 - Divisao\n\n" +
        	));
        if(entrada == 1){
        	
        }
        }
	}
