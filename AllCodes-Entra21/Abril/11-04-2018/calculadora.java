import javax.swing.JOptionPane;

public class calculadora{

  public static void main(String[] args){

     String n1 = JOptionPane.showInputDialog("Digite um n�mero:"); //Permite o usu�rio digitar um numero
     String n2 = JOptionPane.showInputDialog("Digite outro n�mero:"); //Permite o usu�rio digitar um numero
     double numero1 = Double.parseDouble(n1);
     double numero2 = Double.parseDouble(n2);
     double soma = numero1 + numero2;
     double sub = numero1-numero2;
     double mult = numero1*numero2;
     double div = numero1/numero2;
     JOptionPane.showMessageDialog(null, 
	"\nA Soma Dos N�meros �: " + soma +
	"\nA Subtra��o Dos N�meros �: " + sub +
	"\nA Multiplica��o Dos N�meros �: " + mult +
	"\nA Divis�o Dos N�meros �: " + div
	);

  }

}
