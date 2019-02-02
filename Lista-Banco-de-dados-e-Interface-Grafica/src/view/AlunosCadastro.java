package view;

import bean.AlunoBean;
import dao.AlunoDAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;

/**
 * @author Rafael Alipio Harada
 */
public class AlunosCadastro {
    private JFrame jFrame/*,jFrameCadastro,jFrameExcluir,jFrameEditar,jFrameListar*/;
    private JLabel jLabelId,jLabelNome,jLabelCodigo_Matricula,jLabelNota_1,jLabelNota_2,jLabelNota_3,jLabelFrequencia,jLabelMedia;
    private JTextField jTextFieldId,jTextFieldNome,jTextFieldCodigo_Matricula,jTextFieldNota_1,jTextFieldNota_2,jTextFieldNota_3,jTextFieldFrequencia,jTextFieldMedia;
    private JTable jTable;
    private JScrollPane jScrollPane;
    private JButton jButtonSalvar,jButtonEditar,jButtonExcluir,jButtonListar;
    private DefaultTableModel dtm;
    
    public AlunosCadastro(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        acaoBotaoEditar();
        acaoBotaoSalvar();
        acaoBotaoExcluir();
        acaoBotaoListar();
        acaoBotoesTeclado();
        acaoMouse();
        configurarJTable();
        popularTabela();
        acaoCodigoLostFocus();
        jFrame.setVisible(true);
    }

    private void gerarTela() {
        jFrame = new JFrame("Cadastro Alunos");
        jFrame.setLayout(null);
        jFrame.setSize(800,450);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void instanciarComponentes() {
        jLabelId = new JLabel("ID");
        jLabelNome = new JLabel("Nome");
        jLabelCodigo_Matricula = new JLabel("Código de Matrícula");
        jLabelNota_1 = new JLabel("1ª Nota");
        jLabelNota_2 = new JLabel("2ª Nota");
        jLabelNota_3 = new JLabel("3ª Nota");
        jLabelMedia = new JLabel("Média");
        jLabelFrequencia = new JLabel("Frequência");
        
        jTextFieldId = new JTextField();
        jTextFieldId.setEnabled(false);
        jTextFieldNome = new JTextField();
        jTextFieldCodigo_Matricula = new JTextField();
        jTextFieldCodigo_Matricula.setEnabled(false);
        jTextFieldNota_1 = new JTextField();
        jTextFieldNota_2 = new JTextField();
        jTextFieldNota_3 = new JTextField();
        jTextFieldMedia = new JTextField();
        jTextFieldMedia.setEnabled(false);
        jTextFieldFrequencia = new JTextField();
        
        jTable = new JTable();
        jScrollPane = new JScrollPane(jTable);
        
        jButtonSalvar = new JButton("Salvar");
        jButtonEditar = new JButton("Editar");
        jButtonExcluir = new JButton("Excluir");
        jButtonListar = new JButton("Listar");
    }

    private void adicionarComponentes() {
        jFrame.add(jLabelId);
        jFrame.add(jLabelNome);
        jFrame.add(jLabelCodigo_Matricula);
        jFrame.add(jLabelNota_1);
        jFrame.add(jLabelNota_2);
        jFrame.add(jLabelNota_3);
        jFrame.add(jLabelMedia);
        jFrame.add(jLabelFrequencia);
        jFrame.add(jTextFieldId);
        jFrame.add(jTextFieldNome);
        jFrame.add(jTextFieldCodigo_Matricula);
        jFrame.add(jTextFieldNota_1);
        jFrame.add(jTextFieldNota_2);
        jFrame.add(jTextFieldNota_3);
        jFrame.add(jTextFieldMedia);
        jFrame.add(jTextFieldFrequencia);
        jFrame.add(jScrollPane);
        jFrame.add(jButtonSalvar);
        jFrame.add(jButtonEditar);
        jFrame.add(jButtonExcluir);
        jFrame.add(jButtonListar);
    }
    
    private void gerarDimensoes() {
        jLabelId.setSize(120, 25);
        jLabelNome.setSize(jLabelId.getSize());
        jLabelCodigo_Matricula.setSize(jLabelId.getSize());
        jLabelNota_1.setSize(jLabelId.getSize());
        jLabelNota_2.setSize(jLabelId.getSize());
        jLabelNota_3.setSize(jLabelId.getSize());
        jLabelMedia.setSize(jLabelId.getSize());
        jLabelFrequencia.setSize(jLabelId.getSize());
        
        jTextFieldId.setSize(200, 25);
        jTextFieldNome.setSize(jTextFieldId.getSize());
        jTextFieldCodigo_Matricula.setSize(jTextFieldId.getSize());
        jTextFieldNota_1.setSize(jTextFieldId.getSize());
        jTextFieldNota_2.setSize(jTextFieldId.getSize());
        jTextFieldNota_3.setSize(jTextFieldId.getSize());
        jTextFieldMedia.setSize(jTextFieldId.getSize());
        jTextFieldFrequencia.setSize(jTextFieldId.getSize());
        
        jScrollPane.setSize(425,400);
        
        jButtonSalvar.setSize(75, 40);
        jButtonEditar.setSize(jButtonSalvar.getSize());
        jButtonExcluir.setSize(jButtonSalvar.getSize());
        jButtonListar.setSize(jButtonSalvar.getSize());
    }

    private void gerarLocalizacoes() {
        int i = 18;
        jLabelId.setLocation(10,10);
        jLabelNome.setLocation(jLabelId.getX(),jLabelId.getY()+jLabelId.getHeight()+i);
        jLabelCodigo_Matricula.setLocation(jLabelNome.getX(),jLabelNome.getY()+jLabelNome.getHeight()+i);
        jLabelNota_1.setLocation(jLabelCodigo_Matricula.getX(),jLabelCodigo_Matricula.getY()+jLabelCodigo_Matricula.getHeight()+i);
        jLabelNota_2.setLocation(jLabelNota_1.getX(),jLabelNota_1.getY()+jLabelNota_1.getHeight()+i);
        jLabelNota_3.setLocation(jLabelNota_2.getX(),jLabelNota_2.getY()+jLabelNota_2.getHeight()+i);
        jLabelMedia.setLocation(jLabelNota_3.getX(),jLabelNota_3.getY()+jLabelNota_3.getHeight()+i);
        jLabelFrequencia.setLocation(jLabelMedia.getX(),jLabelMedia.getY()+jLabelMedia.getHeight()+i);
        
        jTextFieldId.setLocation(jLabelId.getX()+jLabelId.getWidth()+10,jLabelId.getY());
        jTextFieldNome.setLocation(jTextFieldId.getX(),jLabelNome.getY());
        jTextFieldCodigo_Matricula.setLocation(jTextFieldId.getX(),jLabelCodigo_Matricula.getY());
        jTextFieldNota_1.setLocation(jTextFieldId.getX(),jLabelNota_1.getY());
        jTextFieldNota_2.setLocation(jTextFieldId.getX(),jLabelNota_2.getY());
        jTextFieldNota_3.setLocation(jTextFieldId.getX(),jLabelNota_3.getY());
        jTextFieldMedia.setLocation(jTextFieldId.getX(),jLabelMedia.getY());
        jTextFieldFrequencia.setLocation(jTextFieldId.getX(),jLabelFrequencia.getY());
        
        jScrollPane.setLocation(jTextFieldId.getX()+jTextFieldId.getWidth()+20,jLabelId.getY());
        
        i = 12;
        jButtonSalvar.setLocation(jLabelId.getX(),jScrollPane.getY()+jScrollPane.getHeight()-jButtonSalvar.getHeight());
        jButtonEditar.setLocation(jButtonSalvar.getX()+jButtonSalvar.getWidth()+i,jButtonSalvar.getY());
        jButtonExcluir.setLocation(jButtonEditar.getX()+jButtonEditar.getWidth()+i,jButtonSalvar.getY());
        jButtonListar.setLocation(jButtonExcluir.getX()+jButtonExcluir.getWidth()+i,jButtonSalvar.getY());
    }
    
    
    

    private void acaoBotaoEditar() {
        jButtonEditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jTable.getSelectedRow() == -1){
                    subTelas(3);
                    return;
                }
                limparCampos();
                int linhaSelecionada = jTable.getSelectedRow();
                int id = Integer.parseInt(jTable.getValueAt(linhaSelecionada, 0).toString());
                AlunoBean aluno = new AlunoDAO().obterAlunoPeloId(id);
                jTextFieldId.setText(String.valueOf(aluno.getId()));
                jTextFieldCodigo_Matricula.setText(aluno.getCodigo_matricula());
                jTextFieldNome.setText(aluno.getNome());
                jTextFieldNota_1.setText(String.valueOf(aluno.getNota_1()));
                jTextFieldNota_2.setText(String.valueOf(aluno.getNota_2()));
                jTextFieldNota_3.setText(String.valueOf(aluno.getNota_3()));
                jTextFieldMedia.setText(String.valueOf(aluno.getMedia()));
                jTextFieldFrequencia.setText(String.valueOf(aluno.getFrequencia()));
                jTextFieldId.setEnabled(true);
            }
        });
    }
    
    private void acaoBotaoExcluir() {
        jButtonExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int retorno = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja apagar esta linha?","Apagar?",JOptionPane.YES_NO_OPTION);
                if(retorno == JOptionPane.OK_OPTION){
                    int linhaSelecionada = jTable.getSelectedRow();
                    int id = Integer.parseInt(jTable.getValueAt(linhaSelecionada, 0).toString());
                    new AlunoDAO().apagar(id);
                    dtm.removeRow(linhaSelecionada);
                }
                else{
                    return;
                }
            }
        });
    }
    
    private void acaoBotaoListar() {
        jButtonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                subTelas(0);
            }
        });
    }
    
    private void acaoBotaoSalvar() {
        jButtonSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!correcaoValores()){
                    return;
                }
                if(!validacoes()){
                    return;
                }
                
                AlunoBean aluno = new AlunoBean();
                aluno.setNome(jTextFieldNome.getText().trim());
                aluno.setCodigo_matricula(jTextFieldCodigo_Matricula.getText().trim());
                aluno.setNota_1(Float.parseFloat(jTextFieldNota_1.getText()));
                aluno.setNota_2(Float.parseFloat(jTextFieldNota_2.getText()));
                aluno.setNota_3(Float.parseFloat(jTextFieldNota_3.getText()));
                aluno.setFrequencia(Byte.parseByte(jTextFieldFrequencia.getText()));
                avaliacao(aluno);
                geracaoCodigoMatricula(aluno);
                
                if(jTextFieldId.getText().isEmpty()){
                    int id = new AlunoDAO().inserir(aluno);
                    aluno.setId(id);
                    
                    dtm.addRow(new Object[]{
                        aluno.getId(),
                        aluno.getNome(),
                        aluno.getMedia(),
                        aluno.getStatus()
                    });
                    //jTextFieldId.setEnabled(true);
                    //jTextFieldId.setText(String.valueOf(id));
                }
                else{
                    try {
                        int id = Integer.parseInt(jTextFieldId.getText());
                        aluno.setId(id);
                        boolean alterou = new AlunoDAO().alterar(aluno);
                        if(alterou){
                            subTelas(1);
                            int linhaEditada = 0;
                            for (int i = 0; i < jTable.getRowCount(); i++) {
                                if(Integer.parseInt(jTable.getValueAt(i, 0).toString()) == id){
                                    linhaEditada = i;
                                }
                            }
                            dtm.setValueAt(aluno.getId(), linhaEditada, 0);
                            dtm.setValueAt(aluno.getNome(), linhaEditada, 1);
                            dtm.setValueAt(aluno.getMedia(), linhaEditada, 2);
                            dtm.setValueAt(aluno.getStatus(), linhaEditada, 3);
                        }
                        else{
                            subTelas(2);
                        }
                    } catch (NumberFormatException ex) {
                            subTelas(2);
                    }
                }
                limparCampos();
            }
        });
    }
    
    private void limparCampos() {
        JTextField jtf = new JTextField();
        jTextFieldId.setText("");
        jTextFieldNome.setText("");
        jTextFieldCodigo_Matricula.setText("");
        jTextFieldNota_1.setText("");
        jTextFieldNota_2.setText("");
        jTextFieldNota_3.setText("");
        jTextFieldMedia.setText("");
        jTextFieldFrequencia.setText("");
        jTextFieldId.setBorder(jtf.getBorder());
        jTextFieldNome.setBorder(jtf.getBorder());
        jTextFieldCodigo_Matricula.setBorder(jtf.getBorder());
        jTextFieldNota_1.setBorder(jtf.getBorder());
        jTextFieldNota_2.setBorder(jtf.getBorder());
        jTextFieldNota_3.setBorder(jtf.getBorder());
        jTextFieldMedia.setBorder(jtf.getBorder());
        jTextFieldFrequencia.setBorder(jtf.getBorder());
        jTextFieldId.setEnabled(false);
    }

    private void acaoBotoesTeclado() {
        jTextFieldId.addKeyListener(new KeyListener() {
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
                        jTextFieldNota_1.requestFocus();
                        if(jTextFieldNota_1.getText().contains("Insira")){
                            jTextFieldNota_1.setText("");
                        }
                        break;
                    case KeyEvent.VK_TAB:
                        jTextFieldNota_1.requestFocus();
                        if(jTextFieldNota_1.getText().contains("Insira")){
                            jTextFieldNota_1.setText("");
                        }
                        break;
                }
            }
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            }
        });

        jTextFieldNota_1.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jTextFieldNota_2.requestFocus();
                        if(jTextFieldNota_2.getText().contains("Insira")){
                            jTextFieldNota_2.setText("");
                        }
                        correcaoValores();
                        break;
                    case KeyEvent.VK_TAB:
                        jTextFieldNota_2.requestFocus();
                        if(jTextFieldNota_2.getText().contains("Insira")){
                            jTextFieldNota_2.setText("");
                        }
                        correcaoValores();
                        break;
                }
            }
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            }
        });

        jTextFieldNota_2.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jTextFieldNota_3.requestFocus();
                        if(jTextFieldNota_3.getText().contains("Insira")){
                            jTextFieldNota_3.setText("");
                        }
                        correcaoValores();
                        break;
                    case KeyEvent.VK_TAB:
                        jTextFieldNota_3.requestFocus();
                        if(jTextFieldNota_3.getText().contains("Insira")){
                            jTextFieldNota_3.setText("");
                        }
                        correcaoValores();
                        break;
                }
            }
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            }
        });

        jTextFieldNota_3.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        jTextFieldFrequencia.requestFocus();
                        if(jTextFieldFrequencia.getText().contains("Insira")){
                            jTextFieldFrequencia.setText("");
                        }
                        correcaoValores();
                        break;
                    case KeyEvent.VK_TAB:
                        jTextFieldFrequencia.requestFocus();
                        if(jTextFieldFrequencia.getText().contains("Insira")){
                            jTextFieldFrequencia.setText("");
                        }
                        correcaoValores();
                        break;
                }
            }
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            }
        });
        
        jTextFieldFrequencia.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_ENTER:
                        correcaoValores();
                        break;
                    case KeyEvent.VK_TAB:
                        correcaoValores();
                        break;
                }
            }
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            }
        });
    }
    
    private void acaoMouse(){
        jFrame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                correcaoValores();
            }
            @Override
            public void mouseExited(MouseEvent e) {
                correcaoValores();
            }
        });
        
        jTextFieldNome.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                correcaoValidacao();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        jTextFieldNota_1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jTextFieldNota_1.getText().contains("Insira")){
                            jTextFieldNota_1.setText("");
                }
                correcaoValidacao();
                correcaoValores();
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });

        jTextFieldNota_2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jTextFieldNota_2.getText().contains("Insira")){
                            jTextFieldNota_2.setText("");
                }
                correcaoValidacao();
                correcaoValores();
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        jTextFieldNota_3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jTextFieldNota_3.getText().contains("Insira")){
                            jTextFieldNota_3.setText("");
                }
                correcaoValidacao();
                correcaoValores();
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        
        jTextFieldFrequencia.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(jTextFieldFrequencia.getText().contains("Insira")){
                            jTextFieldFrequencia.setText("");
                }
                correcaoValidacao();
                correcaoValores();
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
    }
    
    private AlunoBean geracaoCodigoMatricula(AlunoBean aluno){
        AlunoDAO alunoDAO = new AlunoDAO();
        String letras[] = jTextFieldNome.getText().split(" ");
        String codigo = "";
        codigo += 0;
        for (int i = 0; i < letras.length; i++) {
            codigo += "" + (int)(letras[i].charAt(0)) + (letras[i].length());
        }
        List<AlunoBean> alunos = alunoDAO.obterAlunos();
        for (int i = 0; i < alunos.size(); i++) {
            if(alunos.get(i).getCodigo_matricula().equals(codigo)){
                codigo = String.valueOf(i+1)+codigo.substring(1);
                i = 0;
            }
        }
        aluno.setCodigo_matricula(codigo);
        return aluno;
    }
    
    private boolean validacoes() {
        if(jTextFieldNome.getText().isEmpty() || jTextFieldNome.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNome.setText("Este campo deve ser preenchido");
            jTextFieldNome.setBorder(new LineBorder(Color.red));
            return false;
        }
        else{
            for (int i = 0; jTextFieldNome.getText().trim().contains("  "); i++) {
                jTextFieldNome.setText(jTextFieldNome.getText().trim().replace("  ", " "));
            }
            jTextFieldNome.setText(jTextFieldNome.getText().toUpperCase().trim());
        }
        if(jTextFieldNota_1.getText().isEmpty() || jTextFieldNota_1.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNota_1.setText("Este campo deve ser preenchido");
            jTextFieldNota_1.setBorder(new LineBorder(Color.red));
            return false;
        }
        if(jTextFieldNota_2.getText().isEmpty() || jTextFieldNota_2.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNota_2.setText("Este campo deve ser preenchido");
            jTextFieldNota_2.setBorder(new LineBorder(Color.red));
            return false;
        }
        if(jTextFieldNota_3.getText().isEmpty() || jTextFieldNota_3.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNota_3.setText("Este campo deve ser preenchido");
            jTextFieldNota_3.setBorder(new LineBorder(Color.red));
            return false;
        }
        if(jTextFieldFrequencia.getText().isEmpty() || jTextFieldFrequencia.getText().equals("Este campo deve ser preenchido")){
            jTextFieldFrequencia.setText("Este campo deve ser preenchido");
            jTextFieldFrequencia.setBorder(new LineBorder(Color.red));
            return false;            
        }
        if(jTextFieldId.getText().contains("Insira") ||
                jTextFieldNome.getText().contains("Insira") ||
                jTextFieldNota_1.getText().contains("Insira") ||
                jTextFieldNota_2.getText().contains("Insira") ||
                jTextFieldNota_3.getText().contains("Insira") ||
                jTextFieldFrequencia.getText().contains("Insira")){
            return false;
        }
        return true;
    }
    
    private void correcaoValidacao(){
        Border border = new JTextField().getBorder();
        
        if(jTextFieldNome.isFocusOwner() && jTextFieldNome.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNome.setBorder(border);
            jTextFieldNome.setText("");
        }
        if(jTextFieldFrequencia.isFocusOwner() && jTextFieldFrequencia.getText().equals("Este campo deve ser preenchido")){
            jTextFieldFrequencia.setBorder(border);
            jTextFieldFrequencia.setText("");
        }
        if(jTextFieldNota_1.isFocusOwner() && jTextFieldNota_1.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNota_1.setBorder(border);
            jTextFieldNota_1.setText("");
        }
        if(jTextFieldNota_2.isFocusOwner() && jTextFieldNota_2.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNota_2.setBorder(border);
            jTextFieldNota_2.setText("");
        }
        if(jTextFieldNota_3.isFocusOwner() && jTextFieldNota_3.getText().equals("Este campo deve ser preenchido")){
            jTextFieldNota_3.setBorder(border);
            jTextFieldNota_3.setText("");
        }
    }
    
    public boolean correcaoValores(){
        JTextField jTextField = new JTextField();
        float nota1 = 0,nota2 = 0,nota3 = 0, frequencia = 0;
        if(!jTextFieldNota_1.getText().isEmpty() && !jTextFieldNota_1.getText().equals("Este campo deve ser preenchido")){
            try {
                nota1 = Float.parseFloat(jTextFieldNota_1.getText());
                if(nota1 < 0){
                    jTextFieldNota_1.setText("Insira apenas números positivos");
                    jTextFieldNota_1.setBorder(new LineBorder(Color.red));
                    return false;
                }
            } catch (NumberFormatException e) {
                jTextFieldNota_1.setText("Insira apenas números positivos");
                jTextFieldNota_1.setBorder(new LineBorder(Color.red));
            }
        }
        if(!jTextFieldNota_2.getText().isEmpty() && !jTextFieldNota_2.getText().equals("Este campo deve ser preenchido")){
            try {
                nota2 = Float.parseFloat(jTextFieldNota_2.getText());
                if(nota2 < 0){
                    jTextFieldNota_2.setText("Insira apenas números positivos");
                    jTextFieldNota_2.setBorder(new LineBorder(Color.red));
                    return false;
                }
            } catch (NumberFormatException e) {
                jTextFieldNota_2.setText("Insira apenas números positivos");
                jTextFieldNota_2.setBorder(new LineBorder(Color.red));
            }
        }
        if(!jTextFieldNota_3.getText().isEmpty() && !jTextFieldNota_3.getText().equals("Este campo deve ser preenchido")){
            try {
                nota3 = Float.parseFloat(jTextFieldNota_3.getText());
                if(nota3 < 0){
                    jTextFieldNota_3.setText("Insira apenas números positivos");
                    jTextFieldNota_3.setBorder(new LineBorder(Color.red));
                    return false;
                }
            } catch (NumberFormatException e) {
                jTextFieldNota_3.setText("Insira apenas números positivos");
                jTextFieldNota_3.setBorder(new LineBorder(Color.red));
            }
        }
        if(!jTextFieldFrequencia.getText().isEmpty() && !jTextFieldFrequencia.getText().equals("Este campo deve ser preenchido")){
            try {
                frequencia = Float.parseFloat(jTextFieldFrequencia.getText());
                if(frequencia < 0){
                    jTextFieldFrequencia.setText("Insira apenas números positivos");
                    jTextFieldFrequencia.setBorder(new LineBorder(Color.red));
                    return false;
                }
            } catch(NumberFormatException e) {
                jTextFieldFrequencia.setText("Insira apenas números positivos");
                jTextFieldFrequencia.setBorder(new LineBorder(Color.red));
            }
        }
        if(!jTextFieldNota_1.getText().contains("Insira") && !jTextFieldNota_1.getText().contains("preenchido")){
            jTextFieldNota_1.setBorder(jTextField.getBorder());
        }
        if(!jTextFieldNota_2.getText().contains("Insira") && !jTextFieldNota_2.getText().contains("preenchido")){
            jTextFieldNota_2.setBorder(jTextField.getBorder());
        }
        if(!jTextFieldNota_3.getText().contains("Insira") && !jTextFieldNota_3.getText().contains("preenchido")){
            jTextFieldNota_3.setBorder(jTextField.getBorder());
        }
        if(!jTextFieldFrequencia.getText().contains("Insira") && !jTextFieldFrequencia.getText().contains("preenchido")){
            jTextFieldFrequencia.setBorder(jTextField.getBorder());
        }
        if(nota1>10){
            nota1 = 10;
            jTextFieldNota_1.setText(String.valueOf(nota1));
        }
        if(nota2>10){
            nota2 = 10;
            jTextFieldNota_2.setText(String.valueOf(nota2));
        }
        if(nota3>10){
            nota3 = 10;
            jTextFieldNota_3.setText(String.valueOf(nota3));
        }
        if(frequencia>100){
            frequencia = 100;
            jTextFieldFrequencia.setText(String.valueOf((byte)frequencia));
        }
        float media = (nota1+nota2+nota3)/3;
        
        jTextFieldMedia.setText(String.format("%.2f", media));
        return true;
    }
    
    public AlunoBean avaliacao(AlunoBean aluno){
        float nota1 = 0, nota2 = 0, nota3 = 0, frequencia = 0, media = 0;
        correcaoValores();
        try {
            nota1 = Float.parseFloat(jTextFieldNota_1.getText());
            nota2 = Float.parseFloat(jTextFieldNota_2.getText());
            nota3 = Float.parseFloat(jTextFieldNota_3.getText());
            frequencia = Float.parseFloat(jTextFieldFrequencia.getText());
            media = Float.parseFloat(String.format("%.2f",((nota1+nota2+nota3)/3)).replace(",", "."));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String status = 
        frequencia < 65 ? "Reprovado por frequência":
        media < 5 ? "Reprovado por média":
        media < 7 ? "Em exame":
        media >=7 ? "Aprovado":
        "Erro";
        
        aluno.setMedia(media);
        aluno.setStatus(status);
        return aluno;
    }
    
    private void configurarJTable(){
        dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        dtm.addColumn("ID");
        dtm.addColumn("Nome");
        dtm.addColumn("Média");
        dtm.addColumn("Status");
        jTable.setModel(dtm);
        jTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable.getColumnModel().getColumn(2).setPreferredWidth(20);
        jTable.getColumnModel().getColumn(3).setPreferredWidth(150);
    }

    private void popularTabela() {
        AlunoDAO alunoDAO = new AlunoDAO();
        List<AlunoBean> alunos = alunoDAO.obterAlunos();
        for (AlunoBean aluno : alunos) {
            dtm.addRow(new Object[]{
                aluno.getId(),
                aluno.getNome(),
                aluno.getMedia(),
                aluno.getStatus()
            });
        }
    }

    private void acaoCodigoLostFocus() {
    }

    private SubTelas subTelas(int i){
        SubTelas subTelas = new SubTelas();
        if(i == 0){
            subTelas.tipoDeSubTela(0);
            subTelas.aparecerTela(true);
            return subTelas;
        }
        else if(i == 1){
            subTelas.tipoDeSubTela(1);
            subTelas.textoAInserir("Aluno Alterado com sucesso.");
            subTelas.aparecerTela(true);
            return subTelas;
        }
        else if(i == 2){
            subTelas.tipoDeSubTela(1);
            subTelas.textoAInserir("Id dever ser um id válido.");
            subTelas.aparecerTela(true);
            return subTelas;
        }
        else if(i == 3){
            subTelas.tipoDeSubTela(1);
            subTelas.textoAInserir("Selecione um registro para editar.");
            subTelas.aparecerTela(true);
            return subTelas;
        }
        return null;
    }
}
