/*
Enunciado:

1. Solicite nomes ao usuário até que o mesmo digite fim para o nome.

*/


import javax.swing.JOptionPane;

public class Exercicio1{

    public static void main(String[] args){

        String nomes = JOptionPane.showInputDialog(null, "Digite nomes para listar:\nDigite \"Fim\" para fechar a lista", "Lista de nomes", JOptionPane.QUESTION_MESSAGE), lista = "";

        while(!nomes.equalsIgnoreCase("fim")){

            lista = lista + "\n" + nomes;

            nomes = JOptionPane.showInputDialog(null, "Digite nomes para listar:\nDigite \"Fim\" para fechar a lista", "Lista de nomes", JOptionPane.QUESTION_MESSAGE);
        }
        if(!lista.equals("")){
            JOptionPane.showMessageDialog(null, lista, "Lista de Nomes", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você não listou nada", "Lista de Nomes", JOptionPane.WARNING_MESSAGE);
        }
    }
}