/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaAemet;


public class Estacion {
private int id;
private String nombre;
private double altitud;
private int provincia;
private double latitud;
private double longitud;
 
    public Estacion(){
        
    }
    public Estacion(int id, String nombre,double altitud,int provincia,double latitud,double longitud){
    
        this.id=id;
        this.nombre=nombre;
        this.altitud=altitud;
        this.provincia=provincia;
        this.latitud=latitud;
        this.longitud=longitud;
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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the altitud
     */
    public double getAltitud() {
        return altitud;
    }

    /**
     * @param altitud the altitud to set
     */
    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    /**
     * @return the provincia
     */
    public int getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(int provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the latitud
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * @param latitud the latitud to set
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    /**
     * @return the longitud
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * @param longitud the longitud to set
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
}
