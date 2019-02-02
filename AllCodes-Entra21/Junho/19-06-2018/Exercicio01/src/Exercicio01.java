
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Rafael Alipio Harada
 */
public class Exercicio01 {

    private JFrame tela;

    private JLabel jlNome,
            jlRaca,
            jlIdade,
            jlApelido,
            jlPreco,
            jlDescricao;

    private JTextField jtfNome,
            jtfIdade,
            jtfApelido,
            jtfPreco;

    private JTextArea jtaDescricao;

    private JComboBox jcobRaca;

    private JButton jbCancelar,
            jbSalvar;

    private JRadioButton jrbVivo,
            jrbMorto,
            jrbRacao,
            jrbAlmocoJanta;

    private JCheckBox jchbAdestrado,
            jchbVacinado,
            jchbCastrado,
            jchbPedigree;
    
    private ButtonGroup buttonGroupVida, buttonGroupComida;

    public Exercicio01() {
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarAcoes();
        estilizacaoComponentes();
        adicionarItensComboBox();
        adicionarRadioParaButtonGroup();
        tela.setVisible(true);
    }

    private void gerarTela() {
        tela = new JFrame("Cadastro Animal");
        tela.setSize(655, 450);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setResizable(false);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void instanciarComponentes() {
        jlNome = new JLabel("Nome");
        jlRaca = new JLabel("Raça");
        jlIdade = new JLabel("Idade");
        jlApelido = new JLabel("Apelido");
        jlPreco = new JLabel("Preço");
        jlDescricao = new JLabel("Descrição");

        jtfNome = new JTextField();
        jtfIdade = new JTextField();
        jtfApelido = new JTextField();
        jtfPreco = new JTextField();

        jtaDescricao = new JTextArea();

        jcobRaca = new JComboBox();

        jbCancelar = new JButton("Cancelar");
        jbSalvar = new JButton("Salvar");

        jrbVivo = new JRadioButton("Vivo");
        jrbMorto = new JRadioButton("Morto");
        jrbRacao = new JRadioButton("Ração");
        jrbAlmocoJanta = new JRadioButton("Come almoços, jantas");

        jchbAdestrado = new JCheckBox("Adestrado");
        jchbVacinado = new JCheckBox("Vacinado");
        jchbCastrado = new JCheckBox("Castrado");
        jchbPedigree = new JCheckBox("Tem pedigree");
        
        buttonGroupComida = new ButtonGroup();
        buttonGroupVida = new ButtonGroup();
    }

    private void adicionarComponentes() {
        tela.add(jlNome);
        tela.add(jlRaca);
        tela.add(jlIdade);
        tela.add(jlApelido);
        tela.add(jlPreco);
        tela.add(jlDescricao);

        tela.add(jtfNome);
        tela.add(jtfIdade);
        tela.add(jtfApelido);
        tela.add(jtfPreco);

        tela.add(jtaDescricao);

        tela.add(jcobRaca);

        tela.add(jbCancelar);
        tela.add(jbSalvar);

        tela.add(jrbVivo);
        tela.add(jrbMorto);
        tela.add(jrbRacao);
        tela.add(jrbAlmocoJanta);

        tela.add(jchbAdestrado);
        tela.add(jchbVacinado);
        tela.add(jchbCastrado);
        tela.add(jchbPedigree);
    }

    private void gerarDimensoes() {
        jlNome.setSize(370, 25);
        jlRaca.setSize(160, 25);
        jlIdade.setSize(215, 25);
        jlApelido.setSize(180, 25);
        jlPreco.setSize(215, 25);
        jlDescricao.setSize(630, 25);

        jtfNome.setSize(370, 25);
        jtfIdade.setSize(215, 25);
        jtfApelido.setSize(180, 25);
        jtfPreco.setSize(215, 25);

        jtaDescricao.setSize(630, 100);

        jcobRaca.setSize(160, 25);

        jbCancelar.setSize(145, 75);
        jbSalvar.setSize(145, 75);

        jrbVivo.setSize(100, 25);
        jrbMorto.setSize(100, 25);
        jrbRacao.setSize(100, 25);
        jrbAlmocoJanta.setSize(160, 25);

        jchbAdestrado.setSize(130, 25);
        jchbVacinado.setSize(130, 25);
        jchbCastrado.setSize(130, 25);
        jchbPedigree.setSize(130, 25);
    }

    private void gerarLocalizacoes() {
        jlNome.setLocation(10, 5);
        jlRaca.setLocation(10, 65);
        jlIdade.setLocation(425, 5);
        jlApelido.setLocation(200, 65);
        jlPreco.setLocation(425, 65);
        jlDescricao.setLocation(10, 190);

        jtfNome.setLocation(10, 30);
        jtfIdade.setLocation(425, 30);
        jtfApelido.setLocation(200, 90);
        jtfPreco.setLocation(425, 90);

        jtaDescricao.setLocation(10, 220);

        jcobRaca.setLocation(10, 90);

        jbCancelar.setLocation(340, 335);
        jbSalvar.setLocation(495, 335);

        jrbVivo.setLocation(10, 130);
        jrbMorto.setLocation(10, 160);
        jrbRacao.setLocation(115, 130);
        jrbAlmocoJanta.setLocation(115, 160);

        jchbAdestrado.setLocation(355, 130);
        jchbVacinado.setLocation(355, 160);
        jchbCastrado.setLocation(485, 130);
        jchbPedigree.setLocation(485, 160);
    }

    private void adicionarAcoes() {
        jbCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jcobRaca.setSelectedIndex(-1);
                buttonGroupComida.clearSelection();
                buttonGroupVida.clearSelection();
                jtfApelido.setText("");
                jtfIdade.setText("");
                jtfNome.setText("");
                jtfPreco.setText("");
                jtaDescricao.setText("");
                jchbAdestrado.setSelected(false);
                jchbCastrado.setSelected(false);
                jchbPedigree.setSelected(false);
                jchbVacinado.setSelected(false);
            }
        });
    }

    private void estilizacaoComponentes() {
        //tela.getContentPane().setBackground(Color.lightGray);
        jtaDescricao.setBorder(new LineBorder(Color.LIGHT_GRAY));

    }

    private void adicionarItensComboBox() {
        DefaultComboBoxModel caes = new DefaultComboBoxModel(
                new Object[]{
                    "Pastor-de-shetland", 
                    "Airedale terrier", 
                    "Pastor alemão", 
                    "Buldogue inglês", 
                    "Bull terrier", 
                    "Basset", 
                    "Boxer", 
                    "Dachshund", 
                    "Pug", 
                    "São Bernardo"
                }
        );
        jcobRaca.setModel(caes);
        jcobRaca.setSelectedIndex(-1);
    }
    
    private void adicionarRadioParaButtonGroup(){
        buttonGroupVida.add(jrbVivo);
        buttonGroupVida.add(jrbMorto);
        buttonGroupComida.add(jrbAlmocoJanta);
        buttonGroupComida.add(jrbRacao);
    }

}
