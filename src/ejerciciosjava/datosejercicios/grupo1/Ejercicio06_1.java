/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejerdcicio 6 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio06_1 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio06_1() {
		super(
				6,
				1,
				"Ej. 6 Precio con IVA",
				"EJERCICIO BÁSICO 6\n\n"
						+ "Lee un número por teclado que pida el precio de un producto"
						+ " (puede tener decimales) y calcule el precio final con IVA."
						+ "\n El IVA sera una constante que sera del 21%");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejerdcicio 6 del grupo 1");
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejerdcicio 6 del grupo 1");
	}
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
