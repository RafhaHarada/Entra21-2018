/*
Enunciado:

14. Solicite um número e faça o fatorial deste número, utilizando while.

*/


import javax.swing.JOptionPane;

public class Exercicio14{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira um número:","Fatorial",JOptionPane.QUESTION_MESSAGE));
        while(numero <= 0){
            JOptionPane.showMessageDialog(null,"Erro de entrada.\nInsira um número positivo","ERROR 001",JOptionPane.ERROR_MESSAGE);
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Insira novamente um número:","Fatorial",JOptionPane.QUESTION_MESSAGE));
        }
        int contador = 1;
        int numeroInicial = numero;
        long resultado = 1;
        String fatorial = "" + numero;
        while(numero != 1){
            resultado = resultado*numero;
            if (contador < 3){
                fatorial = fatorial + "x" + (numero - 1);
            }
            else if(contador == 3) {
                fatorial = fatorial + "...";
            }
            else if(numero <= 4){
                fatorial = fatorial + "x" + (numero - 1);
            }
            numero --;
            contador ++;
            if(numero == 1){
                fatorial = fatorial + " = " + resultado;
            }
        }


        JOptionPane.showMessageDialog(null,
            "O fatorial de " + numeroInicial + 
            " é:\n\n" + fatorial,
            "Fatorial de " + numeroInicial,
            JOptionPane.INFORMATION_MESSAGE);

    }
}