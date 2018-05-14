/* 
 * {Insert package description here}
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4.usuarios;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Usuario {
	//ATRIBUTOS

	private String nombre;
	private String password;
	private Boolean admin;
			
	//CONSTRUCTOR

	//GETTER && SETTER
	public String getNombre(){
		return this.nombre;
	}
	//METODOS HEREDADOS
	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS

	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
		this.admin = false;
	}
	
	public Usuario(String nombre, String password, Boolean admin) {
		this.nombre = nombre;
		this.password = password;
		this.admin = admin;
	}
}
