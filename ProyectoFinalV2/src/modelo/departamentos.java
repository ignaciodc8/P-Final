
package modelo;

//departamentos ahora es un clase abstracta y sirve como padre de otras clases
public class departamentos  {

    private Integer deptoID;
    private String propietario;
    private String inquilino;
    private Integer piso;
    private String letra;
    
    
    public departamentos(Integer deptoID, String propietario, String inquilino, Integer piso, String letra) {
        this.deptoID = deptoID;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.piso = piso;
        this.letra = letra;
        
    }
    public Integer getDeptoID() {
        return deptoID;
    }

    public void setDeptoID(Integer deptoID) {
        this.deptoID = deptoID;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

   
    @Override
    public String toString() {
        return "departamentos{" + "deptoID=" + deptoID + ", propietario=" + propietario + ", inquilino=" + inquilino + ", piso=" + piso + ", letra=" + letra + '}';
    }
   

    
    
   /* public departamentos(int edifID, String nombre, String calle, int numero, String barrio, Integer deptoID, String propietario, String inquilino, int piso, String letra, int gastos) {
        super(edifID, nombre, calle, numero, barrio);
        this.deptoID = deptoID;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.piso = piso;
        this.letra = letra;
        this.gastos = gastos;
    }

    public Integer getDeptoID() {
        return deptoID;
    }

    public void setDeptoID(Integer deptoID) {
        this.deptoID = deptoID;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getInquilino() {
        return inquilino;
    }

    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getGastos() {
        return gastos;
    }

    public void setGastos(int gastos) {
        this.gastos = gastos;
    }

    @Override
    public String toString() {
        return super.toString() +  " - departamentos{" + "deptoID=" + deptoID + ", propietario=" + propietario + ", inquilino=" + inquilino + ", piso=" + piso + ", letra=" + letra + ", gastos=" + gastos + '}';
    } */

    

    
    

    
    
}
