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
public class Contacto {
    //ATRIBUTOS
    private TipoContacto tipo;
    private String desc;
    
    //CONSTRUCTORES
    public Contacto() {
        this.tipo = null;
        this.desc = "";
    }
    public Contacto(TipoContacto tipo, String desc) {
        this.tipo = tipo;
        this.desc = desc;
    }
    //GETTER & SETTER

    public TipoContacto getTipo() {
        return tipo;
    }

    public void setTipo(TipoContacto tipo) {
        this.tipo = tipo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

	@Override
	public String toString() {
		return getTipo() +": "+ getDesc();
	}
    
}

