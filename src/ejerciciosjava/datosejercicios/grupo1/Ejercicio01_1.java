/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 1 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio01_1 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio01_1() {
		super(
				1,
				1,
				"Ej. 1 Bienvenida con nombre",
				"EJERCICIOS BASICO 1\n\n"
				+ "Declara un String que contenga tu nombre, "
				+ "después muestra un mensaje de bienvenida por consola.\n"
				+ "Por ejemplo: si introduzco \"Fernando\", me aparezca: "
				+ "\"Bienvenido, Fernando.\"");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {

		String st = JOptionPane.showInputDialog("Introduce tu nombre: ");
		JOptionPane.showMessageDialog(null, creaMensaje(st));

	}

	@Override
	public void EjecutaCli() {
		Scanner leer;
		leer = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String st = leer.next();
		System.out.println(creaMensaje(st));
	}

	//METODOS PRIVADOS
	private String creaMensaje(String nombre) {
		if (nombre.equals(null) || nombre.isEmpty()) {
			return "Pues no te saludo, hala..";
		} else {
			return "Bienvenido, " + nombre + ".";
		}
	}
	//METODOS ESTÁTICOS
}
