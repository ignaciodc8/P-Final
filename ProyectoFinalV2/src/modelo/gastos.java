
package modelo;


public class gastos {
    
    private Integer gastosID;
    private Double gastos;
    private String comentarios;
    

    public gastos(Integer gastosID, Double gastos, String comentarios) {
        
        this.gastosID = gastosID;
        this.gastos = gastos;
        this.comentarios = comentarios;
    }

    public Integer getGastosID() {
        return gastosID;
    }

    public void setGastosID(Integer gastosID) {
        this.gastosID = gastosID;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return " - gastos{" + "gastosID=" + gastosID + ", gastos=" + gastos + ", comentarios=" + comentarios + '}';
    }
    
    
}
