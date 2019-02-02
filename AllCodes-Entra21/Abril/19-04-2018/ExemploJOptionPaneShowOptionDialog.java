import javax.swing.JOptionPane;

public class ExemploJOptionPaneShowOptionDialog{

	public static void main(String[] args){

        int opcao = JOptionPane.showOptionDialog(null, "Selecione o menu desejado", 
        "MENU DO SISTEMA", 
        0, 
        JOptionPane.PLAIN_MESSAGE, 
        null, 
        new Object[]{
            "Cadastro","Edição","Lista"
        },
        "Cadastro");

        if (opcao == 0){
			JOptionPane.showMessageDialog(null, "Cadastro Selecionado");
		}
		else if (opcao == 1) {
			JOptionPane.showMessageDialog(null, "Edção Selecionada");
		}
		else if(opcao == 2){
			JOptionPane.showMessageDialog(null, "Lista Selecionada");
		}
		else{
			JOptionPane.showMessageDialog(null, "Fechado com sucesso!");
        }
        
	}

}
//alt c -> compile
//alt R -> run