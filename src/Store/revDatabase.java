/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class revDatabase extends connector {

    private Statement st;
    private ResultSet rs;
    private ArrayList<MainRev> rev;

    revDatabase() throws Exception {
        rev = new ArrayList<>();
    }

    ArrayList<MainRev> getRevdata() throws SQLException {
        st = cn.createStatement();

        try {

            String query = "select * from revenue";
            rs = st.executeQuery(query);

            while (rs.next()) {

                int month = rs.getInt("Month");
                double t_sell = rs.getDouble("TotalSell");
                double t_buy = rs.getInt("TotalBuy");
                double profit = rs.getDouble("Profit");
                double exp = rs.getDouble("Expense");
                MainRev e = new MainRev(month, t_sell, t_sell - t_buy - exp, t_buy, exp);
                rev.add(e);

            }

        } catch (Exception ex) {
            System.out.println("Error");

        }
        return rev;

    }

    int getsize() throws SQLException {
        st = cn.createStatement();
        int i = 0;
        try {

            String query = "select * from revenue";
            rs = st.executeQuery(query);

            while (rs.next()) {

                i++;
            }
        } catch (Exception ex) {
            System.out.println("Error");

        }
        return i;
    }

    void editRev(MainRev e) throws SQLException {
        String updateSql = "update revenue set TotalSell=? , Profit=? ,TotalBuy=? where Month=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setDouble(col++, e.t_sell);
        updateStatement.setDouble(col++, e.profit);
        updateStatement.setDouble(col++, e.t_buy);

        updateStatement.executeUpdate();

        updateStatement.close();

    }

    void editPurc(double t_buy, int month) throws SQLException {
        String updateSql = "update revenue set TotalBuy=? where Month=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setDouble(col++, t_buy);
        updateStatement.setInt(col++, month);
        updateStatement.executeUpdate();

        updateStatement.close();

    }

    void editSell(double t_sell, int month) throws SQLException {
        String updateSql = "update revenue set TotalSell=?  where Month=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setDouble(col++, t_sell);
        updateStatement.setInt(col++, month);

        updateStatement.executeUpdate();

        updateStatement.close();

    }

    void editExp(double exp, int month) throws SQLException {
        String updateSql = "update revenue set Expense=?  where Month=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setDouble(col++, exp);
        updateStatement.setInt(col++, month);

        updateStatement.executeUpdate();

        updateStatement.close();

    }
    
    void Insert(MainRev r) throws SQLException 
    {
    
    String insertSql = "insert into revenue(TotalSell,TotalBuy,Expense) values (?,?,?)";
        PreparedStatement insertStatement = cn.prepareStatement(insertSql);

        int col = 1;

     
        insertStatement.setDouble(col++, r.t_sell);
        insertStatement.setDouble(col++, r.t_buy);
        insertStatement.setDouble(col++, r.expense);

        insertStatement.executeUpdate();

        insertStatement.close();
    
    }

}
