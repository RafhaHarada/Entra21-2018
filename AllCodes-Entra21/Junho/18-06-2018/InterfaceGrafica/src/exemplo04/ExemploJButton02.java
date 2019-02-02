package exemplo04;

//import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
/*import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;*/
import java.awt.Color;/*
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;*/
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExemploJButton02{

	public static void main(String[] args) {
		
		JFrame tela = new JFrame("Hover");
		tela.setSize(500,500);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton botao = new JButton("Não venha aqui");
		botao.setSize(400,300);
		botao.setLocation(45,140);
		botao.addMouseListener(new MouseAdapter(){
			//quando o mouse entra no botão
			@Override
			public void mouseEntered(MouseEvent e){
				botao.setBackground(Color.decode("#b12f56"));
			}

			//quando o mouse pressiona no botão
			@Override
			public void mousePressed(MouseEvent e){
				botao.setBackground(Color.decode("#a1d215"));
			}

			//quando o mouse solta no botão
			@Override
			public void mouseReleased(MouseEvent e){
				botao.setBackground(Color.decode("#5fa3b2"));
			}

			//quando o mouse sai no botão
			@Override
			public void mouseExited(MouseEvent e){
				botao.setBackground(Color.decode("#a1d215"));
			}
		});
		//remove borda do texto
		botao.setFocusPainted(false);
		//remove borda do botão
		botao.setBorderPainted(false);

		tela.add(botao);

		tela.setVisible(true);

	}

}