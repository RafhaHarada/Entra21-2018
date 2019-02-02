import javax.swing.JOptionPane;

public class Questao3{
	public static void main(String[] args){
		String nome1 = JOptionPane.showInputDialog("Digite o nome do primeiro funcionario");
		String nome2 = JOptionPane.showInputDialog("Digite o nome do segundo funcionario");
		double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario de " + nome1));
		double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario de " + nome2));
		
		if(salario1 > salario2){
			JOptionPane.showMessageDialog(null, "O funcionario " + nome1 + " tem o salario de R$" + String.format("%.2f",salario1) + "\nO funcionario " + nome2 + " tem o salario de R$" + String.format("%.2f",salario2) + "\n\nAssim o maior salario e do " + nome1 + "\nE o menor salario e do " + nome2);
		}
		else{
			JOptionPane.showMessageDialog(null, "O funcionario " + nome1 + " tem o salario de R$" + String.format("%.2f",salario1) + "\nO funcionario " + nome2 + " tem o salario de R$" + String.format("%.2f",salario2) + "\n\nAssim o maior salario e do " + nome2 + "\nE o menor salario e do " + nome1);
		}
	}
}