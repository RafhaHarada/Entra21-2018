package exemplo06;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Rafael Alipio Harada
 */
public class ExemploJTextArea01 {
    
    private JFrame jFrame;
    private JTextArea jTextArea;
    private JLabel jLabelDescricao;
    private JScrollPane jScrollPane;
    private JScrollPane jScrollPane2;
    
    public ExemploJTextArea01(){
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurarJScrollPane();
        jFrame.setVisible(true);
        
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exemplo JTextArea");
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instanciasComponentes(){
        jScrollPane = new JScrollPane();
        jScrollPane2 = new JScrollPane();
        jTextArea = new JTextArea();
        jLabelDescricao = new JLabel("Descricao");
    }
    
    private void gerarDimensoes(){
        jLabelDescricao.setSize(70,20);
        jScrollPane.setSize(450,410);
        jScrollPane2.setSize(200,10);
    }
    
    private void gerarLocalizacoes(){
        jLabelDescricao.setLocation(10, 10);
        jScrollPane.setLocation(10, 35);
        jScrollPane2.setLocation(35, 35);
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelDescricao);
        jFrame.add(jScrollPane);
        jFrame.add(jScrollPane2);
    }
    
    private void configurarJScrollPane(){
        jScrollPane.setViewportView(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jTextArea.setLineWrap(true);
    }
    
}
