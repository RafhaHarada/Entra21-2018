
import javax.swing.JOptionPane;

public class ExemploWhile03{

	public static void main(String[] args){
    
            
        int quantidadeMaxima = 4, atual = 0 , maiorIdade = Integer.MIN_VALUE, menorIdade = Integer.MAX_VALUE;
        String nome = "";
        String nomeMaior = "";
        String nomeMenor = "";
		while(atual < quantidadeMaxima){
            nome = JOptionPane.showInputDialog(null, "Digite seu nome");
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade de " + nome));
            if(idade > maiorIdade){
                maiorIdade = idade;
                nomeMaior = nome;
            }
            if(idade < menorIdade){
                menorIdade = idade;
                nomeMenor = nome;
            }
            atual = atual + 1;
        }
        
        JOptionPane.showMessageDialog(null, 
            "A maior idade é: " + maiorIdade + " de " + nomeMaior +
            "\nA menor idade é: " + menorIdade + " de " + nomeMenor
        );

	}

}
