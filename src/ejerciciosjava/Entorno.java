/*
 * Este paquete contiene todas las clases que se usan para mostrar y ejecutar
 * los ejercicios y exámenes hechos en el curso para certificado de
 * profesionalidad IFCT0609
 */
package ejerciciosjava;

import javax.swing.JOptionPane;

/**
 * Opciones posibles de entorno
 *
 * @author Expression USER_ID is undefined on line 10, column 14 in
 * Templates/Classes/Enum.java.
 */
public enum Entorno {
	//OPCIONES
	GUI("ventana") {
		@Override
		public void mostrar(String info) {
			JOptionPane.showMessageDialog(null, info);

		}
	},
	CLI("consola") {
		@Override
		public  void mostrar(String info) {
			System.out.print(info);

		}
	};
	//ATRIBUTOS
	private final String formato;
	//CONSTRUCTOR

	Entorno(String formato) {
		this.formato = formato;
	}

	//GETTER SETTER
	public String getFormato() {
		return this.formato;
	}
	//METODOS ABSTRACTOS - implantados arriba con cada opción

	public abstract void mostrar(String info);

	//MAIN PARA TESTEO
	public static void main(String[] args) {
		System.out.println("Los valores posibles son: ");

		
		        Entorno todosEntornos[] = Entorno.values();
 
        // enum con bucle
        for (Entorno entorno : todosEntornos){
		test(entorno);
		}
	}

	private static void test(Entorno entorno) {
		System.out.println(" -" + entorno.toString());
		System.out.println("   Los datos saldrán por " + entorno.getFormato());
	}
}
