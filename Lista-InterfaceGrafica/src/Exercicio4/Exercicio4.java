package Exercicio4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio4 {
    
    private JFrame jFrame;
    
    private JLabel jLabelNumero;
    
    private JTextField jTextFieldNumero;
    
    private JButton jButtonVerificar;
    
    public Exercicio4(){
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);
        
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exercicio 4");
        jFrame.setSize(250,300);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instanciasComponentes(){
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonVerificar = new JButton("Verificar");
    }
    
    private void gerarDimensoes(){
        jTextFieldNumero.setSize(200,25);
        jLabelNumero.setSize(jTextFieldNumero.getSize());
        jButtonVerificar.setSize(200,50);
    }
    
    private void gerarLocalizacoes(){
        jLabelNumero.setLocation(20,20);
        jTextFieldNumero.setLocation(jLabelNumero.getX(),jLabelNumero.getHeight()+jLabelNumero.getY()+5);
        jButtonVerificar.setLocation(jTextFieldNumero.getX(),jTextFieldNumero.getHeight()+jTextFieldNumero.getY()+5);
        
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonVerificar);
    }
    
    private void adicionarAcao(){
        jButtonVerificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int numero;
                try{
                    numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Você deve escrever apenas números inteiros no campo");
                    return;
                }
                JOptionPane.showMessageDialog(null,
                        (numero == 0 ? "Seu número é 0."
                                + "\nEle não é par nem ímpar.":
                                
                        numero %2 == 0 ? "O número " + numero + " é par e ":
                        "O número " + numero + " é ímpar e ") +
                                
                        (numero == 0 ? "\nE ele é neutro.":
                        numero > 0 ? "positivo.":
                        "negativo.")                        
                        );
            }
        });
    }
    
}