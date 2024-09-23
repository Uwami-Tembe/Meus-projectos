
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionDAO {

    public static Connection connectDB(){
        Connection con = null;
        
        try {
           String url ="jdbc:mysql://localhost:3306/funcionarios?user=root&password=";
           con=DriverManager.getConnection(url);
        } 
        
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ConnectionDAO: "+e.getMessage());
        }
        return con;
    }
}
