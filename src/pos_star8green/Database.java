/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos_star8green;

import java.sql.*;

/**
 *
 * @author Patrick Dale
 */
public class Database {
//    String dburl="jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12175914";
//    String dbuser="sql12175914";
//    String dbpass="uk1jbKXu75";
    String dburl="jdbc:mysql://localhost:3306/star8pos";
    String dbuser="root";
    String dbpass="";
    
    public boolean Login(String username, String password) throws SQLException{
        String query="SELECT * FROM users WHERE username='"+username+"' AND password='"+password+"'";
        ResultSet rs=DriverManager.getConnection(dburl,dbuser,dbpass).createStatement().executeQuery(query);
        rs.last();
        if(rs.getRow()>0){
            return true;
        }else{
            return false;
        }
    }
}
