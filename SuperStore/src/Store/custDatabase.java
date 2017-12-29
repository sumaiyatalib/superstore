/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tcuslate file, choose Tools | Tcuslates
 * and open the tcuslate in the editor.
 */
package Store;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hii
 */
public class custDatabase extends connector {

    private Statement st;
    private ResultSet rs;
 
    private ArrayList<customer> cus;

    custDatabase() throws Exception {
        cus = new ArrayList<>();
    }
    
    int getLastID() throws SQLException
    {
     st = cn.createStatement();
          int lastid = 0 ;
        try {

            String query = "select Reciept_no from customer";
            rs = st.executeQuery(query);
         while(rs.next())
            lastid = rs.getInt("Reciept_no");
         
            return lastid ;
        }
        catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();

        }
     
         return lastid ;
    }

    ArrayList<customer> getCustdata() throws SQLException {
        st = cn.createStatement();
        
        try {

            String query = "select * from customer";
            rs = st.executeQuery(query);

           
            while (rs.next()) {

                int Recipt_no = rs.getInt("Reciept_no");
                String Time = (rs.getString("Time"));
                double T_amount = (rs.getDouble("T_amount"));
                double Discount = (rs.getDouble("Discount"));
                String Pay_way = (rs.getString("Pay_way"));
                String type = rs.getString("type");
                cus.add(new customer(Pay_way, Time, type, T_amount, Discount, Recipt_no));
               
            }

        } catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();

        }

        return cus;

    }

    void editEmp(customer c) throws SQLException {
        String updateSql = "update customer set Pay_way=?, Time=?,T_amount=?,Discount=? where Reciept_no=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setString(col++, c.pay_way);
        updateStatement.setString(col++, c.time);
        updateStatement.setDouble(col++, c.t_amount);
        updateStatement.setDouble(col++, c.discount);

        updateStatement.executeUpdate();

        updateStatement.close();

    }

    void delete(Object row) throws SQLException {

        String deleteSql = "delete from persons where id=?";
        PreparedStatement deleteStatement = cn.prepareStatement(deleteSql);

        deleteStatement.setInt(1, (int) row);

        deleteStatement.executeUpdate();
        deleteStatement.close();
    }

    void insert(customer c) throws SQLException {

        String insertSql = "insert into customer(Pay_way,Time,T_amount,Discount,type) values (?,?,?,?,?)";
        PreparedStatement insertStatement = cn.prepareStatement(insertSql);

        int col = 1;
        
        insertStatement.setString(col++, c.pay_way);
        insertStatement.setString(col++, c.time);
        insertStatement.setDouble(col++, c.t_amount);
        insertStatement.setDouble(col++, c.discount);
        insertStatement.setString(col++, c.type);
        
        insertStatement.executeUpdate();

        insertStatement.close();

    }
}
