import javax.swing.JOptionPane;

/*
Enunciado:
6. Solicite a idade de 9 pessoas, apresente ao final a pessoa com a maior
idade.
*/

public class Exercicio6 {
    
    public static void main(String[] args) {
        
        int idadeMaior = Integer.MIN_VALUE;

        int[] idades = new int[9];
        idades[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 1ª pessoa:", "Idade nº1", JOptionPane.INFORMATION_MESSAGE));
        idades[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 2ª pessoa:", "Idade nº2", JOptionPane.INFORMATION_MESSAGE));
        idades[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 3ª pessoa:", "Idade nº3", JOptionPane.INFORMATION_MESSAGE));
        idades[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 4ª pessoa:", "Idade nº4", JOptionPane.INFORMATION_MESSAGE));
        idades[4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 5ª pessoa:", "Idade nº5", JOptionPane.INFORMATION_MESSAGE));
        idades[5] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 6ª pessoa:", "Idade nº6", JOptionPane.INFORMATION_MESSAGE));
        idades[6] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 7ª pessoa:", "Idade nº7", JOptionPane.INFORMATION_MESSAGE));
        idades[7] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 8ª pessoa:", "Idade nº8", JOptionPane.INFORMATION_MESSAGE));
        idades[8] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade da 9ª pessoa:", "Idade nº9", JOptionPane.INFORMATION_MESSAGE));

        if(idades[0] > idadeMaior){
                idadeMaior=idades[0];
            }
            if(idades[1] > idadeMaior){
                idadeMaior=idades[1];
            }
            if(idades[2] > idadeMaior){
                idadeMaior=idades[2];
            }
            if(idades[3] > idadeMaior){
                idadeMaior=idades[3];
            }
            if(idades[4] > idadeMaior){
                idadeMaior=idades[4];
            }
            if(idades[5] > idadeMaior){
                idadeMaior=idades[5];
            }
            if(idades[6] > idadeMaior){
                idadeMaior=idades[6];
            }
            if(idades[7] > idadeMaior){
                idadeMaior=idades[7];
            }
            if(idades[8] > idadeMaior){
                idadeMaior=idades[8];
        }

        String escrita = 
            "\nIdade da 1ª Pessoa: " + idades[0] +
            "\nIdade da 2ª Pessoa: " + idades[1] +
            "\nIdade da 3ª Pessoa: " + idades[2] +
            "\nIdade da 4ª Pessoa: " + idades[3] +
            "\nIdade da 5ª Pessoa: " + idades[4] +
            "\nIdade da 6ª Pessoa: " + idades[5] +
            "\nIdade da 7ª Pessoa: " + idades[6] +
            "\nIdade da 8ª Pessoa: " + idades[7] +
            "\nIdade da 9ª Pessoa: " + idades[8];
        
        JOptionPane.showMessageDialog(null, "Idades inseridas:\n" + escrita + "\n\nA maior idade é: " + idadeMaior, "Idades Aleatórias", JOptionPane.INFORMATION_MESSAGE);
    }
    
}