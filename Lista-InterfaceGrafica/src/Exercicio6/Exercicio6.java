package Exercicio6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio6 {
    
    private JFrame jFrame;
    
    private JLabel jLabelNome,
            jLabelPeso,
            jLabelIdade,
            jLabelAltura,
            jLabelImc;
    
    private JTextField jTextFieldNome,
            jTextFieldPeso,
            jTextFieldIdade,
            jTextFieldAltura,
            jTextFieldImcResultado;
    
    private JButton jButtonIMC;
    
    public Exercicio6(){
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);
        
    }
    
    private void gerarTela(){
        jFrame = new JFrame("Exercicio 6");
        jFrame.setSize(550,370);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }
    
    private void instanciasComponentes(){
        jButtonIMC = new JButton("Gerar IMC");
        jLabelImc = new JLabel();
        jTextFieldImcResultado = new JTextField();
        jLabelImc.setIcon(new ImageIcon(getClass().getResource("/imagens/imc.png")));
        jLabelNome = new JLabel("Nome");
        jLabelPeso = new JLabel("Peso");
        jLabelIdade = new JLabel("Idade");
        jLabelAltura = new JLabel("Altura");
        jTextFieldNome = new JTextField();
        jTextFieldPeso = new JTextField();
        jTextFieldIdade = new JTextField();
        jTextFieldAltura = new JTextField();
    }
    
    private void gerarDimensoes(){
        jLabelImc.setSize(jLabelImc.getIcon().getIconWidth(), jLabelImc.getIcon().getIconHeight());
        jLabelNome.setSize(50, 25);
        jLabelPeso.setSize(50, 25);
        jLabelIdade.setSize(50, 25);
        jLabelAltura.setSize(50, 25);
        jTextFieldNome.setSize(100, 25);
        jTextFieldPeso.setSize(100, 25);
        jTextFieldIdade.setSize(100, 25);
        jTextFieldAltura.setSize(100, 25);
        jButtonIMC.setSize(jLabelNome.getWidth()+jTextFieldNome.getWidth()+10, 40);
        jTextFieldImcResultado.setSize(jButtonIMC.getWidth(), 25);
    }
    
    private void gerarLocalizacoes(){
        jLabelNome.setLocation(10, 10);
        jLabelIdade.setLocation(jLabelNome.getX(), jLabelNome.getY()+jLabelNome.getHeight()+20);
        jLabelPeso.setLocation(jLabelIdade.getX(), jLabelIdade.getY()+jLabelIdade.getHeight()+20);
        jLabelAltura.setLocation(jLabelPeso.getX(), jLabelPeso.getY()+jLabelPeso.getHeight()+20);
        jTextFieldNome.setLocation(jLabelNome.getX()+jLabelNome.getWidth()+5, jLabelNome.getY());
        jTextFieldIdade.setLocation(jLabelIdade.getX()+jLabelIdade.getWidth()+5, jLabelIdade.getY());
        jTextFieldPeso.setLocation(jLabelPeso.getX()+jLabelPeso.getWidth()+5, jLabelPeso.getY());
        jTextFieldAltura.setLocation(jLabelAltura.getX()+jLabelAltura.getWidth()+5, jLabelAltura.getY());
        jButtonIMC.setLocation(10,jLabelAltura.getY()+jLabelAltura.getHeight()+20);
        jLabelImc.setLocation(jTextFieldNome.getX()+jTextFieldNome.getWidth()+20,jTextFieldNome.getY());
        jTextFieldImcResultado.setLocation(10,jButtonIMC.getY()+jButtonIMC.getHeight()+20);
    }
    
    private void adicionarComponentes(){
        jFrame.add(jButtonIMC);
        jFrame.add(jLabelImc);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelPeso);
        jFrame.add(jLabelIdade);
        jFrame.add(jLabelAltura);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldPeso);
        jFrame.add(jTextFieldIdade);
        jFrame.add(jTextFieldAltura);
        jFrame.add(jTextFieldImcResultado);
    }
    
    private void adicionarAcao(){
        jButtonIMC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = jTextFieldNome.getText().trim();
                byte idade;
                double peso;
                double altura;
                try{
                    idade = Byte.parseByte(jTextFieldIdade.getText().trim());
                    peso = Double.parseDouble(jTextFieldPeso.getText().trim()
                            .replace(".", "").replace(",", "."));
                    altura = Double.parseDouble(jTextFieldAltura.getText().trim()
                            .replace(",", "."));
                }
                catch(NumberFormatException ex){
                    if(nome.isEmpty()){
                        jTextFieldImcResultado.setText("Digite um nome!");
                        return;
                    }
                    else if(jTextFieldIdade.getText().trim().isEmpty()){
                        jTextFieldImcResultado.setText("Digite um idade!");
                        return;
                    }
                    else if(jTextFieldPeso.getText().trim().isEmpty()){
                        jTextFieldImcResultado.setText("Digite um peso!");
                        return;
                    }
                    else if(jTextFieldAltura.getText().trim().isEmpty()){
                        jTextFieldImcResultado.setText("Digite um altura!");
                        return;
                    }
                    jTextFieldImcResultado.setText("Apenas números na idade,peso,altura!");
                    return;
                }
                double imc = 0;
                
                
                imc = peso/(altura*altura);
                
                jTextFieldImcResultado.setText(String.format("%.2f", imc));
            }
        });
    }
    
}
