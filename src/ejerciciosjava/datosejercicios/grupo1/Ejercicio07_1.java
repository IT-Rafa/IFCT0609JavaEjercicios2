/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 7 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio07_1 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio07_1() {
		super(
				7,
				1,
				"Ej. 7 Números divisibles por 2 y 3",
				"EJERCICIO BÁSICO 7\n\n"
						+ "Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		JOptionPane.showMessageDialog(null,"Estos son los números del divisibles entre 2 y 3, hasta 100:\n" + divisibles2y3() );
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Estos son los números del divisibles entre 2 y 3, hasta 100:\n" + divisibles2y3());
	}

	//METODOS PRIVADOS
	private String divisibles2y3(){
	        String st="";
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                st+=(i + " ");
            }
        }
		return st;
	}

}
