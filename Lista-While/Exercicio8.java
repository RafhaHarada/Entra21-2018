/*
Enunciado:

8. Solicitar a quantidade de caracteres que serão digitados. Após isto solicitando um
caracter por vez e armazenar o texto, no final deve-se apresentar o texto.
Exemplo:
Quantidade de caracteres digitados:
Caracter: a
Caracter:
Caracter: c
Caracter: a
Caracter: m
Caracter: i
Caracter: s
Caracter: a
Caracter:
Caracter: é
Caracter:
Caracter: a
Caracter: m
Caracter: a
Caracter: r
Caracter: e
Caracter: l
Caracter: a
Para solicitar o caracter ao usuário deve-se utilizar char.
Ao final apresente o texto contendo os caracteres que o usuário digitou.
Exemplo: “A camisa é amarela”

*/


import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class Exercicio8{

    public static void main(String[] args){

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de caracteres:", "Montador de Strings", JOptionPane.QUESTION_MESSAGE));
        String frase = "";
        int contador = 1;
        while (quantidade <= 0){
            JOptionPane.showMessageDialog(null, "Quantidade inválida", "Error 001", JOptionPane.ERROR_MESSAGE);
            quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente a quantidade de caracteres:", "Montador de Strings", JOptionPane.QUESTION_MESSAGE));
        }
        while(quantidade != 0){
            String letra = JOptionPane.showInputDialog(null, "Digite um caracter", "Caracter número" + contador + ", faltam " + quantidade, JOptionPane.QUESTION_MESSAGE);
            while(letra.length() > 1 || letra.length() == 0){
                JOptionPane.showMessageDialog(null, "Você digitou mais de um caracter ou nenhum, digite novamente!", "Error 001", JOptionPane.ERROR_MESSAGE);
                letra = JOptionPane.showInputDialog(null, "Digite apenas um caracter", "Caracter número" + contador + ", faltam " + quantidade, JOptionPane.QUESTION_MESSAGE);
            }
            frase = frase + letra;
            contador ++;
            quantidade --;
        }
        JOptionPane.showMessageDialog(null, "A string formada foi:\n" + frase, "Montador de Strings", JOptionPane.INFORMATION_MESSAGE);

    }
}