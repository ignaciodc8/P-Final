
package controlador;

import datos.IDAO;
import datos.gastosDAO;
import java.util.ArrayList;


public class GastosControl implements IDAO {

    @Override
    public ArrayList listar(String condicion) {
        return new gastosDAO().listar(condicion);
        }

    @Override
    public void insertar(Object obj) {
        new gastosDAO().insertar(obj);
    }

    @Override
    public void modificar(Object obj) {
        new gastosDAO().modificar(obj);
         }

    @Override
    public void eliminar(Object obj) {
        new gastosDAO().eliminar(obj);
       }
    
}
