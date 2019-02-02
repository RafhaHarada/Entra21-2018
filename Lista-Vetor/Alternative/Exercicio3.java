import javax.swing.JOptionPane;

/*
Enunciado:
3. Crie dois vetores para guardar o nome e preço de 7 produtos e apresente o
nome e preço dos sete produtos.
*/

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        int i = 0;
        
        String soma = "";

        double[] vetor1 = new double[7];
        String[] vetor2 = new String[7];

        while(i != 7){
            double r = (double) (Math.random() * (i*i - 2)) + 2;
            vetor1[i] = (i+1) + r;
            vetor2[i] = "Produto " + (i+1) + ": R$" + String.format("%.2f", vetor1[i]) + "/kg\n";
            soma = soma + vetor2[i];
            i++;
        }

        JOptionPane.showMessageDialog(null, "Os valores dos produtos são: \n" + soma, "Produtos/valor", JOptionPane.INFORMATION_MESSAGE);

    }
    
}