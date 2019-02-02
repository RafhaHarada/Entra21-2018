import javax.swing.JOptionPane;

/*
Enunciado:
2. Crie um vetor para guardar 10 nomes e apresente os dez nomes.
*/

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        int i = 0; 

        String soma = "";

        String[] vetor = new String[10];
        
        while(i != 10){
            if(i %2 == 0){
                vetor[i] = "Yo\n";
            }
            else if(i %2 != 0){
                vetor[i] = "ho\n";
            }
            soma = soma + vetor[i];
            i++;
            
        }

        JOptionPane.showMessageDialog(null, "Os dez nomes são: \n" + soma, "Animais e Onde Habitam", JOptionPane.INFORMATION_MESSAGE);

    }
    
}