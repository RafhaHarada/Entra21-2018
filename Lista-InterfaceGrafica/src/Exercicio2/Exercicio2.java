package Exercicio2;

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
public class Exercicio2 {
    
    private JFrame jFrame;
    
    private JLabel jLabelNumero;
    
    private JTextField jTextFieldNumero;
    
    private JButton jButtonTabuada;
    
    public Exercicio2(){
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);
        
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exercicio 2");
        jFrame.setSize(250,300);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instanciasComponentes(){
        jLabelNumero = new JLabel("Número");
        jTextFieldNumero = new JTextField();
        jButtonTabuada = new JButton("Gerar Tabuada");
    }
    
    private void gerarDimensoes(){
        jTextFieldNumero.setSize(200,25);
        jLabelNumero.setSize(jTextFieldNumero.getSize());
        jButtonTabuada.setSize(200,50);
    }
    
    private void gerarLocalizacoes(){
        jLabelNumero.setLocation(20,20);
        jTextFieldNumero.setLocation(jLabelNumero.getX(),jLabelNumero.getHeight()+jLabelNumero.getY()+5);
        jButtonTabuada.setLocation(jTextFieldNumero.getX(),jTextFieldNumero.getHeight()+jTextFieldNumero.getY()+5);
        
    }
    
    private void adicionarComponentes(){
        jFrame.add(jLabelNumero);
        jFrame.add(jTextFieldNumero);
        jFrame.add(jButtonTabuada);
    }
    
    private void adicionarAcao(){
        jButtonTabuada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String texto[] = new String[5];
                int numero;
                while(true){
                    try{
                        numero = Integer.parseInt(jTextFieldNumero.getText().trim());
                        break;
                    }
                    catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Você deve escrever apenas números inteiros no campo");
                        return;
                    }
                }
                primeiro: for (int j = 0; j < texto.length; j++) {
                    texto[j] = "";
                    for (int i = 20*j; i <= 20*(1+j); i++) {
                        texto[j] += i + " x " + numero + " = " + (numero*i) + "\n";
                        if(i == 50){
                            break primeiro;
                        }
                    }
                }
                String opcoes[] = {"De 0 a 20","De 20 a 40","De 40 a 50","Fechar"};
                int escolha = JOptionPane.showOptionDialog(null, "Escolha a opção", "Tabuada do "+jTextFieldNumero.getText(), 0, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
                if(escolha != 3){
                    JOptionPane.showMessageDialog(null, 
                            (escolha == 0 ? texto[0]:escolha == 1 ? texto[1]:
                            texto[2]));
                }
            }
        });
    }
    
}