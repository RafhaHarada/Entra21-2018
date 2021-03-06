package view;

import bean.ClienteBean;
import dao.ClienteDAO;
import interfaces.BaseGUInterface;
import java.util.ArrayList;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

/**
 * @author Henrique Silva / Rafael Alipio Harada
 */
public class ClienteListaCadastro implements BaseGUInterface {

    private int linhaSelecionada = -1;
    private JFrame jFrame;
    private JLabel jLabelID, jLabelNome, jLabelData, jLabelCPF;
    private JTextField jTextFieldID, jTextFieldNome;
    private JButton jButtonSalvar, jButtonExcluir, jButtonEditar;
    private JRadioButton jRadioButtonAtivo, jRadioButtonInativo;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private DefaultTableModel dtm;
    private JFormattedTextField jFormattedTextFieldCPF, jFormattedTextFieldData;
    private ButtonGroup buttonGroup;
    private ArrayList<ClienteBean> dados = new ArrayList<>();

    public ClienteListaCadastro() {
        instanciarComponentes();
        gerarTela();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configurarJFormattedTextField();
        definirjRadioButton();
        acaoBotaoSalvar();
        acaoBotaoEditar();
        acaoBotaoExcluir();
        acaoBotaoTeclas();
        popularTabela();
        acaoCodigoLostFocus();
        jFrame.setVisible(true);
    }

    private void popularTabela() {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<ClienteBean> clientes = clienteDAO.obterClientes();
        /*for (int i = 0; i < clientes.size(); i++) {
            ClienteBean cliente = clientes.get(i);
        }*/
        for (ClienteBean cliente : clientes) {
          dtm.addRow(new Object[]{
              cliente.getId(),
              cliente.getNome(),
              cliente.getCpf(),
              cliente.getData()
          });
        }
    }

    public void instanciarComponentes() {
        //JLabel´s
        jLabelID = new JLabel("ID");
        jLabelNome = new JLabel("Nome");
        jLabelData = new JLabel("Data Nascimento");
        jLabelCPF = new JLabel("CPF");

        //JTextField´s
        jTextFieldID = new JTextField();
        jTextFieldNome = new JTextField();
        jFormattedTextFieldData = new JFormattedTextField();
        jFormattedTextFieldCPF = new JFormattedTextField();

        //JButton´s
        jButtonSalvar = new JButton("Salvar");
        jButtonExcluir = new JButton("Excluir");
        jButtonEditar = new JButton("Editar");

        //JRadioButton´s
        jRadioButtonAtivo = new JRadioButton("Ativo");
        jRadioButtonInativo = new JRadioButton("Inativo");

        //JTable
        jTable = new JTable();
        configurarJTable();

        //JScrollPane
        jScrollPane = new JScrollPane(jTable);

        //ButtonGroup
        buttonGroup = new ButtonGroup();
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame("Cadastro Cliente");
        jFrame.setSize(530, 340);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jLabelID);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelData);
        jFrame.add(jLabelCPF);
        jFrame.add(jTextFieldID);
        jFrame.add(jTextFieldNome);
        jFrame.add(jFormattedTextFieldData);
        jFrame.add(jFormattedTextFieldCPF);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jButtonEditar);
        jFrame.add(jRadioButtonAtivo);
        jFrame.add(jRadioButtonInativo);
        jFrame.add(jScrollPane);
    }

    @Override
    public void gerarLocalizacoes() {
        jLabelID.setLocation(10, 10);
        jLabelNome.setLocation(10, 35);
        jLabelData.setLocation(10, 60);
        jLabelCPF.setLocation(10, 85);
        jRadioButtonAtivo.setLocation(10, 110);
        jRadioButtonInativo.setLocation(90, 110);
        jTextFieldID.setLocation(115, 10);
        jTextFieldNome.setLocation(115, 35);
        jFormattedTextFieldData.setLocation(115, 60);
        jFormattedTextFieldCPF.setLocation(115, 85);
        jButtonSalvar.setLocation(10, 175);
        jButtonEditar.setLocation(10, 245);
        jButtonExcluir.setLocation(135, 245);
        jScrollPane.setLocation(245, 10);
    }

    @Override
    public void gerarDimensoes() {
        jLabelID.setSize(20, 20);
        jLabelNome.setSize(40, 20);
        jLabelData.setSize(100, 20);
        jLabelCPF.setSize(30, 20);
        jRadioButtonAtivo.setSize(70, 20);
        jRadioButtonInativo.setSize(70, 20);
        jTextFieldID.setSize(120, 20);
        jTextFieldNome.setSize(120, 20);
        jFormattedTextFieldData.setSize(120, 20);
        jFormattedTextFieldCPF.setSize(120, 20);
        jButtonSalvar.setSize(225, 50);
        jButtonEditar.setSize(100, 50);
        jButtonExcluir.setSize(100, 50);
        jScrollPane.setSize(270, 290);
    }

    private void configurarJTable() {
        dtm = new DefaultTableModel();
        dtm.addColumn("ID");
        dtm.addColumn("Nome");
        dtm.addColumn("CPF");
        dtm.addColumn("Nascimento");
        jTable.setModel(dtm);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(15);
    }

    private void definirjRadioButton() {
        buttonGroup.add(jRadioButtonAtivo);
        buttonGroup.add(jRadioButtonInativo);
    }

    private void configurarJFormattedTextField() {
        try {
            MaskFormatter maskFormatter = new MaskFormatter("###.###.###-##");
            maskFormatter.install(jFormattedTextFieldCPF);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Chame o Pastor");
        }
        try {
            MaskFormatter maskFormatterData = new MaskFormatter("##/##/####");
            maskFormatterData.install(jFormattedTextFieldData);
        } catch (Exception x) {
            x.printStackTrace();
            JOptionPane.showMessageDialog(null, "Chame o Pastor");
        }
    }

    private void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //id
                //nome
                //data
                //cpf
                //ativo/inativo
                if (jTextFieldNome.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nome deve ser preenchido");
                    jTextFieldNome.requestFocus();
                    return;
                }
                
                String datas = jFormattedTextFieldData.getText().trim();
                String[] data = datas.split("/");
                if (jFormattedTextFieldData.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data deve ser informada");
                    jFormattedTextFieldData.requestFocus();
                    return;
                }
                String cpf = jFormattedTextFieldCPF.getText()
                        .replace(".", "").replace("/", "").replace("-", "");
                if (cpf.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "CPF deve ser preenchido");
                    jFormattedTextFieldCPF.requestFocus();
                    return;
                }
                if (!jRadioButtonAtivo.isSelected() && !jRadioButtonInativo.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Deve ser selecionado se é ativo ou passivo");
                    return;
                }
                
                ClienteBean cliente = new ClienteBean();
                cliente.setNome(jTextFieldNome.getText());
                cliente.setData(Utilitarios.obterPadraoAmericano(jFormattedTextFieldData.getText()));
                cliente.setCpf(cpf);
                
                if(jTextFieldID.getText().isEmpty()){
                    int id = new ClienteDAO().inserir(cliente);
                    cliente.setId(id);
                    jTextFieldID.setText(String.valueOf(id));

                    /*dtm.addRow(new Object[]{

                    });*/
                    /*if(cliente.getId())
                        int linhaSelecionada = jTable.getSelectedRow();
                    dtm.removeRow(id);*/
                    dtm.addRow(new Object[]{
                        cliente.getId(),
                        cliente.getNome(),
                        cliente.getCpf(),
                        cliente.getData()
                    });
                }
                else{
                    try {
                        int id = Integer.parseInt(jTextFieldID.getText());
                        cliente.setId(id);
                        boolean alterou = new ClienteDAO().alterar(cliente);
                        if(alterou){
                            JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso");
                            int linhaSelecionada = jTable.getSelectedRow();
                            dtm.setValueAt(cliente.getId(), linhaSelecionada, 0);
                            dtm.setValueAt(cliente.getNome(), linhaSelecionada, 1);
                            dtm.setValueAt(cliente.getCpf(), linhaSelecionada, 2);
                            dtm.setValueAt(cliente.getData(), linhaSelecionada, 3);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Não foi possível alterar");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Código dever ser um código válido");
                    }
                }
                limparCampos();
            }
        });
    }

    private void limparCampos() {
        jTextFieldID.setText("");
        jFormattedTextFieldCPF.setText("");
        jTextFieldNome.setText("");
        jFormattedTextFieldData.setText("");
        linhaSelecionada = -1;
        jTextFieldID.requestFocus();
    }

    private void acaoBotaoEditar() {
        jButtonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jTable.getSelectedRow() == -1) {
                    JOptionPane.showMessageDialog(null, "Seleciona um registro");
                    return;
                }
                int linhaSelecionada = jTable.getSelectedRow();
                int id = Integer.parseInt(jTable.getValueAt(linhaSelecionada, 0).toString());
                ClienteBean cliente = new ClienteDAO().obterClientePeloId(id);
                jTextFieldNome.setText(cliente.getNome());
                jTextFieldID.setText(String.valueOf(cliente.getId()));
                jFormattedTextFieldCPF.setText(cliente.getCpf());
                jFormattedTextFieldData.setText(Utilitarios.obterPadraoBR(cliente.getData()));
            }
        });
    }

    private void preencherCampos(ClienteBean dados) {
        jTextFieldNome.setText(dados.getNome());
        jTextFieldID.setText(
                String.valueOf(dados.getId())
        );
        jFormattedTextFieldData.setText(
                String.valueOf(dados.getData())
        );
        jFormattedTextFieldCPF.setText(dados.getCpf());
        jRadioButtonAtivo.setSelected(dados.isAtivo());
    }

    private void acaoBotaoExcluir() {
        jButtonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linhaSelecionada = jTable.getSelectedRow();
                int id = Integer.parseInt(jTable.getValueAt(linhaSelecionada, 0).toString());
                
                new ClienteDAO().apagar(id);
                dtm.removeRow(linhaSelecionada);
            }
        });
    }

    private void acaoBotaoTeclas() {
        jTextFieldID.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jTextFieldNome.requestFocus();
                        break;
                    case KeyEvent.VK_TAB:
                        jTextFieldNome.requestFocus();
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        jTextFieldNome.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jFormattedTextFieldData.requestFocus();
                        break;
                    case KeyEvent.VK_TAB:
                        jFormattedTextFieldData.requestFocus();
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        jFormattedTextFieldData.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jFormattedTextFieldCPF.requestFocus();
                        break;
                    case KeyEvent.VK_TAB:
                        jFormattedTextFieldCPF.requestFocus();
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

        jFormattedTextFieldCPF.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jRadioButtonAtivo.requestFocus();
                        break;
                    case KeyEvent.VK_TAB:
                        jRadioButtonAtivo.requestFocus();
                        break;
                }
            }

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });

    }

    private void acaoCodigoLostFocus() {
        jTextFieldID.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                if(!jTextFieldID.getText().isEmpty()){
                    try {
                        int id = Integer.parseInt(jTextFieldID.getText());
                        ClienteBean cliente = new ClienteDAO().obterClientePeloId(id);
                        if(cliente == null){
                            JOptionPane.showMessageDialog(null, "Registro não encontrado");
                            jTextFieldID.requestFocus();
                        }
                        else{
                            jTextFieldNome.setText(cliente.getNome());
                            jFormattedTextFieldCPF.setText(cliente.getCpf());
                            jFormattedTextFieldData.setText(Utilitarios.obterPadraoBR(cliente.getData()));
                            buttonGroup.clearSelection();
                            if(cliente.isAtivo()){
                                jRadioButtonAtivo.setSelected(true);
                            }
                            else{
                                jRadioButtonInativo.setSelected(true);
                            }
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Campo deve conter somente números");
                    }
                }
            }
        });
    }

}
