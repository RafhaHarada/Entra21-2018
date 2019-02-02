import javax.swing.JOptionPane;

public class ExemploJOptionPane{

  public static void main(String[] args){

     String nome = "Aula de Java";
     String professor = "Francisco";
     String texto = "\n+88_________________+880_______\n"+"_+880_______________++80_______\n"+"_++88______________+880________\n"+"_++88_____________++88________\n"+"__+880___________++88_________\n"+"__+888_________++880__________\n"+"__++880_______++880___________\n"+"__++888_____+++880____________\n"+"__++8888__+++8880++88_________\n"+"__+++8888+++8880++8888________\n"+"___++888++8888+++888888+80____\n"+"___++88++8888++8888888++888___\n"+"___++++++888888fx88888888888___\n"+"____++++++88888888888888888___\n"+"____++++++++000888888888888___\n"+"_____+++++++00008f8888888888___\n"+"______+++++++00088888888888___\n"+"_______+++++++0888f8888888\n";

     JOptionPane.showMessageDialog(null, "Olá Mundo");
     JOptionPane.showMessageDialog(null,
     		"Curso: " + nome +
		"\nProfessor: " + professor
     );
     JOptionPane.showMessageDialog(null,texto);

     JOptionPane.showMessageDialog(null, "Olá Mundo");

  }

}
