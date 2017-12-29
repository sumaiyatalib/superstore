/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hii
 */
public class connector {
        protected Connection cn;
    void Connect() throws Exception {
if(cn == null)
{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new Exception("Driver not found");
        }

        String connectionUrl = "jdbc:mysql://localhost:3306/store";

        cn = DriverManager.getConnection(connectionUrl, "root", "");

        System.out.println("Connected: " + cn);

    }
    }
     public void disconnect() {
        if (cn != null) {
            try {
                cn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
