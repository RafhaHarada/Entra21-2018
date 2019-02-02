/*
Enunciado:

5. Solicite para o usuário dois números. Apresente o seguinte menu e de acordo com a
escolha deve ser apresentado a operação aritmética, isto deve ocorrer até que o
mesmo escolha a opção de sair:

MENU
1 Somar
2 Subtrair
3 Multiplicar
4 Dividir
5 Sair

*/


import javax.swing.JOptionPane;

public class Exercicio5{

    public static void main(String[] args){

        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Insira um número:", 
            "Operações Aritméticas",
            JOptionPane.QUESTION_MESSAGE));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Insira outro número:", 
            "Operações Aritméticas",
            JOptionPane.QUESTION_MESSAGE));
        double resultado = 0;
        String operacao = "";
        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Escolha uma operação aritmética:\n" + 
                "\nMENU" +
                "\n1 Somar" +
                "\n2 Subtrair" +
                "\n3 Multiplicar" +
                "\n4 Dividir" +
                "\n5 Sair", 
                "Operações Aritméticas",
                JOptionPane.QUESTION_MESSAGE));
        while(menu != 5){
            if(menu == 1){
                resultado = numero1 + numero2;
                operacao = "+";
            }
            else if(menu == 2){
                resultado = numero1 - numero2;
                operacao = "-";
            }
            else if(menu == 3){
                resultado = numero1 * numero2;
                operacao = "*";
            }
            else if(menu == 4){
                resultado = numero1 / numero2;
                operacao = ":";
            }
            else{
                JOptionPane.showMessageDialog(null, "Operação inválida", "Erro 001", JOptionPane.ERROR_MESSAGE);
            }
            
        JOptionPane.showMessageDialog(null, 
            "Resultado da conta:\n  " + 
            numero1 +
            "\n" + operacao +
            "\n  " + numero2 +
            "\n  " + String.format("%.2f", resultado), 
            "Resultado", 
            JOptionPane.ERROR_MESSAGE);
            
        menu = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Escolha uma operação aritmética:\n" + 
                "\nMENU" +
                "\n1 Somar" +
                "\n2 Subtrair" +
                "\n3 Multiplicar" +
                "\n4 Dividir" +
                "\n5 Sair", 
                "Operações Aritméticas",
                JOptionPane.QUESTION_MESSAGE));
        }

    }
}