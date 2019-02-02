/*

Enunciado:

15. Solicite um número e apresente:
- Os 50 números antecessores pares;
- Os 50 números sucessores ímpares.

*/


import javax.swing.JOptionPane;

public class Exercicio15{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número:", "Antecessores Pares e Sucessores Ímpares", JOptionPane.QUESTION_MESSAGE));
		int par = 0, count = 0, auxiliar = numero, auxiliar2 = 0;
		
		String antecessores = "Antecessores: ";
		String sucessores = "Sucessores: ";

		if(numero %2 == 0){
		    par = 0; //O número inicial é par.
		}
		else{
		    par = 1; //O número inicial é ímpar.
		}

		while(count < 50 && par == 0){
		    if (auxiliar2 == 0 && count <= 48){
				auxiliar = auxiliar - 2;
		        antecessores = antecessores + auxiliar + ", ";
				count ++;
		    }
		    else if (auxiliar2 == 0 && count == 49){
		        antecessores = antecessores + auxiliar + ". ";
				auxiliar = numero + 1;
				auxiliar2 = 1;
		    }
		    if (auxiliar2 == 1 && count > 0){
		        if (count == 49){
			    	sucessores = sucessores + (auxiliar) + ", ";
			    	count--;
				}
				else if (count > 0){
				    auxiliar = auxiliar + 2;
				    sucessores = sucessores + auxiliar + ", ";
				    count --;
				}
		    }
		    else if (auxiliar2 == 1 && count == 0){
			    auxiliar = auxiliar + 2;
		        sucessores = sucessores + auxiliar + ". ";
			    par = 2;
		    }
		}
		while(count < 50 && par == 1){
		    if (auxiliar2 == 0 && count <= 48){
				auxiliar = auxiliar + 2;
		    	sucessores = sucessores + auxiliar + ", ";
				count ++;
		    }
		    else if (auxiliar2 == 0 && count == 49){
				auxiliar = auxiliar + 2;
		    	sucessores = sucessores + auxiliar + ". ";
				auxiliar = numero - 1;
				auxiliar2 = 1;
		    }
		    if (auxiliar2 == 1 && count > 0){
		        if (count == 49){
			    	antecessores = antecessores + (auxiliar) + ", ";
			    	count --;
				}
			
				else if (count > 0){
			    	auxiliar = auxiliar - 2;
			    	antecessores = antecessores + auxiliar + ", ";
			    	count --;
				}
		    }
		    else if (auxiliar2 == 1 && count == 0){
		        antecessores = antecessores + auxiliar + ". ";
			    par = 2;
		    }
		}
		JOptionPane.showMessageDialog(null,
		    "O número digitado foi " + numero +
		    ".\n" + antecessores +
		    "\n" + sucessores,
		    "Antecessores Pares e Sucessores Ímpares de " + numero,
		    JOptionPane.INFORMATION_MESSAGE);
    }
}