import javax.swing.JOptionPane;

/*
Enunciado:
8. Solicite ao usuário quantos números ele deseja cadastrar, crie um vetor com este
tamanho, solicite os números ao usuário e armazene no vetor.
Após isto criar um vetor de ímpares e outro de pares com o tamanho do vetor original.
Armazenar os números pares do vetor original no vetor par.
Armazenar os números ímpares do vetor original no vetor ímpar.

Vetor original:
|39|52|70|11|54|

Vetor par:
|52|70|54|0|0|

Vetor ímpar:
|39|11|0|0|0|

Deve-se apresentar os números do vetor original, do vetor par e do vetor ímpar.
Exemplo:
Vetor original: 39, 52, 70, 11, 54
Vetor par: 52, 70, 54
Vetor ímpar: 39, 11
*/

public class Exercicio8 {

    public static void main(String[] args) {
    
        int cadastros = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de cadastros:", "Número de Cadastros", JOptionPane.QUESTION_MESSAGE));
        int[] vetor = new int[cadastros], par = new int[cadastros], impar = new int[cadastros];
        
        String pares = "", impares = "", vetores = "";

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:", (i+1) + "º Número", JOptionPane.QUESTION_MESSAGE));
            if(vetor[i] == 0){
            }
            else if(vetor[i] %2 == 0){
                par[i] = vetor[i];
                pares += vetor[i] + ";  ";
            }
            else{
                impar[i] = vetor[i];
                impares += vetor[i] + ";  ";
            }
            vetores += vetor[i] + ";  ";
        }
        JOptionPane.showMessageDialog(null, 
            "Vetor original:  " + vetores +
            "\nVetor par:  " + pares +
            "\nVetor impar:  " + impares, 
            "Vetores Pares e Impares", 
            JOptionPane.INFORMATION_MESSAGE);

    }
    
}