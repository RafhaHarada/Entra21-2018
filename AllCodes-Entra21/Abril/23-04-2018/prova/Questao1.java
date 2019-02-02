import javax.swing.JOptionPane;

public class Questao1{
	public static void main(String[] args){
		double valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salario por hora: "));
		double hora = Double.parseDouble(JOptionPane.showInputDialog("Digite quantas hora voce trabalhou este mes: "));
		double transporte = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais voce\nganha no Auxilio Transporte: "));
		double alimentacao = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais voce\nganha no Auxilio Alimentacao: "));
		double descontoINSS = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais voce\nganha com o desconto da\ncontribuicao do INSS: "));
		double descontoSindical = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos reais voce\nganha com o desconto\nda contribuicao sindical: "));
		double salarioBruto = valorPorHora*hora;
		double salarioLiquido = salarioBruto + transporte + alimentacao + descontoINSS + descontoSindical;

		JOptionPane.showMessageDialog(null,
			"Seu salario bruto e de: R$" + String.format("%.2f", salarioBruto) +
			"\nSeu salario liquido e de: R$" + String.format("%.2f", salarioLiquido)
		);
	}
}