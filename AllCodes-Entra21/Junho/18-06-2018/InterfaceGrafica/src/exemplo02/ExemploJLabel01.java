package exemplo02;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploJLabel01{

	public static void main(String[] args){

		JFrame tela = new JFrame("Exemplo JLabel");
		tela.setSize(500,300);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("HELLO WORLD");

		JLabel labelNome = new JLabel();
		labelNome.setText("Nome");
		labelNome.setSize(80,20);
		labelNome.setLocation(50,50);

		JButton botao = new JButton();
		botao.setText("Alterar");
		botao.setSize(100,25);
		botao.setLocation(50,80);

		botao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				labelNome.setText("Troquei");
			}
		});

		tela.add(labelNome);
		tela.add(botao);
		tela.setVisible(true);
	}

}