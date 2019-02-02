package exemplo09;

import exemplo08.JFrameBaseInteface;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class ExemploJTable01 implements JFrameBaseInteface{

    private JFrame jFrame;
    private JTable jTable;
    private DefaultTableModel defaultTableModel;
    private JScrollPane jScrollPane;
    
    public ExemploJTable01(){
        gerarTela();
        instanciarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        adicionarComponentes();
        jFrame.setVisible(true);
    }
    
    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jScrollPane);
    }

    @Override
    public void instanciarComponentes() {
        jTable = new JTable();
        jScrollPane = new JScrollPane(jTable);
        defaultTableModel = new DefaultTableModel(new Object[]{"Nome","Idade","Altura"},0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        configurarTableModel();
    }

    @Override
    public void gerarLocalizacoes() {
        jScrollPane.setLocation(10, 10);
    }

    @Override
    public void gerarDimensoes() {
        jScrollPane.setSize(400, 400);
    }
    

    private void configurarTableModel() {
        byte idade = 0;
        String nome = "";
        double altura = 0;
        for (int i = 0; i < 25; i++) {
            defaultTableModel.addRow(new Object[]{
                i*2,i*3,i*4
            });
        }
        defaultTableModel.addRow(new Object[]{
            "Gustavo", 22, 1.68
        });
        defaultTableModel.addRow(new Object[]{
            "Leonardo", 21, 1.76
        });
        defaultTableModel.addRow(new Object[]{
            "Crispim", 20, 1.75
        });
        jTable.setModel(defaultTableModel);
        
        
    }
    
    
}
