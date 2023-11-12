package datos;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.departamentos;


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
                 departamentosObj = new departamentos(rs.getInt("id_edif"), rs.getString("nombre"),
                         rs.getString("calle"), rs.getInt("numero"), rs.getString("barrio"), rs.getInt("id_depto"), rs.getString("propietario"),
                 rs.getString("inquilino"), rs.getInt("piso"), rs.getString("letra"), rs.getInt("gastos")); 
                 lista.add(departamentosObj);
            }
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
            String SSQL = "INSERT INTO departamentos (id_edif, nombre, calle, numero, barrio, propietario, inquilino, piso, letra, gastos ) VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, departamentosObj.getEdifID());
            ps.setString(2, departamentosObj.getNombre());
            ps.setString(3, departamentosObj.getCalle());
            ps.setInt(4, departamentosObj.getNumero());
            ps.setString(5, departamentosObj.getBarrio());
            //ps.setInt(6, departamentosObj.getDeptoID());
            ps.setString(6, departamentosObj.getPropietario());
            ps.setString(7, departamentosObj.getInquilino());
            ps.setInt(8, departamentosObj.getPiso());
            ps.setString(9, departamentosObj.getLetra());
            ps.setInt(10, departamentosObj.getGastos());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }

    @Override
    public void modificar(Object obj) {
        try {
            departamentosObj = (departamentos) obj;
            String SSQL = "UPDATE departamentos SET id_edif=?, nombre=?, calle=?, numero=?, barrio=?, propietario=?, inquilino=?, piso=?, letra=?, gastos=? WHERE ID_Depto=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(1, departamentosObj.getEdifID());
            ps.setString(2, departamentosObj.getNombre());
            ps.setString(3, departamentosObj.getCalle());
            ps.setInt(4, departamentosObj.getNumero());
            ps.setString(5, departamentosObj.getBarrio());
            ps.setString(7, departamentosObj.getPropietario());
            ps.setString(8, departamentosObj.getInquilino());
            ps.setInt(9, departamentosObj.getPiso());
            ps.setString(10, departamentosObj.getLetra());
            ps.setInt(11, departamentosObj.getGastos());
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        
        }

    @Override
    public void eliminar(Object obj) {
        try {
            departamentosObj = (departamentos) obj;
            String SSQL = "DELETE FROM departamentos WHERE ID_Depto=?";
            ps = con.prepareStatement(SSQL);
            ps.setInt(6, departamentosObj.getDeptoID());
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        }
}
