/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios;

/**
 * Clase abstracta que define los atributos comunes de todos los ejercicios
 *
 * @version 0
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public abstract class Ejercicio {
	//ATRIBUTOS
    private int grupo=0;
    private int ej=0;
    private String enunCorto="";
    private String enunLargo="";
	//CONSTRUCTOR
    public Ejercicio(int grupo, int ej, String enunCorto, String enunLargo){
	this.grupo=grupo;
	this.ej=ej;
	this.enunCorto=enunCorto;
	this.enunLargo=enunLargo;
    }
	//GETTER && SETTER
    public int getGrupo(){
	return this.grupo;
    }
    public int getEj(){
	return this.ej;
    }
    public String getEnunCorto(){
	return this.enunCorto;
    }
    public String getEnunLargo(){
	return this.enunLargo;
    }
	//METODOS HEREDADOS
    public abstract void EjecutaGui();
    public abstract void EjecutaCli();
}
