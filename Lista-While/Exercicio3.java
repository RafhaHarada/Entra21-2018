/*
Enunciado:

3. Solicite o peso para o usuário até que o peso seja menor que 0 ou maior que
300,00, apresente ao final a quantidade de pessoas que informaram o peso.

*/


import javax.swing.JOptionPane;

public class Exercicio3{

    public static void main(String[] args){

        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: ", "Contador de Peso", JOptionPane.QUESTION_MESSAGE));
        int quantidade = 0;

        while(peso > 0 && peso < 300){
            peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: ", "Contador de Peso", JOptionPane.QUESTION_MESSAGE));
            if(peso < 0){
                JOptionPane.showMessageDialog(null, "Peso Inválido.\n\nSaindo do sistema...", "Fechando Sistema", JOptionPane.WARNING_MESSAGE);
            }
            if(peso > 300){
                JOptionPane.showMessageDialog(null, "Peso Acima do Normal, consulte um médico.\n\nSaindo do sistema...", "Fechando Sistema", JOptionPane.WARNING_MESSAGE);
            }
            quantidade = quantidade + 1;
        }
        
        JOptionPane.showMessageDialog(null, quantidade + " pessoas que informaram seu peso.", "Contador de Peso", JOptionPane.INFORMATION_MESSAGE);

    }
}