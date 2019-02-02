package exemplo05;

//import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/*import java.awt.Font;*/
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;*/
import javax.swing.ImageIcon;

public class ExemploJComboBox{

	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Hover");
		tela.setSize(500,500);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel labelJogo = new JLabel("Jogo");
		labelJogo.setSize(70,20);
		labelJogo.setLocation(10,10);

		JComboBox caixaDeSelecao = new JComboBox();
		caixaDeSelecao.setSize(200,20);
		caixaDeSelecao.setLocation(85,10);

		DefaultComboBoxModel modelo = new DefaultComboBoxModel(
			new Object[] {
				"Bom de Guerra", "Fortinaite", "Minicrêfte", "Poquemon", "Farcraie 5"
			}
		);

		caixaDeSelecao.setModel(modelo);
		caixaDeSelecao.setSelectedIndex(-1);

		JButton botao = new JButton("");
		botao.setIcon(new ImageIcon("C:/Users/Alunos/Desktop/bomberman-icon.png"));
		botao.setBounds(85, 85, 256, 256);
		botao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if (caixaDeSelecao.getSelectedIndex() == -1) {
					JOptionPane.showMessageDialog(null, "Nenhum item foi selecionado!", "Erooou", JOptionPane.WARNING_MESSAGE);
				}
				String jogoSelecionado = caixaDeSelecao.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, 
					"Você selecionou " + jogoSelecionado, 
					"Jogo Selecionado", 
					JOptionPane.INFORMATION_MESSAGE);
			}
		});

		tela.add(botao);
		tela.add(labelJogo);
		tela.add(caixaDeSelecao);
		tela.setVisible(true);

	}

}