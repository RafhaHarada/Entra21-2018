import javax.swing.JOptionPane;

/*
Enunciado:
1. Desenvolver um programa que armazene 25 nomes, para tal utilize um vetor com 25
posições e o comando for para armazenar os valores.
Observação: para armazenar os valores deve-se solicitar os nomes ao usuário.
*/
public class Exercicio1 {

    public static void main(String[] args) {
        
        String nomes[] = new String[25];
        String texto = "";

        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog(null,"Digite um nome: ", (i+1) + "º Nome", JOptionPane.QUESTION_MESSAGE);
        }
        for (int i = 0; i < nomes.length; i++) {
            if(i < (nomes.length - 2)){
                texto += nomes[i] + ", ";
            }
            else if(i < (nomes.length - 1)){
                texto += nomes[i] + " e ";
            }
            else{
                texto += nomes[i] + ". ";
            }
        }
        JOptionPane.showMessageDialog(null, "Os nomes postos foram:\n" + texto, "Nomes", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}