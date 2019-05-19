/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaAemet;
/**
 *
 * @author sxntx
 */

public class Provincia {
  private int id;
  private String nombreProvincia;
    
  public Provincia(){
      
  }
  public Provincia(int id, String nombreProvincia){
      this.id=id;
      this.nombreProvincia=nombreProvincia;
  }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombreProvincia
     */
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    /**
     * @param nombreProvincia the nombreProvincia to set
     */
    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }
  
}
