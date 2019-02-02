package br.com.entra21java.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Rafael Alipio Harada
 */

public class Conexao {
    private static final String HOST = "jdbc:mysql://localhost/exemplo_web_01";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String CLASS = "com.mysql.jdbc.Driver";
    private static Connection conexao;
    
    public static void main(String[] args) {
        Conexao.obterConexao();        
    }
    
    public static Connection obterConexao(){
        try{
            Class.forName(CLASS);
            conexao = DriverManager.getConnection(HOST, USER, PASSWORD);
            return conexao;
        } catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static void fecharConexao(){
        try{
            if(conexao != null){
                conexao.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
