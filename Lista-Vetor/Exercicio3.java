import javax.swing.JOptionPane;

/*
Enunciado:
3. Crie dois vetores para guardar o nome e preço de 7 produtos e apresente o
nome e preço dos sete produtos.
*/

public class Exercicio3 {
    
    public static void main(String[] args) {
        
        double[] vetor1 = new double[16];
        vetor1[0] = 1.99;
        vetor1[1] = 2.99;
        vetor1[2] = 3.99;
        vetor1[3] = 4.99;
        vetor1[4] = 5.99;
        vetor1[5] = 6.99;
        vetor1[6] = 7.99;

        String[] vetor2 = new String[10];
        vetor2[0] = "Batata";
        vetor2[1] = "Cenoura";
        vetor2[2] = "Cebola";
        vetor2[3] = "Damasco";
        vetor2[4] = "Espinafre";
        vetor2[5] = "Figo";
        vetor2[6] = "Goiaba";

        String soma = 
        "\nProduto1: " + vetor2[0] + " - R$" + vetor1[0] + "/kg" + 
        "\nProduto2: " + vetor2[1] + " - R$" + vetor1[1] + "/kg" + 
        "\nProduto3: " + vetor2[2] + " - R$" + vetor1[2] + "/kg" + 
        "\nProduto4: " + vetor2[3] + " - R$" + vetor1[3] + "/kg" + 
        "\nProduto5: " + vetor2[4] + " - R$" + vetor1[4] + "/kg" + 
        "\nProduto6: " + vetor2[5] + " - R$" + vetor1[5] + "/kg" + 
        "\nProduto7: " + vetor2[6] + " - R$" + vetor1[6] + "/kg" ;

        JOptionPane.showMessageDialog(null, "Os valores dos produtos são: \n" + soma, "Produtos/valor", JOptionPane.INFORMATION_MESSAGE);

    }
    
}