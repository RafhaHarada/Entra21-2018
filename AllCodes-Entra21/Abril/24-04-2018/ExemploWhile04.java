
import javax.swing.JOptionPane;

public class ExemploWhile04{

	public static void main(String[] args){
	
        String nome = JOptionPane.showInputDialog("Digite seu nome");
		
        /*while(!nome.equalsIgnoreCase("sair") && 
              !nome.equalsIgnoreCase("fim")){*/
        while(!nome.equalsIgnoreCase("sair")){
            System.out.println("caiu oba");
            nome = JOptionPane.showInputDialog("Digite seu nome.\nSe desejar sair digite\"Sair\"");
        }

	}

}
