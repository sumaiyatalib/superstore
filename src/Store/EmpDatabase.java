package Store;


import Store.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmpDatabase extends connector {

    private Statement st;
    private ResultSet rs;
    private ArrayList<Employee> emp;

    EmpDatabase() throws Exception {
        emp = new ArrayList<>();
    }

    ArrayList<Employee> getEmpdata() throws SQLException {
         st = cn.createStatement();
         
        try {
           
            String query = "select * from employee";
            rs = st.executeQuery(query);

            while (rs.next()) {
                
               int id = rs.getInt("ID");
                String name = rs.getString("Name");
                String type = rs.getString("type");
                double salary = rs.getDouble("Salary");
                int Attendance = rs.getInt("Attendance");
                double bonus = rs.getDouble("Bonus");
                String Shift = rs.getString("Shift");
                Employee e = new Employee(name, Shift, type, Attendance, id, salary, bonus);
                emp.add(e);
                

            }
            return emp ;

        } catch (Exception ex) {
            System.out.println("Error");
            ex.printStackTrace();

        }

        return emp;

    }

    void editEmp(Employee e) throws SQLException {
        String updateSql = "update employee set name=?, shift=?,attendance=?,salary=? , Bonus=? ,Type=? where id=?";
        PreparedStatement updateStatement = cn.prepareStatement(updateSql);

        int col = 1;

        updateStatement.setString(col++, e.name);
        updateStatement.setString(col++, e.Shift);
        updateStatement.setInt(col++, e.Attendance);
        updateStatement.setDouble(col++, e.salary);
        updateStatement.setDouble(col++, e.bonus);
        updateStatement.setString(col++, e.type);

        updateStatement.executeUpdate();

        updateStatement.close();

    }

    void delete(Object row) throws SQLException {

        String deleteSql = "delete from employee where id=?";
        PreparedStatement deleteStatement = cn.prepareStatement(deleteSql);

        deleteStatement.setInt(1, (int) row);

        deleteStatement.executeUpdate();
        deleteStatement.close();
    }

    void insert(Employee e) throws SQLException
    {
        String insertSql = "insert into employee(name,shift,attendance,salary,bonus,type) values (?,?,?,?,?,?)";
        PreparedStatement insertStatement = cn.prepareStatement(insertSql);
        
         int col = 1;
        
        insertStatement.setString(col++, e.name);
        insertStatement.setString(col++, e.Shift);
        insertStatement.setInt(col++, e.Attendance);
        insertStatement.setDouble(col++, e.salary);
        insertStatement.setDouble(col++, e.bonus);
        insertStatement.setString(col++, e.type);
       
        insertStatement.executeUpdate();

        insertStatement.close();
    
    
    }

    
    
}
