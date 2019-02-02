/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.JFrameBaseInterface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alunos
 */
public class AlunoLista implements JFrameBaseInterface {

    private JFrame jFrameLista;
    private JTable jTable;
    private JScrollPane jScrollPaneTable;
    private DefaultTableModel defaultTableModel;
    private JButton jButtonExcluir,
            jButtonAlterar,
            jButtonNovo;

    public AlunoLista() {
        gerarTela();
        instanciarComponentes();
        configScrollPaneTable();
        adicionarComponentes();
        gerarLocalizacoes();
        gerarDimensoes();
        configScrollPaneTable();
        acaoNovo();
        acaoAlterar();
        acaoExcluir();
        jFrameLista.setVisible(true);
    }

    @Override
    public void gerarTela() {
        jFrameLista = new JFrame();
        jFrameLista.setSize(710, 530);
        jFrameLista.setLayout(null);
        jFrameLista.setLocationRelativeTo(null);
        jFrameLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void adicionarComponentes() {
        jFrameLista.add(jButtonExcluir);
        jFrameLista.add(jButtonAlterar);
        jFrameLista.add(jButtonNovo);
        jFrameLista.add(jScrollPaneTable);
    }

    @Override
    public void instanciarComponentes() {
        jButtonAlterar = new JButton("Alterar");
        jButtonExcluir = new JButton("Excluir");
        jButtonNovo = new JButton("Novo");

        jScrollPaneTable = new JScrollPane();
        jTable = new JTable();
        Object[] colunas = new Object[]{"Nome", "Status", "Média"};
        defaultTableModel = new DefaultTableModel(colunas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        jTable.setModel(defaultTableModel);
        jScrollPaneTable = new JScrollPane(jTable);

    }

    @Override
    public void gerarLocalizacoes() {
        jButtonExcluir.setLocation(605, 10);
        jButtonNovo.setLocation(518, 10);
        jButtonAlterar.setLocation(605, 39);

        jScrollPaneTable.setLocation(10, 70);
    }

    @Override
    public void gerarDimensoes() {
        jButtonExcluir.setSize(80, 25);
        jButtonNovo.setSize(80, 25);
        jButtonAlterar.setSize(80, 25);

        jScrollPaneTable.setSize(600, 400);
    }

    private void configScrollPaneTable() {
        jScrollPaneTable.setViewportView(jTable);
        jScrollPaneTable.setVerticalScrollBarPolicy(jScrollPaneTable.VERTICAL_SCROLLBAR_AS_NEEDED);
    }

    private void acaoNovo() {
        jButtonNovo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new AlunoCadastro();
            }
        });
    }

    private void acaoAlterar() {
        jButtonAlterar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void acaoExcluir() {
        jButtonExcluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
