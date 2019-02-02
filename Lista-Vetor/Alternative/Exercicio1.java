import javax.swing.JOptionPane;

/*
Enunciado:
1. Crie um vetor para guardar 16 números inteiros.
Preencha todas as posições com números e apresente a soma destes números.
*/

public class Exercicio1 {
    
    public static void main(String[] args) {

        int i = 0, soma = 0;

        int[] vetor = new int[16];
        
        while(i != 16){
            vetor[i] = i+2;
            soma = soma + vetor[i];
            System.out.println(soma);
            i++;

        }

        JOptionPane.showMessageDialog(null, 
            "Soma dos vetores = " +  soma, 
            "Soma de vetores", 
            JOptionPane.INFORMATION_MESSAGE);

    }
    
}