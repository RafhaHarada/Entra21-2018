package Exercicio8;

import java.awt.Color;
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
public class Exercicio8 {

    private JFrame jFrame;

    private JLabel jLabelNota1,
            jLabelNota2,
            jLabelNota3,
            jLabelNota4,
            jLabelMedia,
            jLabelMediaResultado;

    private JTextField jTextFieldNota1,
            jTextFieldNota2,
            jTextFieldNota3,
            jTextFieldNota4;

    private JButton jButtonCalcularMedia;
    
    private double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0, media = 0;

    public Exercicio8() {
        gerarTela();
        instanciasComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        adicionarAcao();
        jFrame.setVisible(true);

    }

    private void gerarTela() {
        jFrame = new JFrame("Exercicio 08");
        jFrame.setSize(275, 200);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    private void instanciasComponentes() {
        jLabelNota1 = new JLabel("1ª Nota");
        jLabelNota2 = new JLabel("2ª Nota");
        jLabelNota3 = new JLabel("3ª Nota");
        jLabelNota4 = new JLabel("4ª Nota");
        jLabelMedia = new JLabel("Media");
        jTextFieldNota1 = new JTextField();
        jTextFieldNota2 = new JTextField();
        jTextFieldNota3 = new JTextField();
        jTextFieldNota4 = new JTextField();
        jLabelMediaResultado = new JLabel("");
        jButtonCalcularMedia = new JButton("Calcular");
    }

    private void gerarDimensoes() {
        jLabelNota1.setSize(50, 25);
        jLabelNota2.setSize(50, 25);
        jLabelNota3.setSize(50, 25);
        jLabelNota4.setSize(50, 25);
        jLabelMedia.setSize(50, 25);
        jTextFieldNota1.setSize(50, 25);
        jTextFieldNota2.setSize(50, 25);
        jTextFieldNota3.setSize(50, 25);
        jTextFieldNota4.setSize(50, 25);
        jLabelMediaResultado.setSize(80, 25);
        jButtonCalcularMedia.setSize(105, 50);
    }

    private void gerarLocalizacoes() {
        jLabelNota1.setLocation(20, 20);
        jTextFieldNota1.setLocation(jLabelNota1.getX()+jLabelNota1.getWidth()+5, jLabelNota1.getY());
        jLabelNota2.setLocation(jTextFieldNota1.getX()+jTextFieldNota1.getWidth()+20, jTextFieldNota1.getY());
        jTextFieldNota2.setLocation(jLabelNota2.getX()+jLabelNota2.getWidth()+5, jLabelNota2.getY());
        
        jLabelNota3.setLocation(jLabelNota1.getX(), jLabelNota1.getY()+jLabelNota1.getHeight()+10);
        jTextFieldNota3.setLocation(jLabelNota3.getX()+jLabelNota3.getWidth()+5, jLabelNota3.getY());
        jLabelNota4.setLocation(jTextFieldNota3.getX()+jTextFieldNota3.getWidth()+20, jTextFieldNota3.getY());
        jTextFieldNota4.setLocation(jLabelNota4.getX()+jLabelNota4.getWidth()+5, jLabelNota4.getY());
        
        jLabelMedia.setLocation(jLabelNota3.getX(), jLabelNota3.getY()+jLabelNota3.getHeight()+20);
        jLabelMediaResultado.setLocation(jLabelMedia.getX(), jLabelMedia.getY()+jLabelMedia.getHeight()+5);
        jButtonCalcularMedia.setLocation(jLabelNota4.getX(), jLabelMedia.getY());
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelNota1);
        jFrame.add(jLabelNota2);
        jFrame.add(jLabelNota3);
        jFrame.add(jLabelNota4);
        jFrame.add(jLabelMedia);
        jFrame.add(jTextFieldNota1);
        jFrame.add(jTextFieldNota2);
        jFrame.add(jTextFieldNota3);
        jFrame.add(jTextFieldNota4);
        jFrame.add(jLabelMediaResultado);
        jFrame.add(jButtonCalcularMedia);
    }

    private void adicionarAcao() {

        jButtonCalcularMedia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    nota1 = Double.parseDouble(jTextFieldNota1.getText().trim());
                    nota2 = Double.parseDouble(jTextFieldNota2.getText().trim());
                    nota3 = Double.parseDouble(jTextFieldNota3.getText().trim());
                    nota4 = Double.parseDouble(jTextFieldNota4.getText().trim());
                    media = (nota1 + nota2 + nota3 + nota4) / 4;
                    jLabelMediaResultado.setText(String.valueOf(media));
                    jLabelMediaResultado.setForeground(
                            media < 5 ? Color.red
                            : media < 7 ? Color.orange
                            : Color.green
                    );
                } catch (NumberFormatException ex) {
                    jLabelMediaResultado.setText("Nota Inválida!");
                    jLabelMediaResultado.setForeground(Color.darkGray);
                    return;
                }
            }
        });
    }

}
