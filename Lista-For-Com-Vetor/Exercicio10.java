import javax.swing.JOptionPane;

/*
Enunciado:
10.Crie um vetor para guardar 10 nomes, solicite-os e apresente:
-> Todos os nomes;
-> Nome com o maior nome;
-> Nome com o menor nome;
-> Quantidade de pessoas que contém o nome começando com S;
-> Quantidade de pessoas que contém o nome começando com A;
-> Quantidade de pessoas que o último sobrenome é Silva.
*/
public class Exercicio10 {

    public static void main(String[] args) {
    
    	String nome[] = new String[10], auxiliar = "", maiorNome = "", menorNome = "", nomes = "";
    	int s = 0, a = 0, silva = 0, maiorNomeN = Integer.MIN_VALUE, menorNomeN = Integer.MAX_VALUE;
    	
    	for (int i = 0; i < nome.length; i++) {
    		nome[i] = JOptionPane.showInputDialog(null, "Digite um nome completo:", (i+1) + "º Nome", JOptionPane.QUESTION_MESSAGE).trim();
    		auxiliar = nome[i];
    		while(auxiliar.equals("")){
        		nome[i] = JOptionPane.showInputDialog(null, "Erro de Entrada\nDigite novamente um nome completo:", (i+1) + "º Nome", JOptionPane.QUESTION_MESSAGE).trim();
        		auxiliar = nome[i];
    		}
    		nomes += nome[i] + ";\n";
    		
    		String[] sobrenomes = nome[i].split(" ");
    		auxiliar = auxiliar.toUpperCase();
    		if(sobrenomes[(sobrenomes.length-1)].equalsIgnoreCase("Silva")){
    			silva++;
    		}
    		if(auxiliar.charAt(0) == 'A'){
    			a++;
    		}
    		else if(auxiliar.charAt(0) == 'S'){
    			s++;
    		}
    		
    		maiorNomeN = Integer.max(nome[i].length(), maiorNomeN);
    		menorNomeN = Integer.min(nome[i].length(), menorNomeN);
    	}
    	for (int i = 0; i < nome.length; i++) {
    		if(maiorNomeN == nome[i].length()){
    			maiorNome += nome[i] + "; ";
    		}
    		if(menorNomeN == nome[i].length()){
    			menorNome += nome[i] + "; ";
    		}
		}
    	JOptionPane.showMessageDialog(null, 
    			"Nomes e suas peculiaridades:\n" +
    	    	"\nTodos os nomes: \n\n" + nomes +
    			"\nNome com o maior nome: " + maiorNome +
    			"\nNome com o menor nome: " + menorNome +
    			"\nQuantidade de pessoas que contém o nome começando com S: " + s +
    			".\nQuantidade de pessoas que contém o nome começando com A: " + a +
    			".\nQuantidade de pessoas que o último sobrenome é Silva: " + silva + ".", 
    			"Lista de nomes", 
    			JOptionPane.INFORMATION_MESSAGE);

    }
    
}