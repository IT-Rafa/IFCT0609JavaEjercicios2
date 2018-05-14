/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejerdcicio 6 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio12_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio12_4() {
		super(
				12,
				4,
				"Ej. 12 Suma pares, Serie, Fibonacci",
				"EJERCICIO SWING 12\n\n"
				+ "Aplicación gráfica que pida un número N y según el botón pulsado muestre"
				+ " los siguientes resultados en un textArea.\n"
				+ " - Mostrar y sumar los N primeros números impares positivos\n"
				+ " - Mostrar y sumar los N primeros términos de la serie 1/2 + 1/4 + 1/6 +....\n"
				+ " - Mostrar y sumar los N primeros términos de la serie Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13\n"
				+ "    Explicación: Empieza por 0 y 1 y sigue con la suma de los dos números anteriores,\n"
				+ "    es decir 0, 1, (0+1)=1,(1+(0+1))=2,...\n\n"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj6 inicio = new VentanaEj6();
		inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejerdcicio 6 del grupo 4");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
