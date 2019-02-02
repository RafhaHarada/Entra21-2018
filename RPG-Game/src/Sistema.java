
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class Sistema {

    ArrayList<String> personagem = new ArrayList<>();
    ArrayList<String> nomes = new ArrayList<>();
    Object[] options2 = new Object[0];
    PersonagemAtributos load1 = new PersonagemAtributos();
    PersonagemAtributos load2 = new PersonagemAtributos();
    PersonagemAtributos load3 = new PersonagemAtributos();

    public void novoPersonagem() {
        
    }

    public void personagensCriados() {
        if (personagem.size() > 0) {
            options2 = new Object[personagem.size()];
            for (int i = 0; i < personagem.size(); i++) {
                options2[i] = nomes.get(i);
            }
            String escolha = JOptionPane.showInputDialog(null, "Escolha o Personagem", "Personagens Criados", JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]).toString();
            for (int i = 0; i < personagem.size(); i++) {
                if (escolha.contains(nomes.get(i))) {
                    JOptionPane.showMessageDialog(null, personagem.get(i), nomes.get(i),JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você ainda não criou um personagem", "Novo personagem", JOptionPane.WARNING_MESSAGE);
        }
    }
}
