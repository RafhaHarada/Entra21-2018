import javax.swing.JOptionPane;

/*
Enunciado:
7. Solicite ao usuário 20 caracteres armazenando em um vetor. Após isto verifique e
apresente os itens abaixo:
-> Quantas são as consoantes
-> Quantas são as vogais;
-> Quantos são caracteres especiais.
-> Quais são as consoantes;
-> Quais são as vogais;
-> Quais são os caracteres especiais.
*/
public class Exercicio7 {

    public static void main(String[] args) {

		String caracteres[] = new String[20];
		String vogais[] = {
			"a","e","i","o","u","á","é","í","ó","ú","à","è","ì","ò","ù","â","ê","î","ô","û","ã","õ","ä","ë","ï","ö","ü"
			};//27
		String consoantes[] = {
			"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z","ç","ý","ÿ","ñ","b","c"
			};//27
		String texto [] = new String[3];
		int quantidade[] = new int[3];
			/*0 consoantes
			  1 vogais;
			  2 caracteres especiais.
			*/
		int count = 0;
    	for (int i = 0; i < caracteres.length; i++) {
    		caracteres[i] = JOptionPane.showInputDialog(null, "Digite uma caracter:", "Caracter nº" + (i+1), JOptionPane.QUESTION_MESSAGE);
			while(caracteres[i].length() != 1){
    			JOptionPane.showMessageDialog(null, "Erro de entrada", "ERROR 001", JOptionPane.ERROR_MESSAGE);
        		caracteres[i] = JOptionPane.showInputDialog(null, "Digite novamente uma caracter:", "Caracter nº" + (i+1), JOptionPane.QUESTION_MESSAGE);
			}
		}
		for (int i = 0; i < caracteres.length; i++) {
			for (int j = 0; j < vogais.length; j++) {
				if (caracteres[i].equalsIgnoreCase(consoantes[j])) {
					quantidade[0]++;
					texto[0] += caracteres[i] + "; ";
					count ++;
				}
				else if (caracteres[i].equalsIgnoreCase(vogais[j])) {
					quantidade[1]++;
					texto[1] += caracteres[i] + "; ";
					count ++;
				}
				else if(j == (vogais.length-1) && count == 0){
					quantidade[2]++;
					texto[2] += caracteres[i] + "; ";
				}
			}
			count = 0;
		}
		JOptionPane.showMessageDialog(null, 
			"\nNúmero de Consoantes: " + quantidade[0] +
			"\nNúmero de Vogais: " + quantidade[1] +
			"\nNúmero de Caracteres Especiais: " + quantidade[2] +
			"\nConsoantes Digitadas: " + texto[0] +
			"\nVogais Digitadas: " + texto[1] +
			"\nCaracteres Especiais Digitadas: " + texto[2],
			"\nClassificação de Caracteres",
			JOptionPane.INFORMATION_MESSAGE);
	}
}