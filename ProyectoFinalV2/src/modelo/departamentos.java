
package modelo;

//departamentos ahora es un clase abstracta y sirve como padre de otras clases
public class departamentos  {

    private Integer deptoID;
    private String propietario;
    private String inquilino;
    private Integer piso;
    private String letra;
    private Double expensas;
    
    
    public departamentos(Integer deptoID, String propietario, String inquilino, Integer piso, String letra, Double expensas) {
        this.deptoID = deptoID;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.piso = piso;
        this.letra = letra;
        this.expensas = expensas;
        
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

    public Double getExpensas() {
        return expensas;
    }

    public void setExpensas(Double expensas) {
        this.expensas = expensas;
    }

   
    
    @Override
    public String toString() {
        return "departamentos{" + "deptoID=" + deptoID + ", propietario=" + propietario + ", inquilino=" + inquilino + ", piso=" + piso + ", letra=" + letra + ", expensas=" + expensas + '}';
    }
}

    
    
  

   
