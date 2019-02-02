import javax.swing.JOptionPane;

public class Questao4{
	public static void main(String[] args){
		String nome1 = JOptionPane.showInputDialog("Digite o nome da primeira pessoa");
		String nome2 = JOptionPane.showInputDialog("Digite o nome da segunda pessoa");
		String nome3 = JOptionPane.showInputDialog("Digite o nome da terceira pessoa");
		String nome4 = JOptionPane.showInputDialog("Digite o nome da quarta pessoa");
		int idade1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome1));
		int idade2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome2));
		int idade3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome3));
		int idade4 = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nome4));
		double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nome1));
		double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nome2));
		double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nome3));
		double altura4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura de " + nome4));
		
		double mediaIdade = (double)((idade1 + idade2 + idade3 + idade4)/4);
		int menorIdade = 0;
		int maiorIdade = 0;
		String maiorIdadeNome = "";
		String menorIdadeNome = "";
		double mediaAltura = (double)((altura1 + altura2 + altura3 + altura4)/4);
		double menorAltura = 0;
		double maiorAltura = 0;
		String maiorAlturaNome = "";
		String menorAlturaNome = "";
		
		String porem1 = "";
		String porem2 = "";
		String porem3 = "";
		String porem4 = "";

		//Maior e menor idade
		if(idade1 < idade2 && idade1 < idade3 && idade1 < idade4){
			menorIdade = idade1;
			menorIdadeNome = nome1;
		}
		else if(idade2 < idade1 && idade2 < idade3 && idade2 < idade4){
			menorIdade = idade2;
			menorIdadeNome = nome2;
		}
		else if(idade3 < idade1 && idade3 < idade2 && idade3 < idade4){
			menorIdade = idade3;
			menorIdadeNome = nome3;
		}
		else if(idade4 < idade1 && idade4 < idade3 && idade4 < idade2){
			menorIdade = idade4;
			menorIdadeNome = nome4;
		}
		else{
			menorIdade = 0;
		}

		if(menorIdade <= 0){ porem1 = "\nExiste duas ou mais pessoas com a menor idade";}
		else{ porem1 = "\nA menor das idades e a de: " + menorIdadeNome + " com " + menorIdade + " anos";}

		if(idade1 > idade2 && idade1 > idade3 && idade1 > idade4){
			maiorIdade = idade1;
			maiorIdadeNome = nome1;
		}
		else if(idade2 > idade1 && idade2 > idade3 && idade2 > idade4){
			maiorIdade = idade2;
			maiorIdadeNome = nome2;
		}
		else if(idade3 > idade1 && idade3 > idade2 && idade3 > idade4){
			maiorIdade = idade3;
			maiorIdadeNome = nome3;
		}
		else if(idade4 > idade1 && idade4 > idade3 && idade4 > idade2){
			maiorIdade = idade4;
			maiorIdadeNome = nome4;
		}
		else{
			maiorIdade = 0;
		}

		if(maiorIdade <= 0){ porem2 = "\nExiste duas ou mais pessoas com a maior idade";}
		else{ porem2 = "\nA maior das idades e a de: " + maiorIdadeNome +  " com " + maiorIdade + " anos";}


		//Maior e menor altura
		if(altura1 < altura2 && altura1 < altura3 && altura1 < altura4){
			menorAltura = altura1;
			menorAlturaNome = nome1;
		}
		else if(altura2 < altura1 && altura2 < altura3 && altura2 < altura4){
			menorAltura = altura2;
			menorAlturaNome = nome2;
		}
		else if(altura3 < altura1 && altura3 < altura2 && altura3 < altura4){
			menorAltura = altura3;
			menorAlturaNome = nome3;
		}
		else if(altura4 < altura1 && altura4 < altura3 && altura4 < altura2){
			menorAltura = altura4;
			menorAlturaNome = nome4;
		}
		else{
			menorAltura = 0;
		}

		if(menorAltura <= 0){ porem3 = "\nExiste duas ou mais pessoas com a menor altura";}
		else{ porem3 = "\nA menor das alturas e a de: " + menorAlturaNome +  " com " + menorAltura + "m";}

		if(altura1 > altura2 && altura1 > altura3 && altura1 > altura4){
			maiorAltura = altura1;
			maiorAlturaNome = nome1;
		}
		else if(altura2 > altura1 && altura2 > altura3 && altura2 > altura4){
			maiorAltura = altura2;
			maiorAlturaNome = nome2;
		}
		else if(altura3 > altura1 && altura3 > altura2 && altura3 > altura4){
			maiorAltura = altura3;
			maiorAlturaNome = nome3;
		}
		else if(altura4 > altura1 && altura4 > altura3 && altura4 > altura2){
			maiorAltura = altura4;
			maiorAlturaNome = nome4;
		}
		else{
			maiorAltura = 0;
		}

		if(maiorAltura <= 0){ porem4 = "\nExiste duas ou mais pessoas com a maior altura";}
		else{ porem4 = "\nA maior das alturas e a de: " + maiorAlturaNome +  " com " + maiorAltura + "m";}

		JOptionPane.showMessageDialog(null,
			"A media das idades e: " + String.format("%.2f", mediaIdade) + 
			porem1 +
			porem2 +
			"\nA media das alturas e: " + String.format("%.2f", mediaAltura) + 
			porem3 +
			porem4 
		);
	}
}