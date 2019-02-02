
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class TelaInicial {

    Sistema sistema = new Sistema();
    private JFrame tela;
    private JLabel titleGame;
    private JLabel titleName;
    private JButton novoJogo;
    private JButton continuarJogo;
    private JButton configuracoes;
    private JButton fechar;

    public TelaInicial() {
        gerarTela();
        instanciasComponentes();
        adicionarIcons();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcoes();
        tela.setVisible(true);
    }

    private void gerarTela() {
        tela = new JFrame("Yuki Yuna no Bouken");
        tela.setSize(500 + 3 + 3, 500 + 25 + 3);//consideracoes adicionais para titulo e borda de janela
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setResizable(false);
        tela.getContentPane().setBackground(Color.black);
    }

    private void instanciasComponentes() {
        titleGame = new JLabel("");
        titleName = new JLabel("");
        novoJogo = new JButton("");
        continuarJogo = new JButton("");
        configuracoes = new JButton("");
        fechar = new JButton("");
    }

    private void adicionarIcons() {
        titleGame.setIcon(new ImageIcon(getClass().getResource("backgrounds/title_background.gif")));
        titleName.setIcon(new ImageIcon(getClass().getResource("backgrounds/title_name.png")));
        novoJogo.setIcon(new ImageIcon(getClass().getResource("buttons/Title_new.png")));
        continuarJogo.setIcon(new ImageIcon(getClass().getResource("buttons/Title_load.png")));
        configuracoes.setIcon(new ImageIcon(getClass().getResource("buttons/Title_config.png")));
        fechar.setIcon(new ImageIcon(getClass().getResource("buttons/Title_exit.png")));
    }

    private void gerarDimensoes() {
        titleGame.setSize(titleGame.getIcon().getIconWidth(), titleGame.getIcon().getIconHeight());
        titleName.setSize(titleGame.getIcon().getIconWidth(), titleGame.getIcon().getIconHeight());
        novoJogo.setSize(30, 30);
        continuarJogo.setSize(30, 30);
        configuracoes.setSize(30, 30);
        fechar.setSize(30, 30);
    }

    private void gerarLocalizacoes() {
        titleGame.setLocation(
                0,
                ((tela.getHeight() - 28 - titleGame.getIcon().getIconHeight()) / 2));
        titleName.setLocation(
                150,
                ((tela.getHeight() - 28 - titleGame.getIcon().getIconHeight()) / 2) - 30);
        novoJogo.setLocation(10, ((tela.getWidth() - 6) / 4) + 30);
        continuarJogo.setLocation(10, ((tela.getWidth() - 6) / 4) + 70);
        /*configuracoes*/
        fechar.setLocation(10, ((tela.getWidth() - 6) / 4) + 110);
        //fechar.setLocation(10, ((tela.getWidth()-6)/4) + 150);
    }

    private void adicionarComponentes() {
        tela.add(novoJogo);
        tela.add(continuarJogo);
        //tela.add(configuracoes);
        tela.add(fechar);
        tela.add(titleName);
        tela.add(titleGame);
        tela.setVisible(true);
    }

    private void adicionarAcoes() {
        novoJogo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tela.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new CriacaoPersonagem();
                    }
                });
            }
        });
        continuarJogo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sistema.personagensCriados();
            }
        });
        configuracoes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        fechar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
//novo.set
        /*ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it 
        Image newimg = image.getScaledInstance(120, 120, Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);  // transform it back*/
