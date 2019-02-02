import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class ExemploJOptionPaneIcone{

	public static void main(String[] args){
        
        JOptionPane.showMessageDialog(null, 
        "Olá mundo", 
        "Sistema da Vovó", 
        JOptionPane.WARNING_MESSAGE, 
        new ImageIcon(
            ExemploJOptionPaneIcone.class.getResource
            ("/imagens/virus (5).png"))
        );
        
	}

}