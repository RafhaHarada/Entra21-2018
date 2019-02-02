package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interfaces.JFrameBaseInterface;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/*
 * @author Airam
 */
public class AlunoCadastro implements JFrameBaseInterface {

    private JFrame jFrameCadastro;
    private JLabel jLabelId,
            jLabelNome,
            jLabelNota1,
            jLabelNota2,
            jLabelNota3,
            jLabelNota4,
            jLabelMedia,
            jLabelMateria,
            jLabelResultadoMedia,
            jLabelDescricao,
            jLabelPesquisar;
    private JScrollPane jScrollPaneDescricao;
    private JTextField jTextFieldId,
            jTextFieldNome,
            jTextFieldNota1,
            jTextFieldNota2,
            jTextFieldNota3,
            jTextFieldNota4,
            jTextFieldPesquisa;
    private JComboBox jComboBoxMateria;
    private JTextArea jTextAreaDescricao;
    private JButton jButtonSalvar;

    public AlunoCadastro() {
        configurandoLookAndFeel();
        gerarTela();
        instanciarComponentes();

        configScrollPane();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configBotaoSalvar();
        configurarJComboBox();
        jFrameCadastro.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrameCadastro = new JFrame();
        jFrameCadastro.setSize(710, 530);
        jFrameCadastro.setLayout(null);
        jFrameCadastro.setLocationRelativeTo(null);
        jFrameCadastro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrameCadastro.add(jLabelId);
        jFrameCadastro.add(jLabelNome);
        jFrameCadastro.add(jLabelNota1);
        jFrameCadastro.add(jLabelNota2);
        jFrameCadastro.add(jLabelNota3);
        jFrameCadastro.add(jLabelNota4);
        jFrameCadastro.add(jLabelMedia);
        jFrameCadastro.add(jLabelMateria);
        jFrameCadastro.add(jLabelResultadoMedia);
        jFrameCadastro.add(jLabelDescricao);
        jFrameCadastro.add(jLabelPesquisar);
        jFrameCadastro.add(jTextFieldId);
        jFrameCadastro.add(jTextFieldNome);
        jFrameCadastro.add(jTextFieldNota1);
        jFrameCadastro.add(jTextFieldNota2);
        jFrameCadastro.add(jTextFieldNota3);
        jFrameCadastro.add(jTextFieldNota4);
        jFrameCadastro.add(jTextFieldPesquisa);
        jFrameCadastro.add(jComboBoxMateria);
        jFrameCadastro.add(jButtonSalvar);
        jFrameCadastro.add(jScrollPaneDescricao);
    }

    @Override
    public void instanciarComponentes() {

        jLabelDescricao = new JLabel("Descrição");
        jLabelMedia = new JLabel("Media:");

        jLabelResultadoMedia = new JLabel("0");
        jLabelResultadoMedia.setFont(new Font("Magneto Negrito", 0, 32));

        jLabelNome = new JLabel("Nome");
        jLabelNota1 = new JLabel("Nota 1");
        jLabelNota2 = new JLabel("Nota 2");
        jLabelNota3 = new JLabel("Nota 3");
        jLabelNota4 = new JLabel("Nota 4");
        jLabelPesquisar = new JLabel("Pesquisar");
        jLabelMateria = new JLabel("Matéria");
        jLabelId = new JLabel("Id");

        jTextFieldId = new JTextField();
        jTextFieldNome = new JTextField();
        jTextFieldNota1 = new JTextField();
        jTextFieldNota2 = new JTextField();
        jTextFieldNota3 = new JTextField();
        jTextFieldNota4 = new JTextField();
        jTextFieldPesquisa = new JTextField();

        jComboBoxMateria = new JComboBox();

        jButtonSalvar = new JButton("Salvar");

        jScrollPaneDescricao = new JScrollPane(jTextAreaDescricao);
        jTextAreaDescricao = new JTextArea();

    }

    @Override
    public void gerarLocalizacoes() {

        jLabelId.setLocation(10, 10);
        jTextFieldId.setLocation(10, 40);

        jLabelNome.setLocation(220, 10);
        jTextFieldNome.setLocation(220, 40);

        jLabelNota1.setLocation(10, 70);
        jTextFieldNota1.setLocation(10, 100);

        jLabelNota2.setLocation(220, 70);
        jTextFieldNota2.setLocation(220, 100);

        jLabelNota3.setLocation(10, 130);
        jTextFieldNota3.setLocation(10, 160);

        jLabelNota4.setLocation(220, 130);
        jTextFieldNota4.setLocation(220, 160);

        jLabelMateria.setLocation(10, 190);
        jComboBoxMateria.setLocation(10, 220);

        jLabelMedia.setLocation(290, 220);
        jLabelResultadoMedia.setLocation(340, 220);

        jLabelDescricao.setLocation(10, 250);
        jScrollPaneDescricao.setLocation(10, 285);

        jLabelPesquisar.setLocation(450, 10);
        jTextFieldPesquisa.setLocation(450, 40);

        jButtonSalvar.setLocation(350, 445);

    }

    @Override
    public void gerarDimensoes() {

        jLabelId.setSize(150, 25);
        jTextFieldId.setSize(200, 25);

        jLabelNome.setSize(150, 25);
        jTextFieldNome.setSize(200, 25);

        jLabelNota1.setSize(150, 25);
        jTextFieldNota1.setSize(200, 25);

        jLabelNota2.setSize(150, 25);
        jTextFieldNota2.setSize(200, 25);

        jLabelNota3.setSize(150, 25);
        jTextFieldNota3.setSize(200, 25);

        jLabelNota4.setSize(150, 25);
        jTextFieldNota4.setSize(200, 25);

        jLabelMateria.setSize(150, 25);
        jComboBoxMateria.setSize(200, 25);

        jLabelMedia.setSize(150, 25);
        jLabelResultadoMedia.setSize(150, 25);

        jLabelDescricao.setSize(150, 25);
        jScrollPaneDescricao.setSize(410, 150);

        jLabelPesquisar.setSize(150, 25);
        jTextFieldPesquisa.setSize(150, 25);

        jButtonSalvar.setSize(70, 25);

    }

    private void configScrollPane() {

        jScrollPaneDescricao.setViewportView(jTextAreaDescricao);
        jScrollPaneDescricao.setVerticalScrollBarPolicy(jScrollPaneDescricao.VERTICAL_SCROLLBAR_AS_NEEDED);
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setEditable(true);
    }

    public static void configurandoLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException e) {

        } catch (ClassNotFoundException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        }
    }

    public void configBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (jTextFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nome deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }

                if (jTextFieldNome.getText().equalsIgnoreCase("sara")) {
                    int opcao = JOptionPane.showOptionDialog(null,
                            "Você não quis dizer \"Sarah, com H?\"", "Correção",
                            0,
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{
                                "Sim", "Não"
                            },
                            "Sim");
                    if (opcao == 0) {
                        jTextFieldNome.setText(jTextFieldNome.getText() + "h");
                        JOptionPane.showMessageDialog(null, "Erros acontecem :D");
                    } else if (opcao == 1) {
                        int opcao2 = JOptionPane.showOptionDialog(null,
                                "Sarah é com H", "Correção",
                                0,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new Object[]{
                                    "Eu aceito"
                                },
                                "Eu aceito, Sarah é com H");
                        jTextFieldNome.setText(jTextFieldNome.getText() + "h");
                    }
                }

                if (jTextFieldNome.getText().trim().length() < 3) {
                    JOptionPane.showMessageDialog(null, "Nome deve ter no mínimo 3 caractéres");
                    jTextFieldNome.requestFocus();
                    return;
                }

                if (jTextFieldNota1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nota 1 deve ser preenchido");
                    jTextFieldNota1.requestFocus();
                    return;
                }
                int nota1 = Integer.parseInt(jTextFieldNota1.getText());

                if (nota1 < 0 || nota1 > 10) {
                    JOptionPane.showMessageDialog(null, "Nota 1 é invalida");
                    jTextFieldNota1.requestFocus();
                    return;
                }
                int nota2 = Integer.parseInt(jTextFieldNota2.getText());

                if (nota2 < 0 || nota2 > 10) {
                    JOptionPane.showMessageDialog(null, "Nota 2 é invalida");
                    jTextFieldNota2.requestFocus();
                    return;
                }
                int nota3 = Integer.parseInt(jTextFieldNota3.getText());

                if (nota3 < 0 || nota3 > 10) {
                    JOptionPane.showMessageDialog(null, "Nota 3 é invalida");
                    jTextFieldNota3.requestFocus();
                    return;
                }
                int nota4 = Integer.parseInt(jTextFieldNota4.getText());

                if (nota4 < 0 || nota4 > 10) {
                    JOptionPane.showMessageDialog(null, "Nota 4 é invalida");
                    jTextFieldNota4.requestFocus();
                    return;
                }

                if (jTextFieldNota2.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nota 2 deve ser preenchido");
                    jTextFieldNota2.requestFocus();
                    return;
                }

                if (jTextFieldNota3.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nota 3 deve ser preenchido");
                    jTextFieldNota3.requestFocus();
                    return;
                }

                if (jTextFieldNota4.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nota 4 deve ser preenchido");
                    jTextFieldNota4.requestFocus();
                    return;
                }
            }

        });
    }

    private void configurarJComboBox() {
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.addElement("");
    }
}
