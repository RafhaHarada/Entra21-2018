
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExemploSistema00 {

    private JLabel labelNome;
    private JLabel labelItem;

    private JButton botaoCadastrar;
    private JButton botaoEditar;
    private JButton botaoApagar;

    private JTextField campoNome = new JTextField();

    private JComboBox caixaDeSelecaoItens = new JComboBox();

    public static void main(String[] args) {

        JFrame tela = new JFrame("Hover");
        tela.setSize(500, 140);
        tela.setLocationRelativeTo(null);
        tela.setLayout(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelNome = new JLabel("Nome");
        JLabel labelItem = new JLabel("Item");

        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoEditar = new JButton("Editar");
        JButton botaoApagar = new JButton("Apagar");

        JTextField campoNome = new JTextField();

        JComboBox caixaDeSelecaoItens = new JComboBox();

        labelNome.setSize(50, 20);
        labelItem.setSize(50, 20);
        botaoCadastrar.setSize(150, 30);
        botaoApagar.setSize(150, 30);
        botaoEditar.setSize(150, 30);
        campoNome.setSize(406, 20);
        caixaDeSelecaoItens.setSize(405, 20);

        labelNome.setLocation(10, 10);
        campoNome.setLocation(65, 10);
        botaoCadastrar.setLocation(10, 35);
        botaoApagar.setLocation(165, 35);
        botaoEditar.setLocation(320, 35);
        labelItem.setLocation(10, 70);
        caixaDeSelecaoItens.setLocation(65, 70);

        tela.add(labelNome);
        tela.add(labelItem);
        tela.add(botaoCadastrar);
        tela.add(botaoApagar);
        tela.add(botaoEditar);
        tela.add(campoNome);
        tela.add(caixaDeSelecaoItens);

        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });

        botaoEditar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                editar();
            }
        });

        tela.setVisible(true);

    }

    private void cadastrar() {
        String nome = campoNome.getText().trim();
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Informe um nome!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (nome.length() < 3) {
            JOptionPane.showMessageDialog(null, "Informe no mínimo 3 caracteres!");
            return;
        }
        caixaDeSelecaoItens.addItem(nome);
        campoNome.setText("");
        JOptionPane.showMessageDialog(null, nome + " cadastrado com sucesso");
    }

    private static void editar() {

    }

}
