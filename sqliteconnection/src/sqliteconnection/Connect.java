/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqliteconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class Connect {
    private static Connection con;
    private static Statement stmt;
    
    public static Statement connection(){
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:temp.db";
            con = DriverManager.getConnection(url);
            stmt = con.createStatement();
            System.out.println("connection successful");
        }catch(Exception ex){
            System.out.println("connection failed");
        }
        return stmt;  
        
    }
        
    
    
}
