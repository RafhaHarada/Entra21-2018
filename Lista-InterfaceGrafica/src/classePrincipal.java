
import Exercicio1.Exercicio1;
import Exercicio2.Exercicio2;
import Exercicio3.Exercicio3;
import Exercicio4.Exercicio4;
import Exercicio5.Exercicio5;
import Exercicio6.Exercicio6;
import Exercicio7.Exercicio7;
import Exercicio8.Exercicio8;
import Exercicio9.Exercicio9;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Rafael Alipio Harada
 */
public class classePrincipal {

    private JFrame jFrame;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButton9;
    private JLabel jLabel;
    
    public classePrincipal(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        esteticaBotoes();
        adicionarAcoesBotoes();
        jFrame.setVisible(true);
    }

    public void gerarTela() {
        jFrame = new JFrame("Lista Exercicio");
        jFrame.setSize(500, 520);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void adicionarComponentes() {
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);
        jFrame.add(jButton5);
        jFrame.add(jButton6);
        jFrame.add(jButton7);
        jFrame.add(jButton8);
        jFrame.add(jButton9);
        jFrame.add(jLabel);
    }

    public void instanciarComponentes() {
        jButton1 = new JButton("Exercicio 1");
        jButton2 = new JButton("Exercicio 2");
        jButton3 = new JButton("Exercicio 3");
        jButton4 = new JButton("Exercicio 4");
        jButton5 = new JButton("Exercicio 5");
        jButton6 = new JButton("Exercicio 6");
        jButton7 = new JButton("Exercicio 7");
        jButton8 = new JButton("Exercicio 8");
        jButton9 = new JButton("Exercicio 9");
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(getClass().getResource("imagens/background.png")));
    }

    public void gerarDimensoes() {
        jButton1.setSize(400, 40);
        jButton2.setSize(400, 40);
        jButton3.setSize(400, 40);
        jButton4.setSize(400, 40);
        jButton5.setSize(400, 40);
        jButton6.setSize(400, 40);
        jButton7.setSize(400, 40);
        jButton8.setSize(400, 40);
        jButton9.setSize(400, 40);
        jLabel.setSize(jLabel.getIcon().getIconWidth(), jLabel.getIcon().getIconHeight());
    }

    public void gerarLocalizacoes() {
        jButton1.setLocation(40, 20);
        jButton2.setLocation(40, 70);
        jButton3.setLocation(40, 120);
        jButton4.setLocation(40, 170);
        jButton5.setLocation(40, 220);
        jButton6.setLocation(40, 270);
        jButton7.setLocation(40, 320);
        jButton8.setLocation(40, 370);
        jButton9.setLocation(40, 420);
        jLabel.setLocation(0, 0);
    }
    
    public void esteticaBotoes(){
        jButton1.setFocusPainted(false);
        jButton2.setFocusPainted(false);
        jButton3.setFocusPainted(false);
        jButton4.setFocusPainted(false);
        jButton5.setFocusPainted(false);
        jButton6.setFocusPainted(false);
        jButton7.setFocusPainted(false);
        jButton8.setFocusPainted(false);
        jButton9.setFocusPainted(false);
    }

    public void adicionarAcoesBotoes() {
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio1();
                    }
                });
            }
        });
        jButton2.addActionListener((ActionEvent e) -> {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Exercicio2();
                }
            });
        });
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio3();
                    }
                });
            }
        });
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio4();
                    }
                });
            }
        });
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio5();
                    }
                });
            }
        });
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio6();
                    }
                });
            }
        });
        jButton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio7();
                    }
                });
            }
        });
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio8();
                    }
                });
            }
        });
        jButton9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new Exercicio9();
                    }
                });
            }
        });
    }
    
}
