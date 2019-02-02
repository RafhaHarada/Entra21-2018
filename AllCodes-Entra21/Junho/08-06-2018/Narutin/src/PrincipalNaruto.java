
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada
 */

public class PrincipalNaruto {

    public static void main(String[] args) {
        Personagem pain = new Personagem();
        pain.setNome(JOptionPane.showInputDialog("insira seu nome"));
        pain.setCla(JOptionPane.showInputDialog("insira seu cla"));
        pain.setAldeia(JOptionPane.showInputDialog("insira sua aldeia"));
        pain.setNivelChakra(Long.parseLong(JOptionPane.showInputDialog("insira seu nivel de chakra")));
        pain.setSexo(JOptionPane.showInputDialog("insira seu sexo").charAt(0));
        pain.setIdade(Byte.parseByte(JOptionPane.showInputDialog("insira sua idade")));
        pain.setIdadeMental(Byte.parseByte(JOptionPane.showInputDialog("insira sua idade mental")));

        JOptionPane.showMessageDialog(null,
                "\nNome: " + pain.getNome()
                + "\nCla: " + pain.getCla()
                + "\nAldeia: " + pain.getAldeia()
                + "\nNível de Chakra: " + pain.getNivelChakra()
                + "\nSexo: " + pain.getSexo()
                + "\nIdade: " + pain.getIdade()
                + "\nIdade Mental: " + pain.getIdadeMental()
        );

        if (pain.getNivelChakra() > 9000) {
            JOptionPane.showMessageDialog(null,
                    "", "",
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(
                            PrincipalNaruto.class.getResource("/imagens/+9000.gif"))
            );
        }
        //pain.nivelChakra = -100L;

    }

}
