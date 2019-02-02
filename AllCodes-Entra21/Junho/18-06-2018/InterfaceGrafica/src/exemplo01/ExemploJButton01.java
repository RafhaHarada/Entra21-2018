package exemplo01;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploJButton01{

	static boolean somar = false;

	public static void main(String[] args){

		JFrame tela = new JFrame();
		tela.setSize(800,500);
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("HELLO WORLD");

		JButton botao01 = new JButton();
		botao01.setText("ok");
		botao01.setSize(200,20);
		botao01.setLocation(10,20);
		tela.add(botao01);

		botao01.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//JOptionPane.showMessageDialog(null,"Eu te avisei para não fazer isso");
				botao01.setLocation(
					botao01.getX() + 20, 
					botao01.getY() + 10
				);

				if(botao01.getHeight() - 5 <=0){
					somar = true;
				}
				if(!somar){
					botao01.setSize(
						botao01.getWidth(),
						botao01.getHeight() - 5
					);
				}
				else{
					botao01.setSize(
						botao01.getWidth(),
						botao01.getHeight() + 5
					);
				}
			}});

		tela.setVisible(true);
	}

}