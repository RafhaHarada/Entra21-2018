/*Enunciado

16. Faça um sistema que realize a conversão da temperatura, solicite os seguintes dados:
    Temperatura;
    Escala da temperatura de origem;
    Escala da temperatura de destino;
Opções de origem e destino:
Celsius,Fahrenheit e Kelvin

*/

import javax.swing.JOptionPane;

public class Exercicio16{

    public static void main(String[] args){

        double temperatura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a temperatura", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE));
        double conversao = 0;

        Object[] opcoes = { "Celsius", "Fahrenheit", "Kelvin" };

        int origem = JOptionPane.showOptionDialog(null, "Converter o valor " + temperatura + " de:", "Origem da temperatura",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]
        );
        
        int destino = JOptionPane.showOptionDialog(null, "Converter o valor " + temperatura + " para:", "Destino da temperatura",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, opcoes, opcoes[0]
        );

        if (origem == 0 && destino == 1){
            conversao = temperatura * 1.8 + 32;
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + temperatura + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + conversao + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE 
            );
        }//Celsius -> Fahrenheit -> Kelvin

        else if (origem == 0 && destino == 2){
            conversao = temperatura + 273;
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + temperatura + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + conversao + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE 
            );
        }//Celsius -> Kelvin

        else if (origem == 1 && destino == 0){
            conversao = (temperatura - 32) / 1.8;
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + temperatura + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + conversao + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE 
            );
        }//Fahrenheit -> Celsius

        else if (origem == 1 && destino == 2){
            conversao = (temperatura - 32) / 1.8 + 273;
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + temperatura + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + conversao + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE 
            );
        }//Fahrenheit -> Kelvin

        else if (origem == 2 && destino == 0){
            conversao = temperatura - 273;
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + temperatura + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + conversao + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE 
            );
        }//Kelvin -> Celsius

        else if (origem == 2 && destino == 1){
            conversao = (temperatura - 32) / 1.8 - 273;
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + temperatura + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + conversao + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE 
            );
        }//Kelvin -> Fahrenheit

        else{ 
            JOptionPane.showMessageDialog(null, 
                "Temperatura inicial: " + String.format("%.2f",temperatura) + " graus " + opcoes[origem] +
                "\nTemperatura convertida: " + temperatura + " graus " + opcoes[destino],
                "Conversao Final", JOptionPane.INFORMATION_MESSAGE
            );
        }//Nenhuma conversao
	}

}