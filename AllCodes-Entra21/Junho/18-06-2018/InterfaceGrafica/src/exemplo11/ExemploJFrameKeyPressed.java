package exemplo11;

import exemplo08.JFrameBaseInteface;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Alunos
 */
public class ExemploJFrameKeyPressed implements JFrameBaseInteface{
    
    private JFrame jFrame;
    private JTextField jTextFieldNumero;
    
    
    public ExemploJFrameKeyPressed(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        adicionarKeyPressed();
        jFrame.setVisible(true);
    }
    @Override
    public void gerarTela() {
        jFrame = new JFrame("JFrameKeyPressed");
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setSize(600, 500);
        jFrame.setLocationRelativeTo(null);
    }

    @Override
    public void adicionarComponentes() {
       jFrame.add(jTextFieldNumero);
    }

    @Override
    public void instanciarComponentes() {
        jTextFieldNumero = new JTextField();
    }

    @Override
    public void gerarLocalizacoes() {
        jTextFieldNumero.setLocation(10, 10);
    }

    @Override
    public void gerarDimensoes() {
        jTextFieldNumero.setSize(100, 20);
    }
    public void adicionarKeyPressed(){
        jTextFieldNumero.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode()){
                    case KeyEvent.VK_ENTER :
                        JOptionPane.showMessageDialog(null, "Viva");
                    break;
                    case KeyEvent.VK_UP :
                        //JOptionPane.showMessageDialog(null, "Cima");
                        jTextFieldNumero.setLocation(jTextFieldNumero.getX(), jTextFieldNumero.getY()-5);
                    break;
                    case KeyEvent.VK_DOWN :
                        //JOptionPane.showMessageDialog(null, "Baixo");
                        jTextFieldNumero.setLocation(jTextFieldNumero.getX(), jTextFieldNumero.getY()+5);
                    break;
                    case KeyEvent.VK_RIGHT :
                        //JOptionPane.showMessageDialog(null, "Direita");
                        jTextFieldNumero.setLocation(jTextFieldNumero.getX()+5, jTextFieldNumero.getY());

                    break;
                    case KeyEvent.VK_LEFT :
                        //JOptionPane.showMessageDialog(null, "Esquerda");
                        jTextFieldNumero.setLocation(jTextFieldNumero.getX()-5, jTextFieldNumero.getY());
                    break;
                    case KeyEvent.VK_F10 :
                        jTextFieldNumero.setSelectedTextColor(Color.red);
                        jTextFieldNumero.setSelectionStart(0);
                        jTextFieldNumero.setSelectionEnd(
                                jTextFieldNumero.getText().length());
                    break;
                    case KeyEvent.VK_F11 :
                        jTextFieldNumero.setCaretPosition(0);
                        /*jTextFieldNumero.setCaretPosition(
                                jTextFieldNumero.getText().length());*/
                        //jTextFieldNumero.setCaretPosition(0);
                    break;
                    case KeyEvent.VK_F12 :
                        jTextFieldNumero.setCaretPosition(
                                jTextFieldNumero.getText().length());
                    break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
}
