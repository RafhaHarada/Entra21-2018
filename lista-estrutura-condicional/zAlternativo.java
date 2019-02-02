/*Enunciado

3.Solicite para o usuário dois números e apresente o seguinte menu:
MENU
1Somar
2Subtrair
3Multiplicar
4Dividir

Após usuário escolher o número do menu, deve-se apresentar o cálculo dos dois números
solicitados de acordo com o menu solicitado.

*/

import javax.swing.*;
import java.awt.*;

public class Alternativo {
    
        private JFrame f;
        private JPanel p;
        private JButton b1,b2,b3,b4;
        private JLabel lab1,lab2,lab3,lab4,lab5;

        public Exercicio3(){

            gui();
        
        }

        public void gui(){
            f = new JFrame();
            f.setVisible(true);
            f.setSize(400,300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            p = new JPanel(new GridBagLayout());
            p.setBackground(Color.LIGHT_GRAY);

            b1 = new JButton("b1");
            b2 = new JButton("b2");
            b3 = new JButton("b3");
            b4 = new JButton("b4");
            lab1 = new JLabel("Text1");
            lab2 = new JLabel("Text2");
            lab3 = new JLabel("Text3");
            lab4 = new JLabel("Text4");
            lab5 = new JLabel("Text5");

            GridBagConstraints c = new GridBagConstraints();

            c.insets = new Insets(5, 5, 5, 5);
            
            c.gridx = -1; c.gridy = 1; p.add(b1,c);
            c.gridx = -1; c.gridy = 2; p.add(b2,c);
            c.gridx = -1; c.gridy = 3; p.add(b3,c);
            c.gridx = -1; c.gridy = 4; p.add(b4,c);

            c.gridx = 0; c.gridy = 0; p.add(lab5,c);
            c.gridx = -1; c.gridy = 1; p.add(lab1,c);
            c.gridx = -1; c.gridy = 2; p.add(lab2,c);
            c.gridx = -1; c.gridy = 3; p.add(lab3,c);
            c.gridx = -1; c.gridy = 4; p.add(lab4,c);

            f.add(p);
        }

    public static void main(String[] args){
        
        new Exercicio3();

        /*JFrame menu = new Exercicio3("Menu");
        menu.setSize(300, 100);
        menu.setLocation(500, 500);
        menu.setBackground(Color.LIGHT_GRAY);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(true);
        menu.setVisible(true);*/
        }


	}