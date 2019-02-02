import javax.swing.JOptionPane;

/*
Enunciado:
5. A empresa GameVicio precisa armazenar os jogos que tem em estoque, para tal
deve-se armazenar o nome e a quantidade de jogos. Para tal utilize um vetor para o
nome dos jogos e outro vetor para a quantidade de jogos.
Ao final apresente o nome concatenado com a quantidade.

Exemplo:
Nome Unidades
Horizon Zero Dawn 190
God Of War 350
Spider-Man 59
Injustice 2 27
Crash Bandicoot 41
Grand Theft Auto V 12

Observa√ß√£o: A quantidade de jogos que ser√£o cadastrados √© o usu√°rio que ir√° definir;
*/
public class Exercicio5 {

    public static void main(String[] args) {
    
        int quantidadeCadastro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade jogos ‡ serem cadastrados:", "Jogos a Serem Cadastrados", JOptionPane.QUESTION_MESSAGE));
        while(quantidadeCadastro <= 0){
			JOptionPane.showMessageDialog(null, "Erro de entrada", "ERROR 001", JOptionPane.ERROR_MESSAGE);
	        quantidadeCadastro = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente a quantidade jogos ‡ serem cadastrados:", "Jogos a Serem Cadastrados", JOptionPane.QUESTION_MESSAGE));
		}
        int quantidadeJogo[] = new int[quantidadeCadastro];
        String jogo[] = new String[quantidadeCadastro];
        String texto = "";
        
        for (int i = 0; i < quantidadeJogo.length; i++) {
			jogo[i] = JOptionPane.showInputDialog(null, "Digite o nome do jogo:", "Cadastro n∫" +(i+1), JOptionPane.QUESTION_MESSAGE).trim();
			while(jogo[i].equals("")){
				JOptionPane.showMessageDialog(null, "Erro de entrada", "ERROR 002", JOptionPane.ERROR_MESSAGE);
				jogo[i] = JOptionPane.showInputDialog(null, "Digite novamente o nome do jogo:", "Cadastro n∫" +(i+1), JOptionPane.QUESTION_MESSAGE).trim();
			}
			quantidadeJogo[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do jogo: " + jogo[i], "Cadastro n∫" +(i+1), JOptionPane.QUESTION_MESSAGE));
			while(quantidadeJogo[i] < 0){
				JOptionPane.showMessageDialog(null, "Erro de entrada", "ERROR 003", JOptionPane.ERROR_MESSAGE);
				quantidadeJogo[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente a quantidade do jogo: " + jogo[i], "Cadastro n∫" +(i+1), JOptionPane.QUESTION_MESSAGE));
			}
        }
        for (int i = 0; i < quantidadeJogo.length; i++) {
			texto += jogo[i] + " - " + quantidadeJogo[i] + "\n";
		}
        JOptionPane.showMessageDialog(null, "O estoque dos jogos registrado È:\n\nNome - Quantidade\n" + texto, "Estoque dos Jogos", JOptionPane.INFORMATION_MESSAGE);
    }
    
}