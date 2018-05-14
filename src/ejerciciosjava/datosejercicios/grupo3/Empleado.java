/* 
 * {Insert package description here}
 */
package ejerciciosjava.datosejercicios.grupo3;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Empleado extends Persona {
	//ATRIBUTOS
    private static int ultimoId = 1;
    private int idEmpleado;
    private String categoria;
	//CONSTRUCTOR
    public Empleado(String categoria, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.idEmpleado = ultimoId++;
        this.categoria = categoria;
    }
	//GETTER && SETTER
    public static int getLastId() {
        return ultimoId;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

	//METODOS PUBLICOS
    public boolean isFijo(){return true;}
	

}
