package Exercicio9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio9 {

    private JFrame jFrame, jFrame1;
    private JLabel jLabelAno,jLabel;
    private JTextField jTextFieldAno;
    private JButton jButtonEscreverPorExtenso;
    private JTextArea jTextAreaEscrita;
    private JScrollPane jScrollPane;
    

    public Exercicio9() {
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);

    }

    private void gerarTela() {
        jFrame = new JFrame("Exercicio 09");
        jFrame.setSize(350, 200);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        
        jFrame1 = new JFrame("Exercicio 09");
        jFrame1.setSize(325, 270);
        jFrame1.setLayout(null);
        jFrame1.setResizable(false);
        jFrame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame1.setLocationRelativeTo(null);
    }

    private void instanciasComponentes() {
        jLabelAno = new JLabel("Ano");
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(getClass().getResource("/imagens/maisDeOitoMil.gif")));
        jTextFieldAno = new JTextField();
        jButtonEscreverPorExtenso = new JButton("Escrever por extenso");
        jTextAreaEscrita = new JTextArea();
        jTextAreaEscrita.setLineWrap(true);
        jScrollPane = new JScrollPane(jTextAreaEscrita);
    }

    private void gerarDimensoes() {
        jLabelAno.setSize(100, 25);
        jLabel.setSize(jLabel.getIcon().getIconWidth(),jLabel.getIcon().getIconHeight());
        jTextFieldAno.setSize(jLabelAno.getSize());
        jButtonEscreverPorExtenso.setSize(jLabelAno.getWidth()*2, jLabelAno.getHeight()+jTextFieldAno.getHeight()+10);
        jScrollPane.setSize(jLabelAno.getWidth()+jButtonEscreverPorExtenso.getWidth()+ 10, jLabelAno.getHeight()+20);
    }

    private void gerarLocalizacoes() {
        jLabelAno.setLocation(20, 20);
        jLabel.setLocation(0, 0);
        jTextFieldAno.setLocation(jLabelAno.getX(), jLabelAno.getY() + jLabelAno.getHeight() + 10);
        jButtonEscreverPorExtenso.setLocation(jLabelAno.getX() + jLabelAno.getWidth()+ 10, jLabelAno.getY());
        jScrollPane.setLocation(jTextFieldAno.getX(), jTextFieldAno.getY() + jTextFieldAno.getHeight() + 10);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelAno);
        jFrame.add(jTextFieldAno);
        jFrame.add(jButtonEscreverPorExtenso);
        jFrame.add(jScrollPane);
        jFrame1.add(jLabel);
    }

    private void adicionarAcao() {
        jButtonEscreverPorExtenso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String ano = "";
                try {
                    ano = jTextFieldAno.getText();
                    int verificacao = Integer.parseInt(ano);
                    if(Integer.parseInt(ano) < 0){
                        jTextAreaEscrita.setText("Não calculamos antes de Cristo!");
                        return;
                    }
                    if (ano.length() > 4 || ano.length() < 4) {
                        jTextAreaEscrita.setText("Insira apenas 4 caracteres!");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    jTextAreaEscrita.setText("Insira apenas números");
                    return;
                }
                if(Integer.parseInt(ano)> 8000){
                    jFrame1.setVisible(true);
                }
                jTextAreaEscrita.setText(
                        //Milhar
                        (ano.charAt(0) == '1' ? "Mil"
                        : ano.charAt(0) == '2' ? "Dois Mil"
                        : ano.charAt(0) == '3' ? "Três Mil"
                        : ano.charAt(0) == '4' ? "Quatro Mil"
                        : ano.charAt(0) == '5' ? "Cinco Mil"
                        : ano.charAt(0) == '6' ? "Seis Mil"
                        : ano.charAt(0) == '7' ? "Sete Mil"
                        : ano.charAt(0) == '8' ? "Oito Mil"
                        : ano.charAt(0) == '9' ? "Nove Mil"
                        : "") +
                                
                        (Integer.parseInt(ano) > 999 && (ano.charAt(1) != '0' && ano.charAt(2) != '0' || ano.charAt(3) != '0')?
                        ", "
                        : Integer.parseInt(ano) > 999 && ano.charAt(1) != '0' && ano.charAt(2) == '0' && ano.charAt(3) == '0'? 
                        " e "
                        :"") +
                                
                        //Centena
                        (ano.charAt(1) == '1' && ano.charAt(2) == '0' && ano.charAt(3) == '0'?
                        "Cem" : ano.charAt(1) == '1' ? "Cento"
                        : ano.charAt(1) == '2' ? "Duzentos"
                        : ano.charAt(1) == '3' ? "Trezentos"
                        : ano.charAt(1) == '4' ? "Quatrocentos"
                        : ano.charAt(1) == '5' ? "Quinhentos"
                        : ano.charAt(1) == '6' ? "Seiscentos"
                        : ano.charAt(1) == '7' ? "Setecentos"
                        : ano.charAt(1) == '8' ? "Oitocentos"
                        : ano.charAt(1) == '9' ? "Novecentos"
                        : "") +
                                
                        (Integer.parseInt(ano) > 100 && ano.charAt(2) != '0'?
                        " e ": "") +
                                
                        //Dezena
                        (Integer.parseInt(ano) > 9 && ano.charAt(2) == '1'?
                        (ano.charAt(3) == '0' ? "Dez"
                        : ano.charAt(3) == '1' ? "Onze"
                        : ano.charAt(3) == '2' ? "Doze"
                        : ano.charAt(3) == '3' ? "Treze"
                        : ano.charAt(3) == '4' ? "Quatorze"
                        : ano.charAt(3) == '5' ? "Quinze"
                        : ano.charAt(3) == '6' ? "Dezesseis"
                        : ano.charAt(3) == '7' ? "Dezessete"
                        : ano.charAt(3) == '8' ? "Dezoito"
                        : ano.charAt(3) == '9' ? "Dezenove"
                        : "") :
                        (ano.charAt(2) == '2' ? "Vinte"
                        : ano.charAt(2) == '3' ? "Trinta"
                        : ano.charAt(2) == '4' ? "Quarenta"
                        : ano.charAt(2) == '5' ? "Cinquenta"
                        : ano.charAt(2) == '6' ? "Sessenta"
                        : ano.charAt(2) == '7' ? "Setenta"
                        : ano.charAt(2) == '8' ? "Oitenta"
                        : ano.charAt(2) == '9' ? "Noventa"
                        : "")) +
                                
                        (Integer.parseInt(ano) > 9 && ano.charAt(2) != '1' && ano.charAt(3) != '0'?
                        " e " : "" ) + 

                        //Unidade
                        (ano.charAt(2) != '1' ?
                        (ano.charAt(3) == '1' ? "Um"
                        : ano.charAt(3) == '2' ? "Dois"
                        : ano.charAt(3) == '3' ? "Três"
                        : ano.charAt(3) == '4' ? "Quatro"
                        : ano.charAt(3) == '5' ? "Cinco"
                        : ano.charAt(3) == '6' ? "Seis"
                        : ano.charAt(3) == '7' ? "Sete"
                        : ano.charAt(3) == '8' ? "Oito"
                        : ano.charAt(3) == '9' ? "Nove"
                        : ""): "")
                );
            }
        });
    }

}
