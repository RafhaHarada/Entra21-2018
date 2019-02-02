import javax.swing.JOptionPane;

/*
Enunciado:
4. Crie um vetor para armazenar as notas de uma disciplina. A disciplina deve
conter 4 notas.
Solicite para o usuário o nome e as quatro notas, armazenando as notas em um
vetor, realize a média destas notas e apresente.
*/

public class Exercicio4 {
    
    public static void main(String[] args) {

        String soma = "";
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do estudante:", "Notas do Estudante", JOptionPane.QUESTION_MESSAGE);
        
        int i = 0;

        double media = 0;
        double[] vetor = new double[4];

        while (i!= 4) {
            vetor[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua " + (i+1) + "ª nota", "Nota " + (i+1) + " de " + nome, JOptionPane.QUESTION_MESSAGE));
            soma = soma + "\n" + (i+1) + "ª nota: " + String.format("%.1f", vetor[i]);
            media = media + vetor[i];
            i++;
        }

        media = media/vetor.length;

        JOptionPane.showMessageDialog(null, 
        "As notas do estudante: " + nome + 
        " são: \n" + soma +
        "\n\nA sua média é: " + String.format("%.1f", media),
        "Notas de " + nome, 
        JOptionPane.INFORMATION_MESSAGE);

    }
    
}