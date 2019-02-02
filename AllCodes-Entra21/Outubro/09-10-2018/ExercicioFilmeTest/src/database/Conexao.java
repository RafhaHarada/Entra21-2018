package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class Conexao {

    private static final String HOST = "jdbc:mysql://localhost/con";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String CLASS = "com.mysql.jdbc.Driver";
    private static Connection conexao;
    
    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("1 - Conectar\n2 - Desconectar"));
        if(i == 1){
            conectar();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } else {
            desconectar();
            JOptionPane.showMessageDialog(null, "Você foi Desconectado");
        }
    }

    public static Connection conectar() {
        try {
            Class.forName(CLASS);
            conexao = DriverManager.getConnection(HOST, USER, PASSWORD);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void desconectar() {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}