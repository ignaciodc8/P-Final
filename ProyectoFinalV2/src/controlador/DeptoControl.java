
package controlador;

import datos.DepartamentosDAO;
import datos.IDAO;
import java.util.ArrayList;

public class DeptoControl implements IDAO{

    @Override
    public ArrayList listar(String condicion) {
        return new DepartamentosDAO().listar(condicion);
        }

    @Override
    public void insertar(Object obj) {
        new DepartamentosDAO().insertar(obj);
       }

    @Override
    public void modificar(Object obj) {
        new DepartamentosDAO().modificar(obj);
        }

    @Override
    public void eliminar(Object obj) {
        new DepartamentosDAO().eliminar(obj);
        }
    
}
