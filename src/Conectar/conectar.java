
package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conectar {
    Connection conectar=null;

    
    public Connection conexion(){
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//              conectar=DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","");
            Class.forName("org.postgresql.Driver");
            conectar=DriverManager.getConnection("jdbc:postgresql://localhost:5432/sistema","postgres","1062313119");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return conectar;
    }
  
    
}
