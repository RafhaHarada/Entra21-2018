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
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do estudante:", "Notas do Estudante", JOptionPane.QUESTION_MESSAGE);
        double[] vetor = new double[4];
        vetor[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 1ª nota", "Nota 1 de " + nome, JOptionPane.QUESTION_MESSAGE));
        vetor[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 2ª nota", "Nota 2 de " + nome, JOptionPane.QUESTION_MESSAGE));
        vetor[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 3ª nota", "Nota 3 de " + nome, JOptionPane.QUESTION_MESSAGE));
        vetor[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira sua 4ª nota", "Nota 4 de " + nome, JOptionPane.QUESTION_MESSAGE));
        
        String soma = "\n1ª nota: " + String.format("%.1f", vetor[0]) + "\n2ª nota: " + String.format("%.1f", vetor[1]) + "\n3ª nota: " + String.format("%.1f", vetor[2]) + "\n4ª nota: " + String.format("%.1f", vetor[3]);
        double media =(vetor[0] + vetor[1] + vetor[2] + vetor[3])/vetor.length;

        JOptionPane.showMessageDialog(null, 
        "As notas do estudante: " + nome + 
        " são: \n" + soma +
        "\n\nA sua média é: " + String.format("%.1f", media),
        "Notas de " + nome, 
        JOptionPane.INFORMATION_MESSAGE);

    }
    
}