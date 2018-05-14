/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 2 del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio02_1 extends Ejercicio{

	//ATRIBUTOS
    private int n1;
    private int n2;
	//CONSTRUCTOR

	public Ejercicio02_1() {
		super(
				2,
				1,
				"Ej. 2 Varias operaciones entre 2 números",
				"EJERCICIO BÁSICO 3\n\n"
						+ "Declara dos variables numéricas (con el valor que desees),"
						+ " muestra por consola\n"
						+ " la suma, resta, multiplicación, división y módulo (resto de la división).");
	}

	//GETTER && SETTER
    private void setN1(int n1) {
        this.n1 = n1;
    }

    private void setN2(int n2) {
        this.n2 = n2;
    }
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		
		Scanner leer;
		leer = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		setN1(leer.nextInt());
		System.out.print("Introduce el segundo número: ");
		setN2(leer.nextInt());
 		System.out.print(calculos());
	}

	@Override
	public void EjecutaCli() {
		setN1(Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: ")));
        setN2 (Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: ")));
        JOptionPane.showMessageDialog(null, calculos());
	}

	//METODOS PRIVADOS
    private String calculos() {
        return (n1 + " + " + n2 + " = " + (n1 + n2) + "\n" + n1 + " - " + n2 + " = " + (n1 - n2) + "\n"
                + n1 + " x " + n2 + " = " + (n1 * n2) + "\n" + n1 + " / " + n2 + " = " + (n1 / n2) + " con resto " + (n1 % n2) + "\n");
    }


}
