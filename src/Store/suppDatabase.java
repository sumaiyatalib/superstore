/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tsuplate file, choose Tools | Tsuplates
 * and open the tsuplate in the editor.
 */
package Store;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hii
 */
public class suppDatabase extends connector {

    private Statement st;
    private ResultSet rs;
    private ArrayList<Suppliers> sup;

    suppDatabase() throws Exception {
        sup = new ArrayList<>();
    }

    ArrayList<Suppliers> getEmpdata() throws SQLException {
        st = cn.createStatement();

        try {

            String query = "select * from supplier";
            rs = st.executeQuery(query);

            while (rs.next()) {

                
                String name = rs.getString("Name");
                String date = rs.getString("Date_ord");
                double Price = rs.getDouble("Price");
                int Ord_no = rs.getInt("Order_no");
                String product = rs.getString("Prodname");
                int stock = rs.getInt("Stocks");
                Suppliers e = new Suppliers(date, name, product, Price, Ord_no, stock);
                sup.add(e);

            }
            return sup;

        } catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();

        }

        return sup;

    }

    void editEmp(Suppliers s) throws SQLException {
        String updateSql = "update supplier set name=? , Date_ord=? ,Stocks=? , Prodname=? , Price = ? where Order_no=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setString(col++, s.Name);
        updateStatement.setString(col++, s.date_in);
        updateStatement.setInt(col++, s.stocks);
        updateStatement.setString(col++, s.prod_name);
        updateStatement.setDouble(col++, s.price);

        updateStatement.executeUpdate();

        updateStatement.close();

    }

    void delete(Object row) throws SQLException {

        String deleteSql = "delete from supplier where Order_no=?";
        PreparedStatement deleteStatement = cn.prepareStatement(deleteSql);

        deleteStatement.setInt(1, (int) row);

        deleteStatement.executeUpdate();
        deleteStatement.close();
    }

    void insert(Suppliers s) throws SQLException {
        String insertSql = "insert into supplier(Name, Date_ord,Stocks ,Prodname, Price ) values (?,?,?,?,?)";
        PreparedStatement insertStatement = cn.prepareStatement(insertSql);

        int col = 1;

        insertStatement.setString(col++, s.Name);
        insertStatement.setString(col++, s.date_in);
        insertStatement.setInt(col++, s.stocks);
        insertStatement.setString(col++, s.prod_name);
        insertStatement.setDouble(col++, s.price);

        insertStatement.executeUpdate();

        insertStatement.close();

    }

}
