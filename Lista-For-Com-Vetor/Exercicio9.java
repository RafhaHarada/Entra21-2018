import javax.swing.JOptionPane;

/*
Enunciado:
9. Crie um vetor para armazenar as notas de uma disciplina. A disciplina deve conter 4 notas.
Solicite para o usuário o nome e as quatro notas, armazenando as notas em um vetor.
Após armazenar as notas faça o cálculo da média.
Apresentar as 4 notas e a média.
*/
public class Exercicio9 {

    public static void main(String[] args) {
    
    	String texto = "", nome = JOptionPane.showInputDialog(null, "Digite o nome da máteria:", "Matéria", JOptionPane.QUESTION_MESSAGE).trim();
    	
        int notas[] = new int[4];
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
			notas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a " + (i+1) + "ªNota", nome, JOptionPane.QUESTION_MESSAGE));
			media += notas[i];
			texto += (i+1) + "ªNota: " + notas[i] + "\n";
		}
        media /= notas.length;
        JOptionPane.showMessageDialog(null, "Suas notas são:\n" + texto + "Sua média é: " + String.format("%.1f", media), "Notas de " + nome, JOptionPane.INFORMATION_MESSAGE);
    }
    
}