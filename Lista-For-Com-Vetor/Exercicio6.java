import java.util.Random;

import javax.swing.JOptionPane;

/*
Enunciado:
6. Crie um vetor que ir√° armazenar 10 n√∫meros. Estes n√∫meros dever√£o ser n√∫mero
aleat√≥rios.
Ao final apresente:
-> Todos os n√∫meros armazenados;
-> A somat√≥ria final dos n√∫meros;
-> A m√©dia dos n√∫meros;
-> Quantidade de n√∫meros pares;
-> Quantidade de n√∫meros positivos;
-> Quantidade de n√∫meros √≠mpares;
-> Quantidade de n√∫meros negativos;
-> Quantidade de n√∫meros neutros.
Observa√ß√£o: os n√∫meros aleat√≥rios devem ser gerados pelo C Sharp.
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
        		"\nOs n˙meros digitados s„o: " + texto +
        		"\n\nA somatÛria final dos n˙meros: " + soma +
        		"\nA mÈdia dos n˙meros: " + media +
        		"\nQuantidade de n˙meros pares: " + pares +
        		"\nQuantidade de n˙meros positivos: " + positivos +
        		"\nQuantidade de n˙meros Ìmpares: " + impares +
        		"\nQuantidade de n˙meros negativos: " + negativos +
        		"\nQuantidade de n˙meros neutros: " + neutros, 
        		"Detalhamento de N˙meros AleatÛrios", 
        		JOptionPane.INFORMATION_MESSAGE);
    }
    
}