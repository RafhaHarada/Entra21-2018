package Exercicio1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio1 {
    
    private JFrame jFrame;
    
    private JLabel jLabelNome,
            jLabelSobrenome,
            jLabelResultado;
    
    private JTextField jTextFieldNome,
            jTextFieldSobrenome;
    
    private JButton jButtonConcatenar;
    
    public Exercicio1(){
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);
        
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exercicio 1");
        jFrame.setSize(500,300);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instanciasComponentes(){
        jLabelNome = new JLabel("Nome");
        jLabelSobrenome = new JLabel("Sobrenome");
        jTextFieldNome = new JTextField();
        jTextFieldSobrenome = new JTextField();
        jButtonConcatenar = new JButton("Concatenar");
        jLabelResultado = new JLabel();
    }
    
    private void gerarDimensoes(){
        jTextFieldNome.setSize(200,25);
        jTextFieldSobrenome.setSize(200,25);
        jLabelNome.setSize(jTextFieldNome.getSize());
        jLabelSobrenome.setSize(jTextFieldSobrenome.getSize());
        jButtonConcatenar.setSize(200,50);
    }
    
    private void gerarLocalizacoes(){
        jLabelNome.setLocation(20,20);
        jLabelSobrenome.setLocation(jLabelNome.getWidth()+jLabelNome.getX()+50,jLabelNome.getY());
        jTextFieldNome.setLocation(jLabelNome.getX(),jLabelNome.getHeight()+jLabelNome.getY()+5);
        jTextFieldSobrenome.setLocation(jLabelSobrenome.getX(),jTextFieldNome.getY());
        int calculo = (jTextFieldSobrenome.getWidth()+jTextFieldSobrenome.getX())/2-(jButtonConcatenar.getWidth()/2);
        jButtonConcatenar.setLocation(calculo,jTextFieldSobrenome.getHeight()+jTextFieldSobrenome.getY()+5);
        
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelNome);
        jFrame.add(jLabelSobrenome);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldSobrenome);
        jFrame.add(jButtonConcatenar);
        jFrame.add(jLabelResultado);
    }
    
    private void adicionarAcao(){
        jButtonConcatenar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(jTextFieldNome.getText().trim().isEmpty()){
                    jLabelResultado.setText("Preencha o nome.");
                    jTextFieldNome.requestFocus();
                }
                else if(jTextFieldSobrenome.getText().trim().isEmpty()){
                    jLabelResultado.setText("Preencha o sobrenome.");
                    jTextFieldSobrenome.requestFocus();
                }
                else{
                    jLabelResultado.setText(
                            "Olá, " + 
                            jTextFieldNome.getText().trim() + " " +
                            jTextFieldSobrenome.getText().trim());
                }
                    jLabelResultado.setSize(jLabelResultado.getText().length()+200,25);
                    jLabelResultado.setLocation(jButtonConcatenar.getWidth(),jButtonConcatenar.getHeight()+jButtonConcatenar.getY()+5);
                
            }
        });
    }
    
}