package exemplo07;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

/**
 *
 * @author Rafael Alipio Harada
 */
public class ExemploJRadioButton01 {
    
    private JFrame jFrame;
    private JLabel jLabel;
    private JLabel jLabelCor;
    private JRadioButton 
            jRadioButtonCorPreto,
            jRadioButtonCorBranco,
            jRadioButtonCorFuschia,
            jRadioButtonCorRose;
    private ButtonGroup buttonGroupCor;
    private JButton jButtonSalvar, jButtonLimparSelecao;
    
    public ExemploJRadioButton01(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        definirRadioParaButtonGroup();
        adicionarAcao();
        estilizarRadioButton();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void instanciarComponentes() {
        jLabelCor = new JLabel("COR");
        jRadioButtonCorBranco = new JRadioButton();
        jRadioButtonCorBranco.setText("Branco");
        jRadioButtonCorFuschia = new JRadioButton();
        jRadioButtonCorFuschia.setText("Fuschia");
        jRadioButtonCorPreto = new JRadioButton("Preto");
        jRadioButtonCorRose = new JRadioButton("Rose");
        buttonGroupCor = new ButtonGroup();
        jButtonSalvar = new JButton("Salvar");
        jButtonLimparSelecao = new JButton("Limpar");
    }
    
    private void definirRadioParaButtonGroup(){
        buttonGroupCor.add(jRadioButtonCorPreto);
        buttonGroupCor.add(jRadioButtonCorBranco);
        buttonGroupCor.add(jRadioButtonCorFuschia);
        buttonGroupCor.add(jRadioButtonCorRose);
    }

    private void gerarDimensoes() {
        jLabelCor.setSize(40, 20);
        jRadioButtonCorPreto.setSize(100, 20);
        jRadioButtonCorBranco.setSize(100, 20);
        jRadioButtonCorFuschia.setSize(100, 20);
        jRadioButtonCorRose.setSize(100, 20);
        jButtonSalvar.setSize(120, 20);
        jButtonLimparSelecao.setSize(120, 20);
    }

    private void gerarLocalizacoes() {
        jLabelCor.setLocation(10, 10);
        jRadioButtonCorRose.setLocation(10, 35);
        jRadioButtonCorPreto.setLocation(10, 60);
        jRadioButtonCorFuschia.setLocation(10, 85);
        jRadioButtonCorBranco.setLocation(10, 110);
        jButtonLimparSelecao.setLocation(10, 135);
        jButtonSalvar.setLocation(135, 135);
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelCor);
        jFrame.add(jRadioButtonCorPreto);
        jFrame.add(jRadioButtonCorBranco);
        jFrame.add(jRadioButtonCorFuschia);
        jFrame.add(jRadioButtonCorRose);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonLimparSelecao);
    }
    
    private void adicionarAcao(){
        jButtonLimparSelecao.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                buttonGroupCor.clearSelection();
                definirCorDeTexto("#000000");
                jFrame.getContentPane().setBackground(
                        UIManager.getColor("Frame.background")
                );
            }
        });
        jButtonSalvar.addActionListener(
        new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(jRadioButtonCorBranco.isSelected()){
                    jFrame.getContentPane().setBackground(Color.white);
                    definirCorDeTexto("#000000");
                }else if(jRadioButtonCorFuschia.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#FF00FF"));
                    definirCorDeTexto("#000000");
                }else if(jRadioButtonCorPreto.isSelected()){
                    jFrame.getContentPane().setBackground(Color.black);
                    definirCorDeTexto("#FFFFFF");
                }else if(jRadioButtonCorRose.isSelected()){
                    jFrame.getContentPane().setBackground(Color.decode("#FF009D"));
                    definirCorDeTexto("#FFFFFF");
                }
            }
        });
    }
    
    private void definirCorDeTexto(String cor){
        jLabelCor.setForeground(Color.decode(cor));
        jRadioButtonCorBranco.setForeground(Color.decode(cor));
        jRadioButtonCorFuschia.setForeground(Color.decode(cor));
        jRadioButtonCorPreto.setForeground(Color.decode(cor));
        jRadioButtonCorRose.setForeground(Color.decode(cor));
    }
    
    private void estilizarRadioButton(){
        jRadioButtonCorBranco.setContentAreaFilled(false);
        jRadioButtonCorFuschia.setContentAreaFilled(false);
        jRadioButtonCorPreto.setContentAreaFilled(false);
        jRadioButtonCorRose.setContentAreaFilled(false);
    }
}
