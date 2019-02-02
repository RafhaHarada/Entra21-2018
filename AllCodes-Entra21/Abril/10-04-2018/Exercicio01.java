import javax.swing.JOptionPane;

public class Exercicio01{

  public static void main(String[] args){

     String nome = JOptionPane.showInputDialog("Nome: ");
     String corPreferida = JOptionPane.showInputDialog("Cor Preferida: ");
     int idade = Integer.parseInt(
	JOptionPane.showInputDialog("Idade: ")
	);
     double peso = Double.parseDouble(
	JOptionPane.showInputDialog("Peso: ")
	);
     double altura = Double.parseDouble(
	JOptionPane.showInputDialog("Altura: ")
	);
     String bairro = JOptionPane.showInputDialog("Bairro: ");
     String numero = JOptionPane.showInputDialog("N�mero: ");
     String cidade = JOptionPane.showInputDialog("Cidade: ");
     String cep = JOptionPane.showInputDialog("CEP: ");
     String estado = JOptionPane.showInputDialog("Estado: ");
     String cpf = JOptionPane.showInputDialog("CPF: ");
     String pis = JOptionPane.showInputDialog("PIS: ");

     JOptionPane.showMessageDialog(null,
        "\n |  Nome: " + nome +
        "\n |  Cor Preferida: " + corPreferida +
        "\n |  Idade: " + idade +
        "\n |  Peso: " + peso +
        "\n |  Altura: " + altura +
        "\n |  Bairro: " + bairro +
        "\n |  N�mero: " + numero +
        "\n |  Cidade: " + cidade +
        "\n |  CEP: " + cep +
        "\n |  Estado: " + estado +
        "\n |  CPF: " + cpf +
        "\n |  PIS: " + pis
	);
  }

}
