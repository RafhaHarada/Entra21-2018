import javax.swing.JOptionPane;

public class ExemploJOptionPaneInputDialog{

  public static void main(String[] args){

     String nome = JOptionPane.showInputDialog("Nome"); //Permite o usu�rio digitar o nome
     String sobrenome = JOptionPane.showInputDialog("Sobrenome"); //Permite o usu�rio digitar o sobrenome
     String nomeCompleto = nome + " " + sobrenome;

     int idade = Integer.parseInt(
        JOptionPane.showInputDialog("Idade") //Permite o usu�rio digitar a idade

     );

     JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto + "\nIdade: " + idade);
  }

}
