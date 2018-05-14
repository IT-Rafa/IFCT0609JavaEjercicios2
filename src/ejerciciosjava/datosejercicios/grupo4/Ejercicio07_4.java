/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo4;

import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 7 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio07_4 extends Ejercicio {

	//ATRIBUTOS
	//CONSTRUCTOR
	public Ejercicio07_4() {
		super(
				7,
				4,
				"Ej. 7 Abrir ventana desde ventana",
				"EJERCICIO 7 SWING\n\n"
				+ "Aplicación gráfica con los siguentes elementos:\n"
				+ " - 1 título: Datos Alumno\n"
				+ " - 3 Etiquetas (nombre, Apellidos, Sexo)\n"
				+ " - 2 jTextField (nombre, apellidos)\n"
				+ " - 2 radiobutton (M, H)\n"
				+ " - 2 Botones (Continuar, Salir)\n\n"
				+ "El comportamiento será el siguiente:\n"
				+ " - Al pulsar botón salir, finaliza programa\n"
				+ " - Al pulsar cualquier checkbox, se desmarca el otro\n"
				+ " - Al pulsar botón enviar abre otra ventana con el"
				+ " siguiente contenido:\n"
				+ "  - 1 Texto (Datos enviados !!!)\n"
				+ "  - 2 botones (Volver, Cerrar)\n"
				+ "El botón Volver cierra esta ventana y el botón salir cierra la aplicación"
				+ "\n\n (Ver carpeta enunciados para ver enunciados originales)");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		VentanaEj7 inicio = new VentanaEj7();
		inicio.setVisible(true);
	}

	@Override
	public void EjecutaCli() {
		System.out.println("Ejecucion en consola del ejercicio 7 del grupo 4");
	}

	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
