import javax.swing.JOptionPane;

/*
Enunciado:
3. Desenvolver um programa que armazene preços, deve-se solicitar ao usuário a
quantidade de registros que o mesmo deseja armazenar. Após isto, solicitar os
preços de acordo com a quantidade de registros.
Ao final apresentar todos os preços e o total dos preços.
Observação: não deve ser solicitado o preço total e sim utilizar o vetor.
*/
public class Exercicio3 {

    public static void main(String[] args) {
        
        String texto = "";
        double soma = 0;
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de registro que deseja cadastrar: ", "Quantidade de cadastros", JOptionPane.QUESTION_MESSAGE));
            while (quantidade <= 0) {
                JOptionPane.showMessageDialog(null, "Erro de entrada", "ERROR 001", JOptionPane.ERROR_MESSAGE);
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite novamente a quantidade de registro que deseja cadastrar: ", "Quantidade de cadastros", JOptionPane.QUESTION_MESSAGE));
            }
        double precos[] = new double[quantidade];
        for (int i = 0; i < precos.length; i++) {
            precos[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço do produto " + (i+1), (i+1) + "º Preço" , JOptionPane.QUESTION_MESSAGE));
                while (precos[i] <= 0) {
                    JOptionPane.showMessageDialog(null, "Erro de entrada", "ERROR 002", JOptionPane.ERROR_MESSAGE);
                    precos[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite novamente o preço do produto " + (i+1), (i+1) + "º Preço" , JOptionPane.QUESTION_MESSAGE));
                }
            soma += precos[i];
            texto += "Produto "+ (i+1) + ": " + String.format("R$%.2f", precos[i]) + "\n"; 
        }
        JOptionPane.showMessageDialog(null, "Os preços dos produtos são:\n" + texto + String.format("\nO total do valores é: R$%.2f", soma), "Tabela de Preços", JOptionPane.INFORMATION_MESSAGE);

    }
    
}