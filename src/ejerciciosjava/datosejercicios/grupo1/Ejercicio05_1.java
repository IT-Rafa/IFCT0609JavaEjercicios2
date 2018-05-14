/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 5 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio05_1 extends Ejercicio {

	//ATRIBUTOS
	private final double IVA = 21;
	//CONSTRUCTOR

	public Ejercicio05_1() {
		super(
				5,
				1,
				"Ej. 5 Correspondencia ASCII",
				"EJERCICIO BÁSICO 5\n\n"
				+ "Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.\n"
				+ "Por ejemplo: si introduzco un 97, me muestre una a.");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		int cod = Integer.parseInt(JOptionPane.showInputDialog("Introduce el código: "));
		JOptionPane.showMessageDialog(null, "El caracter correspondiente es : "
				+ Character.getName(cod) + "\n\tEs decir: " + (char) cod);
	}

	@Override
	public void EjecutaCli() {
		Scanner leer;
		leer = new Scanner(System.in);
		System.out.print("Introduce el código: ");
		int cod = leer.nextInt();
		System.out.print("El caracter correspondiente es : "
				+ Character.getName(cod) + "\n\tEs decir: " + (char) cod);

	}

	//METODOS PUBLICOS
}
