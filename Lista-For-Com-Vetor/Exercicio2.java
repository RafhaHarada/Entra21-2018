import javax.swing.JOptionPane;

/*
Enunciado:
2. Desenvolver um programa que armazene 7 idades, armazenar em um vetor,
solicitando ao usuário e ao final apresentar as idades ao usuário.
*/
public class Exercicio2 {

    public static void main(String[] args) {
    
        int idades[] = new int[3];
        String texto = "";

        for (int i = 0; i < idades.length; i++) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite uma idade: ", (i+1) + "º Idade", JOptionPane.QUESTION_MESSAGE));
        }
        for (int i = 0; i < idades.length; i++) {
            texto += idades[i] + "; ";
        }
        JOptionPane.showMessageDialog(null, "Idades digitadas: \n" + texto, "Idades", JOptionPane.INFORMATION_MESSAGE);

    }
    
}