
package datos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


//conexion base de datos
public class Conexion {
    
    private String db = "proyectofinal2"; 
    private String url = "jdbc:mysql://localhost:3306/" + db; // contiene la ruta de acceso a la base de datos
    private String user = "root";
    private String pass = "";
    private String driver = "com.mysql.cj.jdbc.Driver"; 
    
    public Connection conectar() {
    
        try {
            Connection link = null;
            Class.forName(driver);
            link = DriverManager.getConnection(url, user, pass);
            return link;
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }
    
    
}
