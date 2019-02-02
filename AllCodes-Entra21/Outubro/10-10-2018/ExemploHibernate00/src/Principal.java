
import bean.Sistema;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada(rafhaharada@gmail.com)
 */
public class Principal {

    public static void main(String[] args) {
        Sistema1();
    }
    
    public static void Sistema1(){
        Dao dao = new Dao();
        boolean sair = true;
        while (sair) {
        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Sistema cadastro:\n1 - Cadastro\n2 - Atualizar\n3 - Deletar\n4 - Lista\n5 - Fechar", "Sistema do Harada", JOptionPane.QUESTION_MESSAGE));
            switch (i) {
                case 1:
                    dao.insert(JOptionPane.showInputDialog(null, "Insira o nome do Individuo", "Sistema do Harada", JOptionPane.QUESTION_MESSAGE));
                    break;
                case 2:
                    dao.update((Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o id que deseja atualizar", "Sistema do Harada", JOptionPane.QUESTION_MESSAGE))), JOptionPane.showInputDialog("Insira o novo nome do Individuo"));
                    break;
                case 3:
                    dao.delete(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o id do Individuo que deseja deletar", "Sistema do Harada", JOptionPane.QUESTION_MESSAGE)));
                    break;
                case 4:
                    String lista = "";
                    List<Sistema> sistemas = dao.getAll();
                    for (Sistema sistema : sistemas) {
                        lista += "\n\nId do Sistema: " + sistema.getId()
                                + "\nNome do Sistema: " + sistema.getNome();
                    }
                    JOptionPane.showMessageDialog(null, lista, "Sistema do Harada", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Fechando o Sistema...", "Sistema do Harada", JOptionPane.WARNING_MESSAGE);
                    sair = false;
                    break;
            }
        }
    }

}
