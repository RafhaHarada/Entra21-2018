package br.com.Sistema.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Rafael Alipio Harada (rafhaharada@gmail.com)
 */
public class Conexao {
    
    private static final String CLASS = "com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://localhost/bluVitalityDatabase";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection conexao;
    
    public static Connection abrirConexao(){
        try {
            Class.forName(CLASS);
            conexao = DriverManager.getConnection(HOST, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            
        }
            return conexao;
        
    }
    
    public static void fecharConexao(){
        try {
            if(conexao != null){
                conexao.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
