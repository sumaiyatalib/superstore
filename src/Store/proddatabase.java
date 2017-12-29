/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this tprolate file, choose Tools | Tprolates
 * and open the tprolate in the editor.
 */
package Store;

import Store.Product;
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
public class proddatabase extends connector {

    private Statement st;
    private ResultSet rs;
    private ArrayList<Product> pro;

    proddatabase() throws Exception {
        pro = new ArrayList<>();
    }

    ArrayList<Product> getProdata() throws SQLException {

        st = cn.createStatement();
        try {
            String query = "select * from product";
            rs = st.executeQuery(query);

            int i = 0;
            while (rs.next()) {

                int ID = (rs.getInt("ID"));
                String Name = (rs.getString("Name"));
                double price = (rs.getDouble("Price"));
                int stock = (rs.getInt("Stock"));
                String subtype = (rs.getString("SubType"));
                String type = (rs.getString("Type"));
                Product p = new Product(Name, stock, ID, price, type, subtype);
                pro.add(p);

            }

        } catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();
        }
        rs.close();
        return pro;

    }

    void editPro(Product p) throws SQLException {
        String updateSql = "update product set Name=? , Type= ? , Price=? ,Stock=? , SubType=? where id=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setString(col++, p.getName());
        updateStatement.setString(col++, p.getType());
        updateStatement.setDouble(col++, p.getPrice());
        updateStatement.setInt(col++, p.getStock());
        updateStatement.setString(col++, p.getSubtype());
        updateStatement.setInt(col++, p.getId());

        updateStatement.executeUpdate();

        updateStatement.close();

    }
    void editPrice(double price, int id) throws SQLException
    {
    
    String updateSql = "update product set Price=? where id=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;
        
        updateStatement.setDouble(col++, price);
         updateStatement.setInt(col++, id);

         updateStatement.executeUpdate();

        updateStatement.close();

    
    
    }
      void editQuan(int q,int id) throws SQLException
    {
    
    String updateSql = "update product set Stock=? where id=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;
        
         updateStatement.setInt(col++, q);
         updateStatement.setInt(col++, id);
         updateStatement.executeUpdate();

        updateStatement.close();

    
    
    }

    void delete(Object row) throws SQLException {

        String deleteSql = "delete from product where id=?";
        PreparedStatement deleteStatement = cn.prepareStatement(deleteSql);

        deleteStatement.setInt(1, (int) row);

        deleteStatement.executeUpdate();
        deleteStatement.close();
    }

    void insert(Product p) throws SQLException {
        String insertSql = "insert into product(Name, Type, Price,Stock, SubType) values (?,?,?,?,?)";
        PreparedStatement insertStatement = cn.prepareStatement(insertSql);

        int col = 1;

        insertStatement.setString(col++, p.getName());
        insertStatement.setString(col++, p.getType());
        insertStatement.setDouble(col++, p.getPrice());
        insertStatement.setInt(col++, p.getStock());
        insertStatement.setString(col++, p.getSubtype());


        insertStatement.executeUpdate();

        insertStatement.close();

    }

}
