
package modelo;


public abstract class Edificios {

    private int edifID;
    private String nombre;
    private String calle;
    private int numero;
    private String barrio;

    public Edificios(int edifID, String nombre, String calle, int numero, String barrio) {
        this.edifID = edifID;
        this.nombre = nombre;
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    public int getEdifID() {
        return edifID;
    }

    public void setEdifID(int edifID) {
        this.edifID = edifID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Edificios{" + "edifID=" + edifID + ", nombre=" + nombre + ", calle=" + calle + ", numero=" + numero + ", barrio=" + barrio + '}';
    }
           
}
