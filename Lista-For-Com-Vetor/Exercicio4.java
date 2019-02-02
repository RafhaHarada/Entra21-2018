import javax.swing.JOptionPane;

/*
Enunciado:
4. Desenvolver um programa que armazene o tamanho de 40 camisas, após isto
apresentar:
-> Tamanho de todas as camisas armazenadas
-> Quantidade de camisas PP
-> Quantidade de camisas P
-> Quantidade de camisas M
-> Quantidade de camisas G
-> Quantidade de camisas GG
-> Quantidade de camisas XG
-> Quantidade de camisas XGG
Lembrando que os tamanhos possíveis para camisas são:
-> PP
-> P
-> M
-> G
-> GG
-> XG
-> XGG
*/
public class Exercicio4 {

	public static void main(String[] args) {

		String camisas[] = new String[40];
		String tamanhos[] = { "PP", "P", "M", "G", "GG", "XG", "XGG" };
		int quantidade[] = new int[7];
		String texto = "";

		for (int i = 0; i < camisas.length; i++) {
			camisas[i] = tamanhos[((int) (Math.random() * 7))];
		}
		for (int i = 0; i < quantidade.length; i++) {
			quantidade[i] = 0;
		}
		for (int i = 0; i < camisas.length; i++) {
			for (int j = 0; j < quantidade.length; j++) {
				if (camisas[i] == tamanhos[j]) {
					quantidade[j]++;
				}
			}
		}
		for (int i = 0; i < quantidade.length; i++) {
			texto += quantidade[i] + " " + tamanhos[i] + ".\n";
		}
		JOptionPane.showMessageDialog(null, texto, "Quantidade por Tamanho", JOptionPane.INFORMATION_MESSAGE);
	}

}