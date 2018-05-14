/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo3;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;

/**
 * Describe y implanta el ejercicio 1 del grupo 3
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio01_3 extends Ejercicio{

	//ATRIBUTOS
    private String nombre;
	//CONSTRUCTOR

	public Ejercicio01_3() {
		super(1, 3, "Ejercicio clases 1", "Tiene que hacer muchas cosas que corresponden al ejercicio 1 del grupo clases");
	}

	//GETTER && SETTER
	    public void setNombre(String nombre) {
        this.nombre = nombre;
				}
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 1 del grupo 3");
	}

	@Override
	public void EjecutaCli() {
        Scanner leer = new Scanner(System.in);

        //Creamos array 5 pelotas
        int cantPelotas;
        Pelota[] pelotas;

        System.out.print("Introduce la cantidad de pelotas a crear: ");
        cantPelotas = leer.nextInt();
        pelotas = new Pelota[5];
        int tamanho=0; // para pedir el tamaño
        String color=""; // Para pedir color
        int i;
        for (i = 0; i < pelotas.length; i++) {

            boolean error = true; // Comprobar error entrada int   
            System.out.print("  Color de pelota " + i + " :");
            color = leer.next();
            System.out.print("  Tamaño de pelota " + i + " :");
            //Comprobamos que entra un int
            while (error) {
                if (leer.hasNextInt()) {
                    tamanho = leer.nextInt();
                } else {
                    leer.nextInt();
                    continue;
                }
                error = false;
            }

        }
        pelotas[i] = new Pelota(color, tamanho);
    }
	}

