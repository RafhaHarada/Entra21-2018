import javax.swing.JOptionPane;

public class Questao2{
	public static void main(String[] args){
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
		if(idade <= 0){
			JOptionPane.showMessageDialog(null,"Idade Invalida");
		}
		else if(idade <= 9){
			JOptionPane.showMessageDialog(null, "Voce esta na faixa etaria: Crianca");
		}
		else if(idade <= 12){
			JOptionPane.showMessageDialog(null, "Voce esta na faixa etaria: Pre-adolescencia");
		}
		else if(idade <= 17){
			JOptionPane.showMessageDialog(null, "Voce esta na faixa etaria: Adolescencia");
		}
		else if(idade <= 59){
			JOptionPane.showMessageDialog(null, "Voce esta na faixa etaria: Adulto");
		}
		else if(idade > 120){
			JOptionPane.showMessageDialog(null, "Idade Invalida");
		}
		else{
			JOptionPane.showMessageDialog(null, "Voce esta na faixa etaria: Idoso");
		}
	}
}