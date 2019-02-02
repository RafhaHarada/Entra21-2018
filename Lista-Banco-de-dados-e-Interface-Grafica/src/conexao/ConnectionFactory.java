package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Rafael Alipio Harada
 */
public class ConnectionFactory {
    private static String CLASS_NAME = "com.mysql.jdbc.Driver";
    private static String HOST = "jdbc:mysql://localhost/exercicio_DB_GUI";
    private static String LOGIN = "root";
    private static String SENHA = "";
    private static Connection conexao;
    
    public static void main(String[] args) {
        ConnectionFactory.getConnection();
    }

    public static Connection getConnection() {
        try {
            conexao = DriverManager.getConnection(HOST, LOGIN, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }
    
    public static void closeConnection(){
        try {
            if(conexao != null){
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
