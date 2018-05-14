/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 4 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio04_1 extends Ejercicio{

	//ATRIBUTOS

	//CONSTRUCTOR

	public Ejercicio04_1() {
		super(
				4,
				1,
				"Ej. 4 Área de un círculo",
				"EJERCICIO BÁSICO 4\n\n"
						+ "Haz una aplicación que calcule el área de un círculo(pi*R2)."
						+ " El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble)."
						+ " Usa la constante PI y el método pow de Math.");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
        double radio=Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: "));
        JOptionPane.showMessageDialog(null, area(radio));
	}

	@Override
	public void EjecutaCli() {
		Scanner leer;
		leer = new Scanner(System.in);
		System.out.print("Introduce el radio: ");
        double radio=leer.nextDouble();
		System.out.print(area(radio));
	}

	//METODOS PRIVADOS
    private String area(double radio) {
        DecimalFormat f = new DecimalFormat("#.00");
        return "El área es " + f.format(  Math.PI * Math.pow(radio, 2)  );
    }

}
