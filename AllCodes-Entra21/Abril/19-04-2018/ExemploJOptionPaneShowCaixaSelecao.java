import javax.swing.JOptionPane;

public class ExemploJOptionPaneShowCaixaSelecao{

	public static void main(String[] args){
        
        String opcao = 
            JOptionPane.showInputDialog(null, 
            "Selecione um estado",
            "SISTEMA - DA VOVÓ",
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{
                "","PR","RS","SC"
            },
            ""
        ).toString();

        System.out.println(opcao);
        if(opcao.equals("SC")){
            System.out.println("Santa Catarina");
        }
        else if(opcao.equals("PR")){
            System.out.println("Paraná");
        }
        else if(opcao.equals("RS")){
            System.out.println("Rio Grande do Sul");
        }

	}

}