/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 8 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio08_1 extends Ejercicio {

	//ATRIBUTOS
	private String contraseña = "";
	private boolean accesOK = false;
	//CONSTRUCTOR

	public Ejercicio08_1() {
		super(
				8,
				1,
				"Ej. 8 Pedir contraseña ",
				"EJERCICIO BÁSICO 8\n\n"
				+ "Escribe una aplicación con un String que contenga una contraseña cualquiera.\n"
				+ "Después se te pedirá que introduzcas la contraseña, con 3 intentos.\n"
				+ "Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo !!Enhorabuena!!.\n"
				+ "Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).");
	}

	//GETTER && SETTER
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getContraseña() {
		return this.contraseña;
	}

	public boolean isAccessOK() {
		return accesOK;
	}

	public void setAccesOK(boolean accesOK) {
		this.accesOK = accesOK;
	}

	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		//Si la contraseña está vacia, la pide
		if (getContraseña() == "") {
			setContraseña(JOptionPane.showInputDialog("Vamos a crear la contraseña: "));
			JOptionPane.showMessageDialog(null, "La contraseña es: " + getContraseña());
		}

		//Ahora pide la contraseña hasta que sea correcta o pases de 3 intentos
		//Si la contraseña está ok, te cambia el estado de isAccessOK
		String st = "";
		int intento = 0;
		do {
			st = JOptionPane.showInputDialog("Introduce la contraseña: ");
			System.out.println("El texto introducido es: " + st);
			if (st.equals(getContraseña())) {
				setAccesOK(true);
				System.out.println(isAccessOK());
			}

			intento++;

		} while (!isAccessOK() && (intento < 3));

		if (this.accesOK) {
			JOptionPane.showMessageDialog(null, "Puedes hacer cosas");
		} else {
			JOptionPane.showMessageDialog(null, "Se acabaron los intentos");
		}
		setAccesOK(false); //Despues de hacer lo que sea, se pierde el acceso

	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 8 del grupo 1");
	}

}
