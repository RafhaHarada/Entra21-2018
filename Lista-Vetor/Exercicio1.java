import javax.swing.JOptionPane;

/*
Enunciado:
1. Crie um vetor para guardar 16 números inteiros.
Preencha todas as posições com números e apresente a soma destes números.
*/

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        int[] vetor = new int[16];
        vetor[0] = 11;
        vetor[1] = 12;
        vetor[2] = 13;
        vetor[3] = 14;
        vetor[4] = 15;
        vetor[5] = 16;
        vetor[6] = 17;
        vetor[7] = 18;
        vetor[8] = 19;
        vetor[9] = 20;
        vetor[10] = 21;
        vetor[11] = 22;
        vetor[12] = 23;
        vetor[13] = 24;
        vetor[14] = 25;
        vetor[15] = 26;

        int soma =  vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4] + vetor[5] + vetor[6] + vetor[7] + vetor[8] + vetor[9] + vetor[10] + vetor[11] + vetor[12] + vetor[13] + vetor[14] + vetor[15];

        JOptionPane.showMessageDialog(null, "Soma dos vetores = " +  soma, "Soma de vetores", JOptionPane.INFORMATION_MESSAGE);

    }
    
}