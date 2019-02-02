/*
Enunciado:

14. Solicite um número e faça o fatoracao deste número, utilizando while.

*/


import javax.swing.JOptionPane;

public class Exercicio14{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número:","fatoração",JOptionPane.QUESTION_MESSAGE));
        int divisor = 2;
        String fatoracao = "";

        while(numero == 1 || numero == 0 || numero == -1){
            JOptionPane.showMessageDialog(null,"Você inseriu: -1, 0 ou 1.\nEstes números não são fatoráveis.\n\nTente novamente!","Erro 001",JOptionPane.ERROR_MESSAGE);
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira novamente um número:","fatoração",JOptionPane.QUESTION_MESSAGE));
        }

        int numeroInicial = numero;

        while(numero != 1 && numero != -1){
            if(numero % divisor == 0){
                fatoracao = fatoracao + numero + "|" + divisor + "\n";
                numero = numero / divisor;
                if(numero == 1 || numero == -1){
                    fatoracao = fatoracao + numero + "|";
                }
            }
            else{
                divisor++;
            }
        }
        JOptionPane.showMessageDialog(null,
            "A fatoração de " + numeroInicial + 
            " é:\n\n" + fatoracao,
            "Erro 001",
            JOptionPane.INFORMATION_MESSAGE);

    }
}