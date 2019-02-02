
import javax.swing.JOptionPane;

/*
 * Condicionador para solicitação de variaveis ao usuario.
 * O programa abaixo, previne ao usuario de fazer uma entrada não permitida ao sistema e
 * persiste ao usuario até a entrada ser aceita.
 */
/**
 *
 * @author Rafael Alipio Harada
 */
public class TryCatchComLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroInicial = 0; //Variavel a ser solicitada ao usuario
        int tenteNovamente = 0; // variavel auxiliar para alterar conteudo de uma string numa solicitação
        while (numeroInicial == 0) { //Condicional limitador, "enquanto" não for falso o código de dentro é executado;
            try {   //Inicia Try para inserção de código, exemplo: i = Integer.parseInt(j); try ira condicionar se j(String) retorna um valor inteiro, se sim o programa segue em frente, se não 'catch'
                if (tenteNovamente == 0) { //Primeiro pedido de um numero, em que mostra ao usuario uma String 1
                    numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira"));
                } else {
                    numeroInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira de novo")); //Demais pedido de um numero, em que mostra ao usuario uma String 2
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Inválido", "Erro", JOptionPane.ERROR_MESSAGE); //Apresentação de erro de entrada ao usuario, por entrada não numerica
                numeroInicial = 0; //Altera o valor não numerico para 0 para atender a condicional do while e persistir na solicitação
                tenteNovamente = 1;//Altera a auxiliar para condicionar uma solicitacao alternativa, no caso acima, com uma nova String
            }
        }
        tenteNovamente = 0; //Reiniciacao da variavel auxiliar para ser usada nos proximos Try Catch
    }

}
