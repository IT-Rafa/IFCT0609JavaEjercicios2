/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

/**
 *
 * @author Sistemas
 */
public class Direccion {
    //ATRIBUTOS
    private TiposCalle tipoCalle;
    private String nombreCalle;
    private String numEdif;
    private String piso;
    private String puerta;
    private String codigoPostal;
    
    //CONSTRUCTORES
    public Direccion(){
        
    }
    
    public Direccion(TiposCalle tipoCalle, String nombreCalle, String numEdif, String Piso, String Puerta, String CodigoPostal) {
        this.tipoCalle = tipoCalle;
        this.nombreCalle = nombreCalle;
        this.numEdif = numEdif;
        this.piso = Piso;
        this.puerta = Puerta;
        this.codigoPostal = CodigoPostal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String CodigoPostal) {
        this.codigoPostal = CodigoPostal;
    }


    public TiposCalle getTipoCalle() {
        return tipoCalle;
    }

    public void setTipoCalle(TiposCalle tipoCalle) {
        this.tipoCalle = tipoCalle;
    }

    public String getNombreCalle() {
        return nombreCalle;
    }

    public void setNombreCalle(String nombreCalle) {
        this.nombreCalle = nombreCalle;
    }

    public String getNumEdif() {
        return numEdif;
    }

    public void setNumEdif(String numEdif) {
        this.numEdif = numEdif;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

	@Override
	public String toString() {
		return  getTipoCalle() +" "+ getNombreCalle()
                    + ", nº: "+ getNumEdif() + " ;Piso: " + getPiso()
                    + " ;Puerta: "+getPuerta() + " ; Codigo Postal: "+ getCodigoPostal();
	}
    

}
