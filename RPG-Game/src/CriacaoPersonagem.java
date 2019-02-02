/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Admin
 */
public class CriacaoPersonagem {

    private JFrame tela;
    private JFrame tela2;

    private JButton jbWizard,
            jbThief,
            jbWarrior,
            jbArcher,
            jbCleric,
            jbBerserk,
            jbCancelar,
            jbAvancar;

    private JLabel jlNome,
            jlSexo,
            jlClasse,
            jlRaca,
            jlReino,
            jlHistoria,
            jlDescricao,
            jlHp,
            jlMp,
            jlSp,
            jlSpBar,
            jlMpBar,
            jlHpBar;

    private JTextField jtfNome;

    private JRadioButton jrbRacaAnao,
            jrbRacaElfo,
            jrbRacaHumano,
            jrbRacaOrc,
            jrbSexoF,
            jrbSexoM,
            jrbReinoSol,
            jrbReinoLua,
            jrbReinoAr,
            jrbReinoFogo,
            jrbReinoTerra,
            jrbReinoAgua;

    private ButtonGroup bgRaca,
            bgReino,
            bgSexo;

    private JTextArea jtaHistoria;
    private JTextArea jtaDescricao;

    private JScrollPane jScrollPane;
    private JLabel jlBackground;
    private int presetsCount = 0;

    private int classeHpValor = 0;
    private int racaHpValor = 0;
    private int classeMpValor = 0;
    private int racaMpValor = 0;
    private int classeSpValor = 0;
    private int racaSpValor = 0;
    private String classeEscolha = "";
    
    Sistema sistema = new Sistema();
    PersonagemAtributos load1 = new PersonagemAtributos();
    PersonagemAtributos load2 = new PersonagemAtributos();
    PersonagemAtributos load3 = new PersonagemAtributos();

    public CriacaoPersonagem() {
        gerarTela();
        instanciarComponentes();
        adicionarIcons();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionandoButtonGroup();
        estilizacaoGeral();
        adicionarDescricao();
        removendoBackgroundLabel();
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

        tela2 = new JFrame("Yuki Yuna no Bouken");
        tela2.setSize(500 + 3 + 3, 500 + 25 + 3);//consideracoes adicionais para titulo e borda de janela
        tela2.setLayout(null);
        tela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela2.setLocationRelativeTo(null);
        tela2.setResizable(false);
    }

    private void instanciarComponentes() {
        jbWizard = new JButton("");
        jbThief = new JButton("");
        jbWarrior = new JButton("");
        jbArcher = new JButton("");
        jbCleric = new JButton("");
        jbBerserk = new JButton("");

        jbAvancar = new JButton("Avançar");
        jbCancelar = new JButton("Cancelar");

        jlNome = new JLabel("Nome");
        jlSexo = new JLabel("Sexo");
        jlClasse = new JLabel("Classe");
        jlRaca = new JLabel("Raça");
        jlReino = new JLabel("Reino");
        jlDescricao = new JLabel("Descrição");
        jlHistoria = new JLabel("História");
        jlHp = new JLabel("Vida");
        jlMp = new JLabel("Mana");
        jlSp = new JLabel("Vigor");
        jlHpBar = new JLabel("");
        jlMpBar = new JLabel("");
        jlSpBar = new JLabel("");
        jlBackground = new JLabel("");

        jtfNome = new JTextField("");

        jrbRacaAnao = new JRadioButton("Anão");
        jrbRacaElfo = new JRadioButton("Elfo");
        jrbRacaHumano = new JRadioButton("Humano");
        jrbRacaOrc = new JRadioButton("Orc");
        jrbSexoF = new JRadioButton("Feminino");
        jrbSexoM = new JRadioButton("Masculino");
        jrbReinoAgua = new JRadioButton("Água");
        jrbReinoTerra = new JRadioButton("Terra");
        jrbReinoFogo = new JRadioButton("Fogo");
        jrbReinoAr = new JRadioButton("Ar");
        jrbReinoLua = new JRadioButton("Lua");
        jrbReinoSol = new JRadioButton("Sol");

        bgRaca = new ButtonGroup();
        bgReino = new ButtonGroup();
        bgSexo = new ButtonGroup();

        jtaHistoria = new JTextArea("");
        jtaDescricao = new JTextArea("");

        jScrollPane = new JScrollPane(jtaHistoria);
    }

    private void adicionarIcons() {
        jlBackground.setIcon(new ImageIcon(getClass().getResource("backgrounds/backgroundCharCreation.png")));
        jbWizard.setIcon(new ImageIcon(getClass().getResource("classes/wizard.gif")));
        jbThief.setIcon(new ImageIcon(getClass().getResource("classes/thief.gif")));
        jbWarrior.setIcon(new ImageIcon(getClass().getResource("classes/warrior.gif")));
        jbArcher.setIcon(new ImageIcon(getClass().getResource("classes/archer.gif")));
        jbCleric.setIcon(new ImageIcon(getClass().getResource("classes/cleric.gif")));
        jbBerserk.setIcon(new ImageIcon(getClass().getResource("classes/berserk.gif")));
    }

    private void gerarDimensoes() {
        jlBackground.setSize(jlBackground.getIcon().getIconWidth(), jlBackground.getIcon().getIconHeight());

        jbWizard.setSize(jbWizard.getIcon().getIconWidth(), jbWizard.getIcon().getIconHeight());
        jbThief.setSize(jbThief.getIcon().getIconWidth(), jbThief.getIcon().getIconHeight());
        jbWarrior.setSize(jbWarrior.getIcon().getIconWidth(), jbWarrior.getIcon().getIconHeight());
        jbArcher.setSize(jbArcher.getIcon().getIconWidth(), jbArcher.getIcon().getIconHeight());
        jbCleric.setSize(jbCleric.getIcon().getIconWidth(), jbCleric.getIcon().getIconHeight());
        jbBerserk.setSize(jbBerserk.getIcon().getIconWidth(), jbBerserk.getIcon().getIconHeight());

        jtfNome.setSize(200, 25);

        jlNome.setSize(50, 25);
        jlSexo.setSize(50, 25);
        jlClasse.setSize(50, 25);
        jlReino.setSize(50, 25);
        jlRaca.setSize(50, 25);
        jlHistoria.setSize(80, 25);
        jlDescricao.setSize(80, 25);
        jlHp.setSize(40, 25);
        jlMp.setSize(40, 25);
        jlSp.setSize(40, 25);
        jlHpBar.setSize(100, 15);
        jlMpBar.setSize(100, 15);
        jlSpBar.setSize(100, 15);

        jrbRacaAnao.setSize(55, 25);
        jrbRacaElfo.setSize(50, 25);
        jrbRacaHumano.setSize(75, 25);
        jrbRacaOrc.setSize(75, 25);
        jrbReinoAgua.setSize(55, 25);
        jrbReinoAr.setSize(40, 25);
        jrbReinoFogo.setSize(55, 25);
        jrbReinoTerra.setSize(60, 25);
        jrbReinoLua.setSize(50, 25);
        jrbReinoSol.setSize(50, 25);
        jrbSexoF.setSize(80, 25);
        jrbSexoM.setSize(90, 25);

        jtaDescricao.setSize(300, 150);

        jbAvancar.setSize(170, 70);
        jbCancelar.setSize(170, 70);

        jScrollPane.setSize(0, 0);
    }

    private void gerarLocalizacoes() {
        jlBackground.setLocation(0, 0);

        jbWizard.setLocation(10, 210);
        jbThief.setLocation(jbWizard.getX() + jbWizard.getHeight(), 210);
        jbWarrior.setLocation(jbThief.getX() + jbThief.getHeight(), 210);
        jbArcher.setLocation(jbWarrior.getX() + jbWarrior.getHeight(), 210);
        jbBerserk.setLocation(jbArcher.getX() + jbArcher.getHeight(), 210);
        jbCleric.setLocation(jbBerserk.getX() + jbBerserk.getHeight(), 210);

        jtfNome.setLocation(jlNome.getX() + jlNome.getWidth() + 10, 10);

        jlNome.setLocation(10, 10);
        jlSexo.setLocation(10, 50);
        jlRaca.setLocation(10, 90);
        jlReino.setLocation(10, 130);
        jlClasse.setLocation(10, 170);
        jlDescricao.setLocation(10, 300);
        //jlHistoria.setLocation(0, 0);
        jlHp.setLocation(jtfNome.getX() + jtfNome.getWidth() + 80, 10);
        jlMp.setLocation(jtfNome.getX() + jtfNome.getWidth() + 80, 40);
        jlSp.setLocation(jtfNome.getX() + jtfNome.getWidth() + 80, 70);

        jlHpBar.setLocation(jlHp.getX() + jlHp.getWidth(), jlHp.getY() + 5);
        jlMpBar.setLocation(jlMp.getX() + jlMp.getWidth(), jlMp.getY() + 5);
        jlSpBar.setLocation(jlSp.getX() + jlSp.getWidth(), jlSp.getY() + 5);

        jrbRacaAnao.setLocation(jlRaca.getX() + jlRaca.getWidth(), 90);
        jrbRacaElfo.setLocation(jrbRacaAnao.getX() + jrbRacaAnao.getWidth(), 90);
        jrbRacaHumano.setLocation(jrbRacaElfo.getX() + jrbRacaElfo.getWidth(), 90);
        jrbRacaOrc.setLocation(jrbRacaHumano.getX() + jrbRacaHumano.getWidth(), 90);
        jrbReinoAgua.setLocation(jlReino.getX() + jlReino.getWidth(), 130);
        jrbReinoAr.setLocation(jrbReinoAgua.getX() + jrbReinoAgua.getWidth(), 130);
        jrbReinoFogo.setLocation(jrbReinoAr.getX() + jrbReinoAr.getWidth(), 130);
        jrbReinoTerra.setLocation(jrbReinoFogo.getX() + jrbReinoFogo.getWidth(), 130);
        jrbReinoLua.setLocation(jrbReinoTerra.getX() + jrbReinoTerra.getWidth(), 130);
        jrbReinoSol.setLocation(jrbReinoLua.getX() + jrbReinoLua.getWidth(), 130);
        jrbSexoF.setLocation(jlSexo.getX() + jlSexo.getWidth(), 50);
        jrbSexoM.setLocation(jrbSexoF.getX() + jrbSexoF.getWidth(), 50);

        jtaDescricao.setLocation(10, 330);

        jbAvancar.setLocation(320, 330);
        jbCancelar.setLocation(320, 410);

        jScrollPane.setLocation(0, 0);
    }

    private void estilizacaoGeral() {
        //fonte
        Font font = new Font("Arial New", 0, 16);
        Font font2 = new Font("Arial New", 0, 12);

        jlNome.setForeground(Color.white);
        jlSexo.setForeground(Color.white);
        jlRaca.setForeground(Color.white);
        jlReino.setForeground(Color.white);
        jlClasse.setForeground(Color.white);
        jlDescricao.setForeground(Color.white);

        jlHp.setForeground(Color.white);
        jlMp.setForeground(Color.white);
        jlSp.setForeground(Color.white);

        jrbRacaAnao.setForeground(Color.white);
        jrbRacaElfo.setForeground(Color.white);
        jrbRacaHumano.setForeground(Color.white);
        jrbRacaOrc.setForeground(Color.white);
        jrbReinoAgua.setForeground(Color.white);
        jrbReinoAr.setForeground(Color.white);
        jrbReinoFogo.setForeground(Color.white);
        jrbReinoTerra.setForeground(Color.white);
        jrbReinoLua.setForeground(Color.white);
        jrbReinoSol.setForeground(Color.white);
        jrbSexoF.setForeground(Color.white);
        jrbSexoM.setForeground(Color.white);

        jlNome.setFont(font);
        jlSexo.setFont(font);
        jlRaca.setFont(font);
        jlReino.setFont(font);
        jlClasse.setFont(font);
        jlDescricao.setFont(font);

        jlHp.setFont(font2);
        jlMp.setFont(font2);
        jlSp.setFont(font2);

        jrbRacaAnao.setFont(font2);
        jrbRacaElfo.setFont(font2);
        jrbRacaHumano.setFont(font2);
        jrbRacaOrc.setFont(font2);
        jrbReinoAgua.setFont(font2);
        jrbReinoAr.setFont(font2);
        jrbReinoFogo.setFont(font2);
        jrbReinoTerra.setFont(font2);
        jrbReinoLua.setFont(font2);
        jrbReinoSol.setFont(font2);
        jrbSexoF.setFont(font2);
        jrbSexoM.setFont(font2);

        //stats bar
        jlHpBar.setBackground(Color.decode("#ff3333"));
        jlHpBar.setOpaque(true);
        jlHpBar.setBorder(new LineBorder(Color.decode("#ff6666"), 2));
        jlHpBar.setText("" + 100);
        jlMpBar.setBackground(Color.decode("#0099ff"));
        jlMpBar.setOpaque(true);
        jlMpBar.setBorder(new LineBorder(Color.decode("#33adff"), 2));
        jlMpBar.setText("" + 100);
        jlSpBar.setBackground(Color.decode("#99ff33"));
        jlSpBar.setOpaque(true);
        jlSpBar.setBorder(new LineBorder(Color.decode("#b3ff66"), 2));
        jlSpBar.setText("" + 100);

    }

    private void statsBars() {
        jlHpBar.setText("" + (100 + classeHpValor + racaHpValor));
        jlMpBar.setText("" + (100 + classeMpValor + racaMpValor));
        jlSpBar.setText("" + (100 + classeSpValor + racaSpValor));
    }

    private void removendoBackgroundLabel() {
        jrbRacaAnao.setContentAreaFilled(false);
        jrbRacaElfo.setContentAreaFilled(false);
        jrbRacaHumano.setContentAreaFilled(false);
        jrbRacaOrc.setContentAreaFilled(false);
        jrbSexoF.setContentAreaFilled(false);
        jrbSexoM.setContentAreaFilled(false);
        jrbReinoAgua.setContentAreaFilled(false);
        jrbReinoTerra.setContentAreaFilled(false);
        jrbReinoFogo.setContentAreaFilled(false);
        jrbReinoAr.setContentAreaFilled(false);
        jrbReinoLua.setContentAreaFilled(false);
        jrbReinoSol.setContentAreaFilled(false);
    }

    private void adicionandoButtonGroup() {
        bgRaca.add(jrbRacaAnao);
        bgRaca.add(jrbRacaElfo);
        bgRaca.add(jrbRacaHumano);
        bgRaca.add(jrbRacaOrc);
        bgReino.add(jrbReinoAgua);
        bgReino.add(jrbReinoAr);
        bgReino.add(jrbReinoFogo);
        bgReino.add(jrbReinoTerra);
        bgReino.add(jrbReinoLua);
        bgReino.add(jrbReinoSol);
        bgSexo.add(jrbSexoF);
        bgSexo.add(jrbSexoM);
    }

    private void adicionarDescricao() {
        jtaDescricao.setEditable(false);
        jtaDescricao.setBorder(new LineBorder(Color.GRAY, 1));
        jtaDescricao.setLineWrap(true);
    }

    private void adicionarComponentes() {

        tela.add(jtfNome);
        tela.add(jrbRacaAnao);
        tela.add(jrbRacaElfo);
        tela.add(jrbRacaHumano);
        tela.add(jrbRacaOrc);
        tela.add(jrbReinoAgua);
        tela.add(jrbReinoAr);
        tela.add(jrbReinoFogo);
        tela.add(jrbReinoTerra);
        tela.add(jrbReinoLua);
        tela.add(jrbReinoSol);
        tela.add(jrbSexoF);
        tela.add(jrbSexoM);
        tela.add(jlNome);
        tela.add(jlSexo);
        tela.add(jlClasse);
        tela.add(jlRaca);
        tela.add(jlReino);
        tela.add(jlDescricao);
        tela.add(jtaDescricao);
        /*tela.add(jlAltura);
         tela.add(jlPeso);*/
 /*tela.add(jlHistoria);*/
        tela.add(jlHp);
        tela.add(jlMp);
        tela.add(jlSp);
        tela.add(jlHpBar);
        tela.add(jlMpBar);
        tela.add(jlSpBar);
        /*tela.add(jScrollPane);*/
        tela.add(jbWizard);
        tela.add(jbThief);
        tela.add(jbWarrior);
        tela.add(jbArcher);
        tela.add(jbCleric);
        tela.add(jbBerserk);
        tela.add(jbAvancar);
        tela.add(jbCancelar);
        tela.add(jlBackground);
        tela.setVisible(true);
    }

    private void adicionarAcoes() {
        jbCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tela.dispose();
                EventQueue.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new TelaInicial();
                    }
                });
            }
        });
        jbAvancar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String presets = "No Load";
                PersonagemAtributos guarda = new PersonagemAtributos();
                if (presetsCount == 0) {
                    load1.setNomePersonagem(presets);
                    load2.setNomePersonagem(presets);
                    load3.setNomePersonagem(presets);
                }
                int i = JOptionPane.showConfirmDialog(null, "Tem certeza de seus dados?");
                if (i == JOptionPane.YES_OPTION) {
                    while (presetsCount != 2) {
                        guarda.setNomePersonagem(
                                jtfNome.getText().equals("No Load") ? ""
                                : jtfNome.getText()
                        );
                        guarda.setClasse(
                                classeEscolha.equals("") ? ""
                                : classeEscolha);
                        guarda.setRaca(
                                jrbRacaAnao.isSelected() ? "Anao"
                                : jrbRacaElfo.isSelected() ? "Elfo"
                                : jrbRacaHumano.isSelected() ? "Humano"
                                : jrbRacaOrc.isSelected() ? "Orc"
                                : ""
                        );
                        guarda.setHP(Double.parseDouble(jlHpBar.getText()));
                        guarda.setMP(Double.parseDouble(jlMpBar.getText()));
                        guarda.setSp(Double.parseDouble(jlSpBar.getText()));
                        guarda.setReino(
                                jrbReinoAgua.isSelected() ? "Agua"
                                : jrbReinoAr.isSelected() ? "Ar"
                                : jrbReinoFogo.isSelected() ? "Fogo"
                                : jrbReinoTerra.isSelected() ? "Terra"
                                : jrbReinoLua.isSelected() ? "Lua"
                                : jrbReinoSol.isSelected() ? "Sol"
                                : ""
                        );
                        guarda.setSexo(
                                jrbSexoF.isSelected() ? "Feminino"
                                : jrbSexoM.isSelected() ? "Masculino"
                                : ""
                        );
                        if (!guarda.getNomePersonagem().equals("")
                                && !guarda.getNomePersonagem().equals("No Load")
                                && !guarda.getClasse().equals("")
                                && !guarda.getRaca().equals("")
                                && !guarda.getReino().equals("")
                                && !guarda.getSexo().equals("")) {
                            presetsCount++;
                            break;
                        } else {
                            if (guarda.getNomePersonagem().equals("")) {
                                JOptionPane.showMessageDialog(null,
                                        "Você não escolheu um nome!"
                                        + "\nPor favor digite um para prosseguir");
                                guarda.setNomePersonagem("No Load");
                            }
                            if (guarda.getClasse().equals("")) {
                                JOptionPane.showMessageDialog(null,
                                        "Você não selecionou uma classe!"
                                        + "\nPor favor selecione para prosseguir");
                                guarda.setClasse("");
                            }
                            if (guarda.getRaca().equals("")) {
                                JOptionPane.showMessageDialog(null,
                                        "Você não selecionou uma raça!"
                                        + "\nPor favor selecione para prosseguir");
                                guarda.setRaca("");
                            }
                            if (guarda.getReino().equals("")) {
                                JOptionPane.showMessageDialog(null,
                                        "Você não selecionou uma reino!"
                                        + "\nPor favor selecione para prosseguir");
                                guarda.setReino("");
                            }
                            if (guarda.getSexo().equals("")) {
                                JOptionPane.showMessageDialog(null,
                                        "Você não selecionou uma sexo!"
                                        + "\nPor favor selecione para prosseguir");
                                guarda.setSexo("");
                            }
                            break;
                        }
                    }
                }
                if (load1.getNomePersonagem().equals(presets)) {
                    load1 = guarda;
                } else if (load2.getNomePersonagem().equals(presets)) {
                    load2 = guarda;
                } else if (load3.getNomePersonagem().equals(presets)) {
                    load3 = guarda;
                }
                if (!load1.getNomePersonagem().equals(presets)) {
                    tela.dispose();
                    sistema.load1 = load1;
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new TelaInicial();
                        }
                    });
                } else if (!load2.getNomePersonagem().equals(presets)) {
                    tela.dispose();
                    sistema.load2 = load2;
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new TelaInicial();
                        }
                    });
                } else if (!load3.getNomePersonagem().equals(presets)) {
                    tela.dispose();
                    sistema.load3 = load3;
                    EventQueue.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            new TelaInicial();
                        }
                    });
                }
            }
        });
        jrbRacaAnao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Anão Selecionado.");
                racaHpValor = 10;
                racaMpValor = 10;
                racaSpValor = 10;
                statsBars();
            }
        });
        jrbRacaElfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Elfo Selecionado.");
                racaHpValor = 20;
                racaMpValor = 20;
                racaSpValor = 20;
                statsBars();
            }
        });
        jrbRacaHumano.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Humano Selecionado.");
                racaHpValor = 30;
                racaMpValor = 30;
                racaSpValor = 30;
                statsBars();
            }
        });
        jrbRacaOrc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Orc Selecionado.");
                racaHpValor = 40;
                racaMpValor = 40;
                racaSpValor = 40;
                statsBars();
            }
        });
        jrbReinoAgua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Reino da Água Selecionado.");
            }
        });
        jrbReinoAr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Reino do Ar Selecionado.");
            }
        });
        jrbReinoFogo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Reino do Fogo Selecionado.");
            }
        });
        jrbReinoTerra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Reino da Terra Selecionado.");
            }
        });
        jrbReinoLua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Reino da Lua Selecionado.");
            }
        });
        jrbReinoSol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtaDescricao.setText("  Reino do Sol Selecionado.");
            }
        });
        jbArcher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jbArcher.getBackground().equals(Color.lightGray)) {
                    jbBerserk.setBackground(jbArcher.getBackground());
                    jbCleric.setBackground(jbArcher.getBackground());
                    jbThief.setBackground(jbArcher.getBackground());
                    jbWarrior.setBackground(jbArcher.getBackground());
                    jbWizard.setBackground(jbArcher.getBackground());
                }
                jbArcher.setBackground(Color.lightGray);
                jtaDescricao.setText("  Arqueiro Selecionado.");
                classeEscolha = "Arqueiro";
                classeHpValor = 1;
                classeMpValor = 1;
                classeSpValor = 1;
                statsBars();
            }
        });
        jbBerserk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jbBerserk.getBackground().equals(Color.lightGray)) {
                    jbArcher.setBackground(jbBerserk.getBackground());
                    jbCleric.setBackground(jbBerserk.getBackground());
                    jbThief.setBackground(jbBerserk.getBackground());
                    jbWarrior.setBackground(jbBerserk.getBackground());
                    jbWizard.setBackground(jbBerserk.getBackground());
                }
                jbBerserk.setBackground(Color.lightGray);
                jtaDescricao.setText("  Berserk Selecionado. ");
                classeEscolha = "Berserk";
                classeHpValor = 2;
                classeMpValor = 2;
                classeSpValor = 2;
                statsBars();
            }
        });
        jbCleric.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jbCleric.getBackground().equals(Color.lightGray)) {
                    jbBerserk.setBackground(jbCleric.getBackground());
                    jbArcher.setBackground(jbCleric.getBackground());
                    jbThief.setBackground(jbCleric.getBackground());
                    jbWarrior.setBackground(jbCleric.getBackground());
                    jbWizard.setBackground(jbCleric.getBackground());
                }
                jbCleric.setBackground(Color.lightGray);
                jtaDescricao.setText("  Clérigo Selecionado. ");
                classeEscolha = "Clérigo";
                classeHpValor = 3;
                classeMpValor = 3;
                classeSpValor = 3;
                statsBars();
            }
        });
        jbThief.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jbThief.getBackground().equals(Color.lightGray)) {
                    jbBerserk.setBackground(jbThief.getBackground());
                    jbCleric.setBackground(jbThief.getBackground());
                    jbArcher.setBackground(jbThief.getBackground());
                    jbWarrior.setBackground(jbThief.getBackground());
                    jbWizard.setBackground(jbThief.getBackground());
                }
                jbThief.setBackground(Color.lightGray);
                jtaDescricao.setText("  Ladrão Selecionado. ");
                classeEscolha = "Ladrão";
                classeHpValor = 4;
                classeMpValor = 4;
                classeSpValor = 4;
                statsBars();
            }
        });
        jbWarrior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jbWarrior.getBackground().equals(Color.lightGray)) {
                    jbBerserk.setBackground(jbWarrior.getBackground());
                    jbCleric.setBackground(jbWarrior.getBackground());
                    jbThief.setBackground(jbWarrior.getBackground());
                    jbArcher.setBackground(jbWarrior.getBackground());
                    jbWizard.setBackground(jbWarrior.getBackground());
                }
                jbWarrior.setBackground(Color.lightGray);
                jtaDescricao.setText("  Guerreiro Selecionado. ");
                classeEscolha = "Guerreiro";
                classeHpValor = 5;
                classeMpValor = 5;
                classeSpValor = 5;
                statsBars();
            }
        });
        jbWizard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!jbWizard.getBackground().equals(Color.lightGray)) {
                    jbBerserk.setBackground(jbWizard.getBackground());
                    jbCleric.setBackground(jbWizard.getBackground());
                    jbThief.setBackground(jbWizard.getBackground());
                    jbWarrior.setBackground(jbWizard.getBackground());
                    jbArcher.setBackground(jbWizard.getBackground());
                }
                jbWizard.setBackground(Color.lightGray);
                jtaDescricao.setText("  Feiticeiro Selecionado. ");
                classeEscolha = "Feiticeiro";
                classeHpValor = 6;
                classeMpValor = 6;
                classeSpValor = 6;
                statsBars();
            }
        });

    }
}
