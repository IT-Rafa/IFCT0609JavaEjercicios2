/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo1;

import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Describe y implanta el ejercicio 3del grupo 1
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio03_1 extends Ejercicio{

	//ATRIBUTOS
    private int n1;
    private int n2;
	//CONSTRUCTOR

	public Ejercicio03_1() {
		super(
				3,
				1,
				"Ej. 3 Compara 2 números",
				"EJERCICIO BÁSICO 3\n\n"
						+ "Indica cual es mayor de los dos. Si son iguales indicarlo también."
						+ "\nVe cambiando los valores para comprobar que funciona.");
	}

	//GETTER && SETTER
	    public void setN1(int n1) {
        this.n1 = n1;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
        setN1(Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: ")));
        setN2(Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: ")));
        JOptionPane.showMessageDialog(null, compara());
	}

	@Override
	public void EjecutaCli() {
		Scanner leer;
		leer = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		setN1(leer.nextInt());
		System.out.print("Introduce el segundo número: ");
		setN2(leer.nextInt());
 		System.out.print(compara());
	}
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

    public String compara() {
        if (n1 == n2) {
            return "Son iguales";
        } else {
            return "El mayor de los dos números es el " + Math.max(n2, n1);
        }
    }

}
