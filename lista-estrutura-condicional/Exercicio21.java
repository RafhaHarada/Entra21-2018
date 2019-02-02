/*Enunciado

21.Solicite três números e informe se estes valores podem caracterizar um triângulo e o
tipo do triângulo.
Para ser um triângulo a soma de dois lados terá que ser menor que o outro lado, isto deve
ser aplicado para todos os lados.
Tipos de triângulo:
    Triângulo equilátero: os três lados são iguais;
    Triângulo isósceles: dois lados são iguais;
    Triângulo escaleno: três lados são diferentes.

*/

import javax.swing.JOptionPane;

public class Exercicio21{

    public static void main(String[] args){
    
        double lado1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite um lado", "Lado 1", JOptionPane.QUESTION_MESSAGE));
            if(lado1 <= 0){JOptionPane.showMessageDialog(null,"As medidas impostas não formam um triângulo", "Erro 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro lado", "Lado 2", JOptionPane.QUESTION_MESSAGE));
            if(lado2 <= 0){JOptionPane.showMessageDialog(null,"As medidas impostas não formam um triângulo", "Erro 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite outro lado", "Lado 3", JOptionPane.QUESTION_MESSAGE));
            if(lado3 <= 0){JOptionPane.showMessageDialog(null,"As medidas impostas não formam um triângulo", "Erro 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
        
        String classificacao = "";

        //Equilatero
            if (lado1 != 0 && lado2 != 0 && lado3 != 0 && lado1 == lado2 && lado2 == lado3){
                classificacao = "Equilátero";
            }
        //Isosceles
            else if (lado1 != 0 && lado2 != 0 && lado3 != 0 && lado1 == lado2 && lado2 != lado3 || lado2 == lado3  && lado2 != lado1 || lado3 == lado1 && lado2 != lado3){
                classificacao = "Isósceles";
            }
        //Escaleno
            else if (lado1 != 0 && lado2 != 0 && lado3 != 0 && lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
                classificacao = "Escaleno";
            }
            else{
                JOptionPane.showMessageDialog(null,"As medidas impostas não formam um triângulo", "Erro 404", JOptionPane.ERROR_MESSAGE);System.exit(0);
            }

        JOptionPane.showMessageDialog(null, "As medidas colocadas formam um triângulo " + 
            classificacao, "Triângulo alguma coisa...", JOptionPane.INFORMATION_MESSAGE);
    }

}