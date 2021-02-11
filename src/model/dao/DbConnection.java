/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Makhlouf Helali
 */
public class DbConnection {
    public static Connection connection = null;
    
    private DbConnection(){
        
    }
    
    public static Connection getInstance(){
        if(connection == null){
            String host = "127.0.0.1";
            String user = "sqluser";
            String password = "makhlouf";
            String dbname = "feedback";
            
            try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    connection = DriverManager.getConnection("jdbc:mysql://localhost/"+dbname+"?" +"user="+user+"&password="+password+"");

                } catch (Exception ex) {
                   ex.printStackTrace();
                }
        }
        
        return connection;
    }
}
