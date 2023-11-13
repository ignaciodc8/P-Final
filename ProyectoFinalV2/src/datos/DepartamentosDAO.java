package datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.departamentos;
import modelo.gastos;


public class DepartamentosDAO implements IDAO{
    
    Connection con = null;
    ArrayList<departamentos> lista = new ArrayList<>();
    departamentos departamentosObj = null;
    PreparedStatement ps;
    
    public DepartamentosDAO() {
        con = new Conexion().conectar();
        
    }

    @Override
    public ArrayList listar(String condicion) {
        try {
            String SSQL = "SELECT * FROM departamentos " + condicion;
            ps = con.prepareStatement(SSQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                 departamentosObj = new departamentos(rs.getInt("id_depto"), rs.getString("propietario"), rs.getString("inquilino"), rs.getInt("piso"), rs.getString("letra"));
            
            lista.add(departamentosObj);}
            return lista;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return null;
        }

    @Override
    public void insertar(Object obj) {
        try {
            departamentosObj = (departamentos) obj;
            String SSQL = "INSERT INTO departamentos (propietario, inquilino, piso, letra) VALUES"
                    + "(?, ?, ?, ?)";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, departamentosObj.getPropietario());
            ps.setString(2, departamentosObj.getInquilino());
            ps.setInt(3, departamentosObj.getPiso());
            ps.setString(4, departamentosObj.getLetra());
            
            
            
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }

    @Override
    public void modificar(Object obj) {
        try {
            departamentosObj = (departamentos) obj;
            String SSQL = "UPDATE departamentos SET propietario=?, inquilino=?, piso=?, letra=? WHERE id_depto=?";
            ps = con.prepareStatement(SSQL);
            ps.setString(1, departamentosObj.getPropietario());
            ps.setString(2, departamentosObj.getInquilino());
            ps.setInt(3, departamentosObj.getPiso());
            ps.setString(4, departamentosObj.getLetra());
            ps.setInt(5, departamentosObj.getDeptoID());            
            
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        }

    @Override
    public void eliminar(Object obj) {
        try {
            departamentosObj = (departamentos) obj;
            String SSQL = "DELETE FROM departamentos WHERE id_Depto=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, departamentosObj.getDeptoID());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
}
