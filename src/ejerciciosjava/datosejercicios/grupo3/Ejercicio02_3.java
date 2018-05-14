/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo3;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Describe y implanta el ejercicio 2 del grupo 3
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio02_3 extends Ejercicio{

	//ATRIBUTOS
    private ArrayList<Coche> coches = new ArrayList();
	//CONSTRUCTOR

	public Ejercicio02_3() {
		super(2, 3, "Ejercicio clases 2", "     * - Crea varios elementos Coche en ArrayList coches - Pide cantidad de\n" +
"     * coches a crear, los crea y los guarda en el ArrayList. - Muestra todos\n" +
"     * los objetos Coche creados, como String´s - Muestra posiciones coches\n" +
"     * coincidentes con marca - Muestra posiciones coches tengan un kilometraje\n" +
"     * menor al indicado - Muestra coche con kilometraje más alto -");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 2 del grupo 3");
	}

	@Override
	public void EjecutaCli() {
        Scanner leer = new Scanner(System.in);
        int cantCoches; // nº coches a crear
        //Creamos varios elementos Coche para añadirlos en ArrayList coches directamente
        this.coches.add(new Coche("P-1111-P", "Seat", "panda", 100));
        this.coches.add(new Coche("P-2222-P", "Seat", "panda", 300));
        this.coches.add(new Coche("P-3333-P", "Ford", "Escort", 400));
        this.coches.add(new Coche("P-4444-P", "Ford", "Focus", 500));

        System.out.print("Introduce cantidad de coches a introducir: ");
        cantCoches = leer.nextInt();
        //Pide datos cada coche
        for (int i = 0; i < cantCoches; i++) {
            //Pedimos datos para crear un coche y lo añadimos a array
            System.out.println("Introduce valores coche " + (i + 1) + ": ");
            this.coches.add(pedirDatosCoche());
        }
        //Muestra datos todos coches
        mostrarCoches();
        //Muestra posiciones coches coincidentes con marca
        mostrarPorMarca();
        //Muestra posiciones coches tengan un kilometraje menor
        mostrarPorKmMax();
        //Muestra coches ordenados por kilometraje de menor a mayor
        // - Reordenamos ArrayList y mostramos normalmente
        mostrarCoches();
	}
	
    /**
     * Pide todos los datos del coche, crea objeto Coche y lo devuelve
     *
     * @return Coche
     */
    private Coche pedirDatosCoche() {
        Scanner leer = new Scanner(System.in);
        String matricula, marca, modelo;
        int km;
        Coche auxCoche; // guardará coche antes de ponerlo en ArrayList
        System.out.print("   Introduce matricula: ");
        matricula = leer.next();
        System.out.print("   Introduce marca: ");
        marca = leer.next();
        System.out.print("   Introduce modelo: ");
        modelo = leer.next();
        System.out.print("   Introduce kilometraje: ");
        km = leer.nextInt();
        return new Coche(matricula, marca, modelo, km);
    }

    /**
     * Muestra todos los elementos Coches dentro del array list coches como
     * String's por consola
     *
     * @
     */
    private void mostrarCoches() {
        int i = 0;
        for (Coche unCoche : coches) {
            System.out.println((i + 1) + "º " + coches.get(i));
            ++i;
        }
    }

    /**
     * Pide marca y muestra los elementos del atributo ArrayList coches que
     * coinciden
     */
    private void mostrarPorMarca() {
        Scanner leer = new Scanner(System.in);
        String marca; //marca a buscar
        int cont = 0;
        System.out.print("Introduce la marca de coche a buscar: ");
        marca = leer.next();

        System.out.print("Las posiciones con coches con esa marca son: ");

        for (int i = 0; i < this.coches.size(); i++) {
            if (coches.get(i).getMarca().equalsIgnoreCase(marca)) {
                if (cont != 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                cont = 1;
            }
        }
        System.out.println();
    }

    /**
     * Pide kilometro máximo y muestra los elementos del atributo ArrayList
     * coches que coinciden tengan un kilometraje menor
     */
    private void mostrarPorKmMax() {
        Scanner leer = new Scanner(System.in);
        int maxKm; //marca a buscar
        int cont = 0;
        System.out.print("Introduce la cantidad máxima de kilometros: ");
        maxKm = leer.nextInt();

        System.out.print("Las posiciones con coches cantidad kilometros menor que" + maxKm + " son: ");

        for (int i = 0; i < this.coches.size(); i++) {
            if (coches.get(i).getkm() <= maxKm) {
                if (cont != 0) {
                    System.out.print(", ");
                }
                System.out.print(i);
                cont = 1;
            }
        }
        System.out.println();
    }
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
