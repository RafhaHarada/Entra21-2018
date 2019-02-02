import javax.swing.JOptionPane;

/*
Enunciado:
6. Solicite a idade de 9 pessoas, apresente ao final a pessoa com a maior
idade.
*/

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        String escrita = ""; 

        int idadeMaior = Integer.MIN_VALUE, i = 0;
        int[] idades = new int[9];
        
        while (i != 9) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da " + (i+1) + "ª pessoa:", "Idade nº" + (i+1), JOptionPane.INFORMATION_MESSAGE));
            if(idades[i] > idadeMaior){
                idadeMaior = idades[i];
            }
            escrita = escrita + "\nIdade da " + (i+1) + "ª Pessoa: " + idades[i];
            i++;
        }
        
        JOptionPane.showMessageDialog(null, "Idades inseridas:\n" + escrita + "\n\nA maior idade é: " + idadeMaior, "Idades Aleatórias", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
}