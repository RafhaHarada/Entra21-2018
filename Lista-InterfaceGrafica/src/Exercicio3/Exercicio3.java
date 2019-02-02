package Exercicio3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio3 {
    
    private JFrame jFrame;
    
    private JLabel jLabelNumero;
    
    private JTextField jTextFieldNumero;
    
    private JButton jButtonTabuada;
    private JTextArea jTextAreaTabuada;
    private JScrollPane jScrollPaneTabuada;
    private JLabel jLabelTabuada;
    
    public Exercicio3(){
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        configurandoTabela();
        adicionarAcao();
        jFrame.setVisible(true);
        
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exercicio 3");
        jFrame.setSize(250,500);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instanciasComponentes(){
        jLabelNumero = new JLabel("Número");
        jLabelTabuada = new JLabel("Tabuada");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Gerar Tabuada");
        jTextAreaTabuada = new JTextArea();
        jScrollPaneTabuada = new JScrollPane(jTextAreaTabuada);
    }
    
    private void gerarDimensoes(){
        jTextFieldNumero.setSize(200,25);
        jLabelNumero.setSize(jTextFieldNumero.getSize());
        jButtonTabuada.setSize(200,50);
        jScrollPaneTabuada.setSize(200,280);
        jLabelTabuada.setSize(jScrollPaneTabuada.getWidth(),25);
    }
    
    private void gerarLocalizacoes(){
        jLabelNumero.setLocation(20,20);
        jTextFieldNumero.setLocation(jLabelNumero.getX(),jLabelNumero.getHeight()+jLabelNumero.getY()+5);
        jButtonTabuada.setLocation(jTextFieldNumero.getX(),jTextFieldNumero.getHeight()+jTextFieldNumero.getY()+5);
        jLabelTabuada.setLocation(jButtonTabuada.getX(), jButtonTabuada.getHeight()+ jButtonTabuada.getY()+5);
        jScrollPaneTabuada.setLocation(jLabelTabuada.getX(), jLabelTabuada.getHeight()+ jLabelTabuada.getY()+5);
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
        jFrame.add(jLabelTabuada);
        jFrame.add(jScrollPaneTabuada);
    }
    
    private void configurandoTabela(){
        jScrollPaneTabuada.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPaneTabuada.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jTextAreaTabuada.setLineWrap(true);
        jTextAreaTabuada.setEditable(false);
    }
    
    private void adicionarAcao(){
        jButtonTabuada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero;
                JTextField padrao = new JTextField();
                while(true){
                    try{
                        numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                        jTextFieldNumero.setBorder(padrao.getBorder());
                        break;
                    }
                    catch(NumberFormatException ex){
                        if(jTextFieldNumero.getText().trim().isEmpty()){
                            jTextAreaTabuada.setText("Para gerar a tabuada, digite um número acima.");
                        }
                        else{
                            jTextAreaTabuada.setText("Você deve escrever apenas\nnúmeros inteiros no campo");
                        }
                        jTextFieldNumero.setBorder(new LineBorder(Color.red,1));
                        jTextFieldNumero.requestFocus();
                        return;
                    }
                }
                String texto = "";
                for (int i = 0; i <= 50; i++) {
                    texto += i + " x " + numero + " = " + (numero*i);
                    if(i != 50){
                        texto += "\n";
                    }
                    if(i %10 == 0 && i != 0 && i != 50){
                        texto += "\n";
                    }
                }
                jTextAreaTabuada.setText(texto);
            }
        });
    }
    
}