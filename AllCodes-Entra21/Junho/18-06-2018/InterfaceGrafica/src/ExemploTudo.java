
import exemplo00.ExemploJFrame01;
import exemplo01.ExemploJButton01;
import exemplo02.ExemploJLabel01;
import exemplo03.ExemploJTextField01;
import exemplo04.ExemploJButton02;
import exemplo05.ExemploJComboBox;
import exemplo06.ExemploJTextArea01;
import exemplo07.ExemploJRadioButton01;
import exemplo08.ExemploJCheckBox01;
import exemplo08.JFrameBaseInteface;
import exemplo09.ExemploJTable01;
import exemplo10.ExemploHospitalJFrame;
import exemplo11.ExemploJFrameKeyPressed;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class ExemploTudo implements JFrameBaseInteface {

    private JFrame jFrame;
    private JButton jButton00;
    private JButton jButton01;
    private JButton jButton02;
    private JButton jButton03;
    private JButton jButton04;
    private JButton jButton05;
    private JButton jButton06;
    private JButton jButton07;
    private JButton jButton08;
    private JButton jButton09;
    private JButton jButton10;
    private JButton jButton11;
    
    public ExemploTudo(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarAcoesBotoes();
        jFrame.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Exemplo Tudo");
        jFrame.setSize(500, 600);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton00);
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
        jFrame.add(jButton10);
        jFrame.add(jButton11);
    }

    @Override
    public void instanciarComponentes() {
        jButton00 = new JButton("Exemplo 00");
        jButton01 = new JButton("Exemplo 01");
        jButton02 = new JButton("Exemplo 02");
        jButton03 = new JButton("Exemplo 03");
        jButton04 = new JButton("Exemplo 04");
        jButton05 = new JButton("Exemplo 05");
        jButton06 = new JButton("Exemplo 06");
        jButton07 = new JButton("Exemplo 07");
        jButton08 = new JButton("Exemplo 08");
        jButton09 = new JButton("Exemplo 09");
        jButton10 = new JButton("Exemplo 10");
        jButton11 = new JButton("Exemplo 11");
    }

    @Override
    public void gerarDimensoes() {
        jButton00.setSize(400, 25);
        jButton01.setSize(400, 25);
        jButton02.setSize(400, 25);
        jButton03.setSize(400, 25);
        jButton04.setSize(400, 25);
        jButton05.setSize(400, 25);
        jButton06.setSize(400, 25);
        jButton07.setSize(400, 25);
        jButton08.setSize(400, 25);
        jButton09.setSize(400, 25);
        jButton10.setSize(400, 25);
        jButton11.setSize(400, 25);
    }

    @Override
    public void gerarLocalizacoes() {
        jButton00.setLocation(40, 5);
        jButton01.setLocation(40, 45);
        jButton02.setLocation(40, 85);
        jButton03.setLocation(40, 125);
        jButton04.setLocation(40, 165);
        jButton05.setLocation(40, 205);
        jButton06.setLocation(40, 245);
        jButton07.setLocation(40, 285);
        jButton08.setLocation(40, 325);
        jButton09.setLocation(40, 365);
        jButton10.setLocation(40, 405);
        jButton11.setLocation(40, 445);
    }

    public void adicionarAcoesBotoes() {
        jButton00.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJFrame01();
                    }
                });
            }
        });
        jButton01.addActionListener((ActionEvent e) -> {
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new ExemploJButton01();
                }
            });
        });
        jButton02.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJLabel01();
                    }
                });
            }
        });
        jButton03.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJTextField01();
                    }
                });
            }
        });
        jButton04.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJButton02();
                    }
                });
            }
        });
        jButton05.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJComboBox();
                    }
                });
            }
        });
        jButton06.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJTextArea01();
                    }
                });
            }
        });
        jButton07.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJRadioButton01();
                    }
                });
            }
        });
        jButton08.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJCheckBox01();
                    }
                });
            }
        });
        jButton09.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJTable01();
                    }
                });
            }
        });
        jButton10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploHospitalJFrame();
                    }
                });
            }
        });
        jButton11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ExemploJFrameKeyPressed();
                    }
                });
            }
        });
    }
}
