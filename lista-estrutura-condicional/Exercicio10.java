/*Enunciado

10.Solicite quatro números e verifique se pode ser um retângulo.

*/

import javax.swing.JOptionPane;

public class Exercicio10{

    public static void main(String[] args){

        double n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Digite a medida de um lado:", "Verificador - Quadrado?",JOptionPane.PLAIN_MESSAGE
            ));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Voce digitou: " + n1 + 
            ".\nDigite a medida de outro lado", "Verificador - Retangulo?",JOptionPane.PLAIN_MESSAGE
            ));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Voce digitou: " + n1 + " e " + n2 + 
            ".\nDigite a medida de outro lado", "Verificador - Retanglo?",JOptionPane.PLAIN_MESSAGE
            ));
        double n4 = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Voce digitou: " + n1 + ", " + n2 + " e " + n3 + 
            ".\nDigite a medida de outro lado", "Verificador - Retangulo?",JOptionPane.PLAIN_MESSAGE
            ));

        if((n1 == n2 && n3 == n4)||(n1 == n3 && n2 == n4)||(n1 == n4 && n3 == n2)){
            JOptionPane.showMessageDialog(null, "Os lados " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + " formam um retangulo.");
        }

        else{
            JOptionPane.showMessageDialog(null, "Os lados " + n1 + ", " + n2 + ", " + n3 + " e " + n4 + " nao formam um retangulo.");
        }

	}

}