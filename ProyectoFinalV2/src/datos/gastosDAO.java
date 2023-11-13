
package datos;

import java.util.ArrayList;
import java.sql.*;
import javax.swing.JOptionPane;
import modelo.gastos;

public class gastosDAO implements IDAO{

    Connection con = null;
        ArrayList<gastos> lista2 = new ArrayList();
        gastos gastosObj;
        PreparedStatement ps;
        
        public gastosDAO(){
        con = new Conexion().conectar();
        }
    
        
        @Override
    public ArrayList listar(String condicion) {
        try {
        String SSQL = "SELECT * FROM gastoss " + condicion;
        ps = con.prepareStatement(SSQL);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
        gastosObj = new gastos (rs.getInt("id_gastos"), rs.getDouble("gastos"), rs.getString("comentarios"));
        }
        lista2.add(gastosObj);
        return lista2;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
    }

    @Override
    public void insertar(Object obj) {
        try {
        gastosObj = (gastos) obj;
        String SSQL = "INSERT INTO gastoss (id_gastos, gastos, comentarios) VALUES (?, ?, ?)";
        ps = con.prepareStatement(SSQL);
        ps.setInt(1, gastosObj.getGastosID());
        ps.setDouble(2, gastosObj.getGastos());
        ps.setString(3, gastosObj.getComentarios());
        
        ps.executeQuery();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    @Override
    public void modificar(Object obj) {
        try {
        gastosObj = (gastos) obj;
        String SSQL = "UPDATE gastoss SET gastos=?, comentarios=? WHERE id_gastos=?";
        ps = con.prepareStatement(SSQL);
        ps.setDouble(1, gastosObj.getGastos());
        ps.setString(2, gastosObj.getComentarios());
        
        ps.executeUpdate();
        }
        catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                }
        }

    @Override
    public void eliminar(Object obj) {
        try {
        gastosObj = (gastos) obj;
        String SSQL = "DELETE FROM gastoss WHERE id_gastos=?";
        ps = con.prepareStatement(SSQL);
        ps.setInt(1, gastosObj.getGastosID());
        ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
}
