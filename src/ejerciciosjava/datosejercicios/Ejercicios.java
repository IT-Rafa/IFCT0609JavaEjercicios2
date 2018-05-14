/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.grupo2.*;
import ejerciciosjava.datosejercicios.grupo3.*;
import ejerciciosjava.datosejercicios.grupo4.*;
import ejerciciosjava.datosejercicios.grupo5.*;

/**
 * Se encarga de crear los objetos Ejercicio y sirve como almacen para todos los
 * ejercicios y todos los datos que dependen de los mismos.
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public final class Ejercicios {

	//ATRIBUTOS
	private static final String[] LISTAGRUPOS = {
		"1. Basicos", "2. Boletin", "3. Clases", "4. Swing", "5. Guardar Datos"
	};
	public static final int VALORNULO=100;
	private static final Ejercicio[][] TODOSEJERCICIOS = {
		{//grupo0
			new Ejercicio0()
		},
		{//grupo1
			new Ejercicio0(),
			new Ejercicio01_1(),
			new Ejercicio02_1(),
			new Ejercicio03_1(),
			new Ejercicio04_1(),
			new Ejercicio05_1(),
			new Ejercicio06_1(),
			new Ejercicio07_1(),
			new Ejercicio08_1(),
			new Ejercicio09_1(),
			new Ejercicio10_1(),
			new Ejercicio11_1(),
			new Ejercicio12_1()
		},
		{//grupo2
			new Ejercicio0(),
			new Ejercicio01_2(),
			new Ejercicio02_2(),
			new Ejercicio03_2(),
			new Ejercicio04_2(),
			new Ejercicio05_2(),
			new Ejercicio06_2(),
			new Ejercicio07_2(),
			new Ejercicio08_2(),
			new Ejercicio09_2(),
			new Ejercicio10_2(),
			new Ejercicio11_2()
		},
		{//grupo3
			new Ejercicio0(),
			new Ejercicio01_3(),
			new Ejercicio02_3(),
			new Ejercicio03_3(),
			new Ejercicio04_3(),
			new Ejercicio05_3(),

		},
		{//grupo4 
			new Ejercicio0(),
			new Ejercicio01_4(),
			new Ejercicio02_4(),
			new Ejercicio03_4(),
			new Ejercicio04_4(),
			new Ejercicio05_4(),
			new Ejercicio07_4(),
			new Ejercicio08_4(),
			new Ejercicio09_4(),
			new Ejercicio10_4(),
			new Ejercicio11_4(),
			new Ejercicio12_4(),
			new Ejercicio13_4(),
			new Ejercicio14_4(),
			new Ejercicio15_4(),
			new Ejercicio16_4(),
			new Ejercicio17_4(),
			new Ejercicio18_4()
			
		},
		{//grupo5
			new Ejercicio0(),
			new Ejercicio01_5(),
			new Ejercicio02_5(),
			new Ejercicio03_5(),
			new Ejercicio04_5(),
			new Ejercicio05_5()
			
		}
		
	};
	//GETTER && SETTER

	public static Ejercicio[][] getEjercicios() {
		return TODOSEJERCICIOS;
	}

	public static Ejercicio getEj(int grupo, int ej) {
		return TODOSEJERCICIOS[grupo][ej];
	}

	public static int cantGrupos() {
		return TODOSEJERCICIOS.length;
	}

	public static int cantEjByGrupo(int grupo) {
		return TODOSEJERCICIOS[grupo].length;
	}

	public static String[] getListadoGrupos() {
		return LISTAGRUPOS;
	}

	public static String[] getListaEnunCortoByGroup(int grupo) {
		String[] listaEnunCorto=new String[cantEjByGrupo(grupo)];
		for(int i=0;i<cantEjByGrupo(grupo);i++){
			listaEnunCorto[i]=getEj(grupo,i).getEnunCorto();
		}
		return listaEnunCorto;
	}

	//METODOS HEREDADOS
	//METODOS PUBLICOS
	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
