/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;


/**
 *
 * @author FLUFG
 */
public class ModuloConexao {
    
    // metodo responsavel por estabelecer conexao com o banco
    //testegit
    
    public static Connection conector(){
           
        java.sql.Connection conexao = null;
        
        // chama o drive do mysql
        
        String driver = "com.mysql.jdbc.Driver";
        
        // Armazenando informações referente ao banco;
        
       // String url = "jdbc:mysql://localhost:3306/dbinfox";
       String url = "jdbc:mysql://192.241.130.217:3306/dbinfox";
        String user  = "root";
        String password = "obnfe1320";
        // Estabelecendo a conexao com o banco
        
        
        try {
            
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e) {
            
            //System.out.println(e);
            
           
             
            
            return null;
        }
  
       
    }
}
