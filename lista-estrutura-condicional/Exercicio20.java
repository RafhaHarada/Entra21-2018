/*Enunciado

20.Faça o cálculo do IMC (Índice de massa corporal), para tal solicite o peso e a altura
do usuário, realize o cálculo, e apresente ao final sua classificação de acordo com seu imc.
Valor do IMC
Até 9.99            Desnutrição Grau V
de 10 até 12,9      Desnutrição Grau IV
de 13 até 15,9      Desnutrição Grau III
de 16 até 16,9      Desnutrição Grau II
de 17 até 18,4      Desnutrição Grau I
de 18,5 até 24,9    Normal
de 25 até 29,9      Pré-obesidade
de 30 até 34,5      Obesidade Grau I
de 35 até 39,9      Obesidade Grau II
Maior que 39.9      Obesidade Grau III

*/

import javax.swing.JOptionPane;

public class Exercicio20{

    public static void main(String[] args){

        String classificacao = "";
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite seu peso:", 
            "Calculo de IMC", 
            JOptionPane.QUESTION_MESSAGE
        ));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Digite sua altura:", 
            "Calculo de IMC", 
            JOptionPane.QUESTION_MESSAGE
        ));
        double calculo = peso/(altura*altura);
        
        if(calculo <= 0){JOptionPane.showMessageDialog(null, "Classificacao indeterminada", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);}
            else if(calculo <= 9.99){classificacao = "Desnutrição Grau V";}
            else if(calculo <= 12.99){classificacao = "Desnutrição Grau IV";}
            else if(calculo <= 15.99){classificacao = "Desnutrição Grau III";}
            else if(calculo <= 16.99){classificacao = "Desnutrição Grau II";}
            else if(calculo <= 18.49){classificacao = "Desnutrição Grau I";}
            else if(calculo <= 24.99){classificacao = "Normal";}
            else if(calculo <= 29.99){classificacao = "Pré-obesidade";}
            else if(calculo <= 34.99){classificacao = "Obesidade Grau I";}
            else if(calculo <= 39.99){classificacao = "Obesidade Grau II";}
            else if(calculo > 39.99){classificacao = "Obesidade Grau III";}
        else {JOptionPane.showMessageDialog(null, "Classificacao indeterminada", "Error 404", JOptionPane.ERROR_MESSAGE);System.exit(0);;}

        JOptionPane.showMessageDialog(null, 
            "Valor do IMC" +
            "\nAté 9.99            Desnutrição Grau V" +
            "\nde 10 até 12,9      Desnutrição Grau IV" +
            "\nde 13 até 15,9      Desnutrição Grau III" +
            "\nde 16 até 16,9      Desnutrição Grau II" +
            "\nde 17 até 18,4      Desnutrição Grau I" +
            "\nde 18,5 até 24,9    Normal" +
            "\nde 25 até 29,9      Pré-obesidade" +
            "\nde 30 até 34,9      Obesidade Grau I" +
            "\nde 35 até 39,9      Obesidade Grau II" +
            "\nMaior que 39.9      Obesidade Grau III" +
            "\n\nSeu valor de IMC é: " + String.format("%.2f", calculo) +
            "\nStatus de IMC: " + classificacao, "IMC Status", JOptionPane.INFORMATION_MESSAGE
        );

	}

}