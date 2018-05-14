/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 3del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio03_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio03_4() {
		super(
				3,
				4,
				"Ej. 3 Área triángulo con fórmula Herón",
				"EJERCICIO 3 SWING\n\n"
				+ "Programar aplicación gráfica que al recibir los tres lados de un "
				+ "triángulo, calcule y muestre su área aplicando la siguiente fórmula:\n"
				+ "Área = Raíz cuadrada( aux * (aux-lado1)*(aux-lado2)*(aux-lado3) )"
				+ "semiperímetro = Aux = (lado1+lado2+lado3) /2"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj3 inicio = new VentanaEj3();
		inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejercicio Swing: Solo de Ventanas");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
