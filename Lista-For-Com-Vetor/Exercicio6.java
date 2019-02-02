import java.util.Random;

import javax.swing.JOptionPane;

/*
Enunciado:
6. Crie um vetor que irá armazenar 10 números. Estes números deverão ser número
aleatórios.
Ao final apresente:
-> Todos os números armazenados;
-> A somatória final dos números;
-> A média dos números;
-> Quantidade de números pares;
-> Quantidade de números positivos;
-> Quantidade de números ímpares;
-> Quantidade de números negativos;
-> Quantidade de números neutros.
Observação: os números aleatórios devem ser gerados pelo C Sharp.
*/
public class Exercicio6 {

    public static void main(String[] args) {
    
        Random cSharp = new Random();
        String texto = "";
        int vetor[] = new int[10], positivos = 0, negativos = 0, pares = 0, impares = 0, neutros = 0, soma = 0;
        double media = 0;
        
        for (int i = 0; i < vetor.length; i++) {
        	boolean positivo = cSharp.nextBoolean();
			vetor[i] = cSharp.nextInt(51);
			vetor[i] = positivo ? vetor[i] : vetor[i] * -1;
			soma += vetor[i];
			texto += vetor[i] + "; ";
			if(vetor[i] > 0){
				positivos++;
			}
			else if(vetor[i] < 0){
				negativos++;
			}
			else{
				neutros++;
			}
			if(vetor[i] %2 == 0){
				pares++;
			}
			else{
				impares++;
			}
		}
        media = soma/vetor.length;
        JOptionPane.showMessageDialog(null, 
        		"\nOs n�meros digitados s�o: " + texto +
        		"\n\nA somat�ria final dos n�meros: " + soma +
        		"\nA m�dia dos n�meros: " + media +
        		"\nQuantidade de n�meros pares: " + pares +
        		"\nQuantidade de n�meros positivos: " + positivos +
        		"\nQuantidade de n�meros �mpares: " + impares +
        		"\nQuantidade de n�meros negativos: " + negativos +
        		"\nQuantidade de n�meros neutros: " + neutros, 
        		"Detalhamento de N�meros Aleat�rios", 
        		JOptionPane.INFORMATION_MESSAGE);
    }
    
}