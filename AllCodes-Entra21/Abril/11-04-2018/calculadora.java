import javax.swing.JOptionPane;

public class calculadora{

  public static void main(String[] args){

     String n1 = JOptionPane.showInputDialog("Digite um número:"); //Permite o usuário digitar um numero
     String n2 = JOptionPane.showInputDialog("Digite outro número:"); //Permite o usuário digitar um numero
     double numero1 = Double.parseDouble(n1);
     double numero2 = Double.parseDouble(n2);
     double soma = numero1 + numero2;
     double sub = numero1-numero2;
     double mult = numero1*numero2;
     double div = numero1/numero2;
     JOptionPane.showMessageDialog(null, 
	"\nA Soma Dos Números É: " + soma +
	"\nA Subtração Dos Números É: " + sub +
	"\nA Multiplicação Dos Números É: " + mult +
	"\nA Divisão Dos Números É: " + div
	);

  }

}
