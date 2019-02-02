package Exercicio7;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio7 {

    private JFrame jFrame;
    JLabel jLabelNome,
            jLabelQuantidadeHoras,
            jLabelValorINSS,
            jLabelContribuicaoSindical,
            jLabelValorPasse,
            jLabelAuxilioAlmoco,
            jLabelAuxilioEducacao,
            jLabelAuxilioSaude,
            jLabelResultado,
            jLabelCargo;

    JTextField jTextFieldNome,
            jTextFieldQuantidadeHoras,
            jTextFieldValorINSS,
            jTextFieldContribuicaoSindical,
            jTextFieldValorPasse,
            jTextFieldAuxilioAlmoco,
            jTextFieldAuxilioEducacao,
            jTextFieldAuxilioSaude;

    JTextArea jTextAreaResultado;
    JComboBox jComboBoxCargo;

    JButton jButtonProcessar;

    private JScrollPane jScrollPane;

    private DefaultComboBoxModel defaultComboBoxModel;

    public Exercicio7() {
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        configurarJComboBox();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);

    }

    private void gerarTela() {
        jFrame = new JFrame("Exemplo JTextArea");
        jFrame.setSize(445, 500);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void instanciasComponentes() {
        jLabelNome = new JLabel("Nome");
        jLabelQuantidadeHoras = new JLabel("Quantidade de Horas");
        jLabelValorINSS = new JLabel("Valor do INSS");
        jLabelContribuicaoSindical = new JLabel("Contribuição Sindical");
        jLabelValorPasse = new JLabel("Valor do Passe");
        jLabelAuxilioAlmoco = new JLabel("Auxílio Almoço");
        jLabelAuxilioEducacao = new JLabel("Auxílio Educação");
        jLabelAuxilioSaude = new JLabel("Auxílio Saúde");
        jLabelResultado = new JLabel("Resultado");
        jLabelCargo = new JLabel("Cargo");

        jTextFieldNome = new JTextField();
        jTextFieldQuantidadeHoras = new JTextField();
        jTextFieldValorINSS = new JTextField();
        jTextFieldContribuicaoSindical = new JTextField();
        jTextFieldValorPasse = new JTextField();
        jTextFieldAuxilioAlmoco = new JTextField();
        jTextFieldAuxilioEducacao = new JTextField();
        jTextFieldAuxilioSaude = new JTextField();

        jTextAreaResultado = new JTextArea();
        jScrollPane = new JScrollPane(jTextAreaResultado);

        jTextAreaResultado.setLineWrap(true);

        jComboBoxCargo = new JComboBox();

        jButtonProcessar = new JButton("Processar");
    }

    private void gerarDimensoes() {
        jLabelNome.setSize(200, 25);
        jLabelQuantidadeHoras.setSize(200, 25);
        jLabelValorINSS.setSize(200, 25);
        jLabelContribuicaoSindical.setSize(200, 25);
        jLabelValorPasse.setSize(200, 25);
        jLabelAuxilioAlmoco.setSize(200, 25);
        jLabelAuxilioEducacao.setSize(200, 25);
        jLabelAuxilioSaude.setSize(200, 25);
        jLabelResultado.setSize(200, 25);
        jLabelCargo.setSize(200, 25);

        jTextFieldNome.setSize(200, 25);
        jTextFieldQuantidadeHoras.setSize(200, 25);
        jTextFieldValorINSS.setSize(200, 25);
        jTextFieldContribuicaoSindical.setSize(200, 25);
        jTextFieldValorPasse.setSize(200, 25);
        jTextFieldAuxilioAlmoco.setSize(200, 25);
        jTextFieldAuxilioEducacao.setSize(200, 25);
        jTextFieldAuxilioSaude.setSize(200, 25);

        jScrollPane.setSize(200, 135);
        jComboBoxCargo.setSize(200, 25);

        jButtonProcessar.setSize(200, 90);
    }

    private void gerarLocalizacoes() {
        jLabelNome.setLocation(10, 10);
        jLabelCargo.setLocation(jLabelNome.getX() + jLabelNome.getWidth() + 20, jLabelNome.getY());
        jLabelQuantidadeHoras.setLocation(jLabelNome.getX(), jLabelCargo.getY() + jLabelCargo.getHeight() + 45);
        jLabelValorINSS.setLocation(jLabelQuantidadeHoras.getX() + jLabelQuantidadeHoras.getWidth() + 20, jLabelQuantidadeHoras.getY());
        jLabelContribuicaoSindical.setLocation(jLabelQuantidadeHoras.getX(), jLabelValorINSS.getY() + jLabelValorINSS.getHeight() + 45);
        jLabelValorPasse.setLocation(jLabelContribuicaoSindical.getX() + jLabelContribuicaoSindical.getWidth() + 20, jLabelContribuicaoSindical.getY());
        jLabelAuxilioAlmoco.setLocation(jLabelContribuicaoSindical.getX(), jLabelValorPasse.getY() + jLabelValorPasse.getHeight() + 45);
        jLabelAuxilioEducacao.setLocation(jLabelAuxilioAlmoco.getX() + jLabelAuxilioAlmoco.getWidth() + 20, jLabelAuxilioAlmoco.getY());
        jLabelAuxilioSaude.setLocation(jLabelAuxilioAlmoco.getX(), jLabelAuxilioEducacao.getY() + jLabelAuxilioEducacao.getHeight() + 45);
        jLabelResultado.setLocation(jLabelAuxilioSaude.getX() + jLabelAuxilioSaude.getWidth() + 20, jLabelAuxilioSaude.getY());

        jTextFieldNome.setLocation(jLabelNome.getX(), jLabelNome.getY() + jLabelNome.getHeight() + 5);
        jTextFieldQuantidadeHoras.setLocation(jLabelQuantidadeHoras.getX(), jLabelQuantidadeHoras.getY() + jLabelQuantidadeHoras.getHeight() + 5);
        jTextFieldValorINSS.setLocation(jLabelValorINSS.getX(), jLabelValorINSS.getY() + jLabelValorINSS.getHeight() + 5);
        jTextFieldContribuicaoSindical.setLocation(jLabelContribuicaoSindical.getX(), jLabelContribuicaoSindical.getY() + jLabelContribuicaoSindical.getHeight() + 5);
        jTextFieldValorPasse.setLocation(jLabelValorPasse.getX(), jLabelValorPasse.getY() + jLabelValorPasse.getHeight() + 5);
        jTextFieldAuxilioAlmoco.setLocation(jLabelAuxilioAlmoco.getX(), jLabelAuxilioAlmoco.getY() + jLabelAuxilioAlmoco.getHeight() + 5);
        jTextFieldAuxilioEducacao.setLocation(jLabelAuxilioEducacao.getX(), jLabelAuxilioEducacao.getY() + jLabelAuxilioEducacao.getHeight() + 5);
        jTextFieldAuxilioSaude.setLocation(jLabelAuxilioSaude.getX(), jLabelAuxilioSaude.getY() + jLabelAuxilioSaude.getHeight() + 5);

        jComboBoxCargo.setLocation(jLabelCargo.getX(), jLabelCargo.getY() + jLabelCargo.getHeight() + 5);
        jScrollPane.setLocation(jLabelResultado.getX(), jLabelResultado.getY() + jLabelResultado.getHeight() + 5);

        jButtonProcessar.setLocation(jTextFieldAuxilioSaude.getX(), jTextFieldAuxilioSaude.getY() + jTextFieldAuxilioSaude.getHeight() + 20);
    }

    private void configurarJComboBox() {
        DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();
        modelo.addElement("Programador Júnior");
        modelo.addElement("Programador Pleno");
        modelo.addElement("Programador Sênior");
        jComboBoxCargo.setModel(modelo);
        jComboBoxCargo.setSelectedIndex(-1);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNome);
        jFrame.add(jLabelQuantidadeHoras);
        jFrame.add(jLabelValorINSS);
        jFrame.add(jLabelContribuicaoSindical);
        jFrame.add(jLabelValorPasse);
        jFrame.add(jLabelAuxilioAlmoco);
        jFrame.add(jLabelAuxilioEducacao);
        jFrame.add(jLabelAuxilioSaude);
        jFrame.add(jLabelResultado);
        jFrame.add(jLabelCargo);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldQuantidadeHoras);
        jFrame.add(jTextFieldValorINSS);
        jFrame.add(jTextFieldContribuicaoSindical);
        jFrame.add(jTextFieldValorPasse);
        jFrame.add(jTextFieldAuxilioAlmoco);
        jFrame.add(jTextFieldAuxilioEducacao);
        jFrame.add(jTextFieldAuxilioSaude);
        jFrame.add(jScrollPane);
        jFrame.add(jComboBoxCargo);
        jFrame.add(jButtonProcessar);
    }

    private void adicionarAcao() {
        jButtonProcessar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double horas = 0,valorINSS = 0,contribuicaoSindical = 0,
                        valorPasse = 0,auxilioAlmoco = 0,auxilioEducacao = 0,
                        auxilioSaude = 0;
                
                if (jTextFieldNome.getText().trim().isEmpty()) {
                    jTextAreaResultado.setText("Nome Não Preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }
                if (jComboBoxCargo.getSelectedIndex() == -1) {
                    jTextAreaResultado.setText("Cargo Não Escolhido");
                    jComboBoxCargo.showPopup();
                    return;
                }
                try {
                    if (jTextFieldQuantidadeHoras.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Quantidade Horas Não Preenchido");
                        jTextFieldQuantidadeHoras.requestFocus();
                        return;
                    }
                    horas = Double.parseDouble(jTextFieldQuantidadeHoras.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldQuantidadeHoras.requestFocus();return;
                }
                try {
                    if (jTextFieldValorINSS.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Valor INSS Não Preenchido");
                        jTextFieldValorINSS.requestFocus();
                        return;
                    }
                    valorINSS = Double.parseDouble(jTextFieldValorINSS.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldValorINSS.requestFocus();return;
                }
                try {
                    if (jTextFieldContribuicaoSindical.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Contribuição Sindical Não Preenchido");
                        jTextFieldContribuicaoSindical.requestFocus();
                        return;
                    }
                    contribuicaoSindical = Double.parseDouble(jTextFieldContribuicaoSindical.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldContribuicaoSindical.requestFocus();return;
                }
                try {
                    if (jTextFieldValorPasse.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Valor Passe Não Preenchido");
                        jTextFieldValorPasse.requestFocus();
                        return;
                    }
                    valorPasse = Double.parseDouble(jTextFieldValorPasse.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldValorPasse.requestFocus();return;
                }
                try {
                    if (jTextFieldAuxilioAlmoco.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Auxílio Almoço Não Preenchido");
                        jTextFieldAuxilioAlmoco.requestFocus();
                        return;
                    }
                    auxilioAlmoco = Double.parseDouble(jTextFieldAuxilioAlmoco.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldAuxilioAlmoco.requestFocus();return;
                }
                try {
                    if (jTextFieldAuxilioEducacao.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Auxílio Educação Não Preenchido");
                        jTextFieldAuxilioEducacao.requestFocus();
                        return;
                    }
                    auxilioEducacao = Double.parseDouble(jTextFieldAuxilioEducacao.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldAuxilioEducacao.requestFocus();return;
                }
                try {
                    if (jTextFieldAuxilioSaude.getText().trim().isEmpty()) {
                        jTextAreaResultado.setText("Auxílio Saúde Não Preenchido");
                        jTextFieldAuxilioSaude.requestFocus();
                        return;
                    }
                    auxilioSaude = Double.parseDouble(jTextFieldContribuicaoSindical.getText().trim());
                } catch (NumberFormatException ex) {
                    jTextAreaResultado.setText("Insira apenas valores neste campo");jTextFieldAuxilioSaude.requestFocus();return;
                }
                double cargoPorHora = 0;
                if (jComboBoxCargo.getSelectedIndex() == 0) {
                    cargoPorHora = 10.00;
                } else if (jComboBoxCargo.getSelectedIndex() == 1) {
                    cargoPorHora = 12.00;
                } else if (jComboBoxCargo.getSelectedIndex() == 2) {
                    cargoPorHora = 18.00;
                }
                double salarioPorHora = cargoPorHora*horas;
                double salario = salarioPorHora+valorINSS+valorPasse+contribuicaoSindical+auxilioAlmoco+auxilioEducacao+auxilioSaude;
                jTextAreaResultado.setText(
                        String.format("+R$%.2f/h", cargoPorHora) + "   -   " + jComboBoxCargo.getSelectedItem() + "\n"
                        + String.format("X %.1f", horas) + "   -   Quantidade de Horas \n"
                        + String.format("+R$%.2f", Double.parseDouble(jTextFieldValorINSS.getText().trim())) + "   -   Valor do INSS\n"
                        + String.format("+R$%.2f", Double.parseDouble(jTextFieldContribuicaoSindical.getText().trim())) + "   -   Contribuição Sindical\n"
                        + String.format("+R$%.2f", Double.parseDouble(jTextFieldAuxilioAlmoco.getText().trim())) + "   -   Auxílio Almoço\n"
                        + String.format("+R$%.2f", Double.parseDouble(jTextFieldAuxilioEducacao.getText().trim())) + "   -   Auxílio Educação\n"
                        + String.format("+R$%.2f", Double.parseDouble(jTextFieldAuxilioSaude.getText().trim())) + "   -   Auxílio Saúde\n"
                        + "__________________________\n"
                        + String.format("R$%.2f", salario)
                );
            }
        });
    }

}
