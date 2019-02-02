package view;

import bean.AlunoBean;
import dao.AlunoDAO;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 * @author Rafael Alipio Harada
 */

public class SubTelas {
    
    private JFrame jFrame;
    private JLabel jLabelMensagem,jLabelTable,jLabelProcurar;
    private JTextField jTextFieldProcurar;
    private JTable jTableLista;
    private DefaultTableModel dtm;
    private JScrollPane jScrollPane;
    private JButton jButtonOption1,jButtonOption2;
    private JRadioButton jRadioButtonOption1, jRadioButtonOption2;
    private ButtonGroup buttonGroup;
    public boolean apagar, voltar, retornar;
    
    int i; String texto;
    
        
    
    public void aparecerTela(boolean verdade){
        if(verdade){
            tipoDeSubTela(i);
            if(i>0){
                textoAInserir(texto);
            }
            else{
                texto = null;
            }
            gerarTela(i);
            instanciarComponentes(i);
            gerarDimensoes(i);
            gerarPosicoes(i);
            adicionarComponentes(i);
            if(i == 0){
                configurarJTable();
                popularTabela();
                configurarButtonGroup();
            }
            adicionarAcoes(i);
            jFrame.setVisible(true);
        }
        else{
            jFrame.dispose();
        }
    }
    
    private void gerarTela(int i) {
        jFrame = new JFrame(
                i == 0 ? "Lista de Alunos":
                i == 1 ? "Notificação!":
                "Erro");
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        int x,y;
        x = i == 0 ? 900:
            i == 1 ? 300:
            0;
        y = i == 0 ? 600:
            i == 1 ? 150:
            0;
        jFrame.setSize(x, y);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void instanciarComponentes(int i){
        jLabelMensagem = new JLabel(texto);
        jLabelProcurar = new JLabel("Procurar");
        jLabelTable = new JLabel("Lista de alunos");
        jTextFieldProcurar = new JTextField();
        
        jTableLista = new JTable();
        jScrollPane = new JScrollPane(jTableLista);
        
        jButtonOption1 = new JButton(
            i == 0? "Apagar":
            i == 1? "OK":
            "erro");
        jButtonOption2 = new JButton("Voltar");
        
        buttonGroup = new ButtonGroup();
        jRadioButtonOption1 = new JRadioButton("Procurar pelo Nome");
        jRadioButtonOption2 = new JRadioButton("Procurar pelo Código de Matrícula");
    }

    private void gerarDimensoes(int i) {
        int x,y; 
        if(i == 0){
            x = 60;
            y = 25;
            jLabelProcurar.setSize(x, y);
            x = 250;
            y = 25;
            jLabelTable.setSize(x,y);
            jTextFieldProcurar.setSize(x,y);
            x = 100;
            y = 50;
            jButtonOption1.setSize(x,y);
            jButtonOption2.setSize(x,y);
            x = 250;
            y = 25;
            jRadioButtonOption1.setSize(x,y);
            jRadioButtonOption2.setSize(x,y);
            x = jFrame.getWidth()-25;
            y = 395;
            jScrollPane.setSize(x,y);
        }
        else{
            x = 300;
            y = 25;
            jLabelMensagem.setSize(x,y);
            x = 100;
            y = 50;
            jButtonOption1.setSize(x, y);
            if(i == 2){
                jButtonOption2.setSize(x, y);
            }
        }
    }

    private void gerarPosicoes(int i) {
        int x,y; 
        if(i == 0){
            x = 10;
            y = 10;
            jLabelProcurar.setLocation(x, y);
            jTextFieldProcurar.setLocation((2*x) + jLabelProcurar.getWidth(), y);
            jRadioButtonOption1.setLocation(x, jTextFieldProcurar.getHeight() + jTextFieldProcurar.getY() + y);
            jRadioButtonOption2.setLocation(x, jRadioButtonOption1.getHeight() + jRadioButtonOption1.getY() + y);
            
            jButtonOption1.setLocation(jFrame.getWidth() - (jButtonOption1.getWidth() + 15), y);
            jButtonOption2.setLocation(jButtonOption1.getX(), jButtonOption1.getHeight()+jButtonOption1.getY() + y);
            
            jLabelTable.setLocation(x, jRadioButtonOption2.getY() + jRadioButtonOption2.getHeight() + (3*y));
            jScrollPane.setLocation(x,jLabelTable.getY() + jLabelTable.getHeight() + y);
        }
        else{
            x = 30;
            y = 20;
            jLabelMensagem.setLocation(x,y);
            jButtonOption1.setLocation((jFrame.getWidth()/2)-(jButtonOption1.getWidth()/2), jFrame.getHeight()-jButtonOption1.getHeight()*2);
        }
    }

    private void adicionarComponentes(int i) {
        if(i == 0){
            jFrame.add(jLabelProcurar);
            jFrame.add(jTextFieldProcurar);
            jFrame.add(jLabelTable);
            jFrame.add(jScrollPane);
            jFrame.add(jButtonOption1);
            jFrame.add(jButtonOption2);
            jFrame.add(jRadioButtonOption1);
            jFrame.add(jRadioButtonOption2);
        }
        else{
            jFrame.add(jLabelMensagem);
            jFrame.add(jButtonOption1);
        }
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
        dtm.addColumn("Matrícula");
        dtm.addColumn("1ª Nota");
        dtm.addColumn("2ª Nota");
        dtm.addColumn("3ª Nota");
        dtm.addColumn("Média");
        dtm.addColumn("Frequência");
        dtm.addColumn("Status");
        jTableLista.setModel(dtm);
        jTableLista.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTableLista.getColumnModel().getColumn(1).setPreferredWidth(300);
        jTableLista.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableLista.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTableLista.getColumnModel().getColumn(4).setPreferredWidth(50);
        jTableLista.getColumnModel().getColumn(5).setPreferredWidth(50);
        jTableLista.getColumnModel().getColumn(6).setPreferredWidth(50);
        jTableLista.getColumnModel().getColumn(7).setPreferredWidth(80);
        jTableLista.getColumnModel().getColumn(8).setPreferredWidth(150);
    }

    private void popularTabela() {
        AlunoDAO alunoDAO = new AlunoDAO();
        List<AlunoBean> alunos = alunoDAO.obterAlunos();
        for (AlunoBean aluno : alunos) {
            dtm.addRow(new Object[]{
                aluno.getId(),
                aluno.getNome(),
                aluno.getCodigo_matricula(),
                aluno.getNota_1(),
                aluno.getNota_2(),
                aluno.getNota_3(),
                aluno.getMedia(),
                aluno.getFrequencia(),
                aluno.getStatus()
            });
        }
    }
    
    private void adicionarAcoes(int i){
        if(i == 0){
            jButtonOption1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int retorno = JOptionPane.showConfirmDialog(null, "Você tem certeza que deseja apagar esta linha?","Apagar?",JOptionPane.YES_NO_OPTION);
                    if(retorno == JOptionPane.OK_OPTION){
                        int linhaSelecionada = jTableLista.getSelectedRow();
                        int id = Integer.parseInt(jTableLista.getValueAt(linhaSelecionada, 0).toString());
                        new AlunoDAO().apagar(id);
                        dtm.removeRow(linhaSelecionada);
                    }
                    else{
                        return;
                    }
                }
            });
            jButtonOption2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    voltar = true;
                    new AlunosCadastro();
                    jFrame.dispose();
                }
            });
            jRadioButtonOption1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AlunoDAO alunoDAO = new AlunoDAO();
                    List<AlunoBean> alunos = alunoDAO.obterAlunos();
                    String busca = jTextFieldProcurar.getText().trim().toUpperCase();
                    int i = 0;
                    int nenhumFatorEncontrado = jTableLista.getRowCount();
                    if(jTableLista.getSelectedRow() == jTableLista.getRowCount()-1){
                        jTableLista.clearSelection();
                    }
                    for (i = jTableLista.getSelectedRow()+1; i < jTableLista.getRowCount(); i++) {
                        if(alunos.get(i).getNome().contains(busca)){
                            jTableLista.setRowSelectionInterval(i, i);
                            nenhumFatorEncontrado--;
                            return;
                        }
                        if(i == jTableLista.getRowCount()-1 && nenhumFatorEncontrado != jTableLista.getRowCount()){
                            jTableLista.clearSelection();
                            i = -1;
                        }
                        else{
                            continue;
                        }
                    }
                }
            });
            jRadioButtonOption2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    AlunoDAO alunoDAO = new AlunoDAO();
                    List<AlunoBean> alunos = alunoDAO.obterAlunos();
                    String busca = jTextFieldProcurar.getText().trim();
                    int i = 0;
                    int nenhumFatorEncontrado = jTableLista.getRowCount();
                    if(jTableLista.getSelectedRow() == jTableLista.getRowCount()-1){
                        jTableLista.clearSelection();
                    }
                    for (i = jTableLista.getSelectedRow()+1; i < jTableLista.getRowCount(); i++) {
                        if(alunos.get(i).getCodigo_matricula().contains(busca)){
                            jTableLista.setRowSelectionInterval(i, i);
                            nenhumFatorEncontrado--;
                            return;
                        }
                        if(i == jTableLista.getRowCount()-1 && nenhumFatorEncontrado != jTableLista.getRowCount()){
                            jTableLista.clearSelection();
                            i = -1;
                        }
                        else{
                            continue;
                        }
                    }
                }
            });
        }
        else{
            jButtonOption1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    jFrame.dispose();
                }
            });
        }
        
    }

    public int tipoDeSubTela(int i) {
        this.i = i;
        return this.i;
    }

    public String textoAInserir(String texto) {
        this.texto = texto;
        return this.texto;
    }
    
    private void configurarButtonGroup() {
        buttonGroup.add(jRadioButtonOption1);
        buttonGroup.add(jRadioButtonOption2);
    }
}
