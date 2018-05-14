/* 
 * {Insert package description here}
 */
package ejerciciosjava;

import ejerciciosjava.datosejercicios.Ejercicios;
import java.util.Scanner;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class MenuCli {
	//ATRIBUTOS

	//CONSTRUCTOR
	//GETTER && SETTER
	//METODOS HEREDADOS
	//METODOS PUBLICOS
	public void init() {
		int opGrupo;
		int ej;
		do {
			opGrupo = showMenu();
			if (opGrupo == 0) {
				System.out.println("\nFin del programa");
			} else if (opGrupo >= Ejercicios.cantGrupos()) {
				System.out.println("Grupo no válido");
			} else {
				do {
					ej = showSubMenuEjGrupo(opGrupo);
					if (ej == 0) {
						System.out.println("Volvemos al menú principal.");
					} else if (ej >= Ejercicios.cantEjByGrupo(opGrupo)) {
						System.out.println("Ejercicio no válido");
					} else {
						System.out.println("Vamos a ejecutar en consola el ejercicio " + ej + " del grupo " + opGrupo);
						Ejercicios.getEj(opGrupo, ej).EjecutaCli();
					}

				} while (ej != 0);
			}

		} while (opGrupo != 0);
	}

	//METODOS PRIVADOS
	private int showMenu() {
		String grupo;
		Scanner leer = new Scanner(System.in);
		System.out.println("Grupos de ejercicios: ");
		for (String unGrupo : Ejercicios.getListadoGrupos()) {
			System.out.println("  " + unGrupo);
		}
		System.out.println("  0. SALIR.");
		System.out.print("\nElige un grupo: ");
		grupo = leer.next();
		if (grupo.matches("\\d+")) {
			return Integer.parseInt(grupo);
		} else {
			return Ejercicios.VALORNULO;
		}
	}

	private int showSubMenuEjGrupo(int grupo) {
		String ej;
		String[] listaEnum = Ejercicios.getListaEnunCortoByGroup(grupo);
		Scanner leer = new Scanner(System.in);
		System.out.println("Grupos de ejercicios: ");
		for (int i = 1; i < listaEnum.length; i++) {
			System.out.println("  " + listaEnum[i]);
		}
		System.out.println("  0. SALIR.");
		System.out.print("\nElige un ejercicio: ");
		ej = leer.next();
		if (ej.matches("\\d+")) {
			return Integer.parseInt(ej);

		} else {
			return Ejercicios.VALORNULO;
		}
	}
	//METODOS ESTÁTICOS
}
