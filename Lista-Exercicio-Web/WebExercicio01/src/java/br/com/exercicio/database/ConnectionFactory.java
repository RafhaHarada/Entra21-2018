/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicio.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alunos
 */
public class ConnectionFactory {
    
    private static final String HOST = "jdbc:mysql://localhost/bancoAlunos";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String CLASS = "com.mysql.jdbc.Driver";
    private static Connection con;
    
    public static void main(String[] args) {
        
    }
    
    public static Connection takingConnection(){
        try {
            Class.forName(CLASS);
            con = DriverManager.getConnection(HOST, USER, PASSWORD);
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void closeConnection(){
        try {
            if(con != null){
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
