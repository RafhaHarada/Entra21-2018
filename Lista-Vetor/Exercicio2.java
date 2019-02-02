import javax.swing.JOptionPane;

/*
Enunciado:
2. Crie um vetor para guardar 10 nomes e apresente os dez nomes.
*/

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        String[] vetor = new String[10];
        vetor[0] = "Alpaca"; 
        vetor[1] = "Boi"; 
        vetor[2] = "Cabra"; 
        vetor[3] = "Dinossauro"; 
        vetor[4] = "Escorpião"; 
        vetor[5] = "Falcão"; 
        vetor[6] = "Girafa"; 
        vetor[7] = "Hiena"; 
        vetor[8] = "Iguana"; 
        vetor[9] = "Jiboia"; 

        String soma = vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4] + ", " + vetor[5] + ", " + vetor[6] + ", " + vetor[7] + ", " + vetor[8] + ", " + vetor[9];

        JOptionPane.showMessageDialog(null, "Os dez nomes são: " + soma, "Animais e Onde Habitam", JOptionPane.INFORMATION_MESSAGE);

    }
    
}