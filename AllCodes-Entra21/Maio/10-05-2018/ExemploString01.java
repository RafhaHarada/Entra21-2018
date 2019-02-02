
public class ExemploString01 {
	
	public static void main(String[] args) {
		
		
		String nome = "God_of_War";
		
		System.out.println("Nome Original: " + nome);
		
		nome = nome.replace("o","O");
		System.out.println("Nome com Replace: " + nome);
		
		nome = nome.replace("O","o");
		String auxiliar = nome.substring(0, 3);
		System.out.println("Nome com Substring: " + auxiliar);
		
		String[] palavras = nome.split("_");
		for (int i = 0; i < palavras.length; i++) {
			System.out.println("Nome com Split " + (i+1) + ": " + palavras[i]);
		}

		String dataDoUsuario = "21/12/2018";
		System.out.println(dataDoUsuario);
		String[] numerosEmString = dataDoUsuario.split("/");
		int dia = Integer.parseInt(numerosEmString[0]);
		int mes = Integer.parseInt(numerosEmString[1]);
		int ano = Integer.parseInt(numerosEmString[2]);
		
		System.out.println("Data com Split: " + dia + " " + mes + " " + ano);
		
		char letra = 'A';
		letra = Character.toLowerCase(letra);
		char letras = Character.toUpperCase(nome.charAt(0));
		
		
	}

}
