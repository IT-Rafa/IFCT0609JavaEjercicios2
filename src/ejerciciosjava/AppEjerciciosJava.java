/*
 * Este paquete contiene todas las clases que se usan para mostrar y ejecutar
 * los ejercicios y exámenes hechos en el curso para certificado de
 * profesionalidad IFCT0609
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
package ejerciciosjava;

import ejerciciosjava.datosejercicios.Ejercicios;
import java.util.Scanner;

/**
 * Controla la ejecución inicial de la aplicación
 *
 * @version
 * @since
 *
 */
public class AppEjerciciosJava {

	//CONSTRUCTOR
	//GETTER && SETTER
	//METODOS HEREDADOS
	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
	/**
	 * Comprueba que los argumentos sean válidos. Si son válidos muestra el menú
	 * o ejercicio correspondiente Si no, muestra mensaje error por consola
	 *
	 * @param args argumentos de la línea de comandos opciones válidas [-GUI |
	 * -CLI] [-ej numEjercicio:int -grupo numGrupo:int]
	 */
	public static void main(String[] args) {
		Entorno entorno = Entorno.GUI;	// Indica el tipo de entorno donde se ejecutará
		int grupo = 0;				// grupo de ejercicios indicados en argumentos
		int ej = 0;					// Número de ejercicio indicado en argumentos
		boolean entornoSelect = false;
		boolean ejSelect = false;
		boolean grupoSelect = false;
		boolean isError = false;
		String formatoValido = "Formato válido: ejerciciosJava [-GUI | -CLI] [-ej numEjercicio:int -grupo numGrupo:int]";
		String opcion;
		Scanner leer = new Scanner(System.in);
		//control cantidad argumentos
		if (args.length == 0) {
			entornoSelect = true;
			ejSelect = true;
			grupoSelect = true;
		} else if (args.length > 5) {
			if (!isError) {
				System.out.println("Error. " + formatoValido);
				isError = true;
			}
			System.out.println("Demasiados argumentos");
		}
		//control de cada argumento
		for (int i = 0; i < args.length; i++) {
			//Control entorno
			if (args[i].equalsIgnoreCase("-gui")) {
				if (!entornoSelect) {
					entornoSelect = true;
					entorno = Entorno.GUI;
				} else {
					if (!isError) {
						System.out.println("Error. " + formatoValido);
						isError = true;
					}

					System.out.println("Entorno duplicado");
					entornoSelect = false;
				}
			} else if (args[i].equalsIgnoreCase("-cli")) {
				if (!entornoSelect) {
					entornoSelect = true;
					entorno = Entorno.CLI;
				} else {
					if (!isError) {
						System.out.println("Error. " + formatoValido);
						isError = true;
					}
					System.out.println("Entorno duplicado");
					entornoSelect = false;
				}//Control ejercicio
			} else if (args[i].equals("-e") || args[i].equals("--ejercicio")) {
				if (!ejSelect) {
					if (i + 1 < args.length && args[i + 1].matches("\\d+")) {
						ej = Integer.parseInt(args[i + 1]);
						ejSelect = true;
					}

				} else {
					if (!isError) {
						System.out.println("Error. " + formatoValido);
						isError = true;
					}
					System.out.println("Ejercicio duplicado");
				}//Control grupo
			} else if (args[i].equals("-g") || args[i].equals("--grupo")) {
				if (!grupoSelect) {
					if (i + 1 < args.length && args[i + 1].matches("\\d+")) {
						grupo = Integer.parseInt(args[i + 1]);
						grupoSelect = true;
					}
				} else {
					if (!isError) {
						System.out.println("Error. " + formatoValido);
						isError = true;
					}
					System.out.println("Grupo duplicado");
				}
			} else {
				if (!args[i].matches("\\d+")) {
					if (!isError) {
						System.out.println("Error. " + formatoValido);
						isError = true;
					}
					System.out.println("Argumento " + args[i] + " desconocido");
				}
			}

		}
		if (ejSelect ^ grupoSelect) {

			if (!isError) {
				System.out.println("Error. " + formatoValido);
			}
			if (ejSelect) {
				System.out.println("Falta por indicar el grupo");
			} else {
				System.out.println("Falta por indicar el ejercicio");
			}
		}

		//argumentos por defecto
		if (entornoSelect && args.length == 1) {
			ej = 0;
			grupo = 0;
			ejSelect = true;
			grupoSelect = true;
		} else if (ejSelect && grupoSelect && args.length == 4) {
			entorno = Entorno.GUI;
			entornoSelect = true;
		}

		if (entornoSelect && ejSelect && grupoSelect) {
			if (ej == 0 && grupo == 0) {
					if (entorno == Entorno.CLI) {
						new MenuCli().init();
					} else {
						new MenuGui().init();
					}
			} else {
				if (grupo >= Ejercicios.cantGrupos()) {
					System.out.println("Ese grupo no existe");
					System.out.println("El rango válido de grupos está entre 1 y " + (Ejercicios.cantGrupos() - 1));
				} else if (ej >= Ejercicios.cantEjByGrupo(grupo)) {
					System.out.println("Ese ejercicio no existe para ese grupo");
					System.out.println("El rango válido de ejercicios en el grupo "
							+ grupo + " está entre 1 y " + (Ejercicios.cantEjByGrupo(grupo) - 1));
				} else {
					if (entorno == Entorno.CLI) {
						Ejercicios.getEj(grupo, ej).EjecutaCli();
						new MenuCli().init();
					} else {
						Ejercicios.getEj(grupo, ej).EjecutaCli();
						new MenuCli().init();
					}

				}

			}
		}

	}

}
