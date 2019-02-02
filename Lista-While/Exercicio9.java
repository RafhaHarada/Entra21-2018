/*
Enunciado:

9. Solicite ao usuário um texto e utilizando o while apresente caracter por caracter.
Exemplo:
Texto: Lorem ipsum da Silva
L
o
r
e
m
i
p
s
u
m
d
a
S

i
l
v
a

*/


import javax.swing.JOptionPane;

public class Exercicio9{

    public static void main(String[] args){

        String texto = JOptionPane.showInputDialog(null, "Digite uma String:", "Transformador de String em Char", JOptionPane.QUESTION_MESSAGE);
        int contador = texto.length();
        String textoLetra = "";
        int i = 0;

        while(contador != 0){
            textoLetra = textoLetra + "\n" + texto.charAt(i);
            i = i + 1;
            contador = contador - 1;
        }

        JOptionPane.showMessageDialog(null, "Os characters em vertical é:" + textoLetra, "Transformador de String em Char", JOptionPane.INFORMATION_MESSAGE);

    }
}