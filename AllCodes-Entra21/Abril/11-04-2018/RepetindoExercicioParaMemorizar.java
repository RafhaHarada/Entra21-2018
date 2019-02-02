import javax.swing.JOptionPane;

public class RepetindoExercicioParaMemorizar{

  public static void main(String[] args){

     JOptionPane.showMessageDialog(null, "Faça seu Cadastro:"); // ignore isso

     String nome = JOptionPane.showInputDialog("Digite seu nome:");
     String corPreferida = JOptionPane.showInputDialog("Digite sua cor preferida:");
     int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
     double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso:"));
     double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
     String bairro = JOptionPane.showInputDialog("Digite seu bairro:");
     String numero = JOptionPane.showInputDialog("Digite seu numero:");
     String telefone = JOptionPane.showInputDialog("Digite seu telefone:");
     String cidade = JOptionPane.showInputDialog("Digite seu cidade:");
     String cep = JOptionPane.showInputDialog("Digite seu CEP:");
     String estado = JOptionPane.showInputDialog("Digite seu estado:");
     String cpf = JOptionPane.showInputDialog("Digite seu CPF:");
     String pis = JOptionPane.showInputDialog("Digite seu PIS:");

     JOptionPane.showMessageDialog(null,
	"Verifique seus dados:" +
        "\n\nNome: " + nome +
	"\nCor Preferida: " + corPreferida +
	"\nIdade: " + idade +
	"\nPeso: " + peso +
	"\nAltura: " + altura +
	"\nBairro: " + bairro +
	"\nNúmero: " + numero +
	"\nTelefone: " + cidade +
	"\nCidade: " + cidade +
	"\nCEP: " + cep +
	"\nEstado: " + estado +
	"\nCPF: " + cpf +
	"\nPIS: " + pis
	);
	//ignore daki
     Object[] options = { "Sim", "Não" }; 
     JOptionPane.showOptionDialog(null, "Seus dados estão corretos?\nClick 'Sim' para continuar, ou 'Não' para cancelar", "Warning",
     JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
     null, options, options[0]);
	//até aki
  }

}
