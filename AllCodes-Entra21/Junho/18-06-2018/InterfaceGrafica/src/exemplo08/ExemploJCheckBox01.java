package exemplo08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Alipio Harada
 */
public class ExemploJCheckBox01 implements JFrameBaseInteface{
    
    private JFrame jFrame;
    private JCheckBox jCheckBoxEuAceitoOsTermos,
            jCheckBoxEuLiOsTermos;
    private JButton jButtonSalvar, jButtonLimpar;
    
    public ExemploJCheckBox01(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarAcoes();
        jFrame.setVisible(true);
    }

    public void gerarTela() {
        jFrame = new JFrame("Exemplo JCheckBox01");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }

    public void adicionarComponentes() {
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonLimpar);
        jFrame.add(jCheckBoxEuAceitoOsTermos);
        jFrame.add(jCheckBoxEuLiOsTermos);
    }

    public void instanciarComponentes() {
        jButtonLimpar = new JButton("Limpar");
        jButtonSalvar = new JButton("Salvar");
        jCheckBoxEuAceitoOsTermos = new JCheckBox("Eu aceito os termos");
        jCheckBoxEuLiOsTermos = new JCheckBox("Eu li os termos");
    }

    public void gerarLocalizacoes() {
        jCheckBoxEuAceitoOsTermos.setLocation(10, 35);
        jCheckBoxEuLiOsTermos.setLocation(10, 10);
        jButtonSalvar.setLocation(10, 60);
        jButtonLimpar.setLocation(115, 60);
    }

    public void gerarDimensoes() {
        jCheckBoxEuAceitoOsTermos.setSize(250, 20);
        jCheckBoxEuLiOsTermos.setSize(250, 20);
        jButtonSalvar.setSize(100, 20);
        jButtonLimpar.setSize(100, 20);
    }
    
    public void adicionarAcoes(){
        jButtonLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jCheckBoxEuAceitoOsTermos.setSelected(false);
                jCheckBoxEuLiOsTermos.setSelected(false);
                
            }
        });
        jButtonSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(!jCheckBoxEuLiOsTermos.isSelected()){
                    JOptionPane.showMessageDialog(null, "Leia os termos", "Ops...", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if(!jCheckBoxEuAceitoOsTermos.isSelected()){
                    JOptionPane.showMessageDialog(null, "Aceite os termos", "Ops...", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
        });
    }
    
}
