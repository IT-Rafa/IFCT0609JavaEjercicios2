/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo5;

import ejerciciosjava.datosejercicios.grupo4.*;
import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 1 del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio01_5 extends Ejercicio {

    //ATRIBUTOS
    //CONSTRUCTOR
    public Ejercicio01_5() {
        super(
                1,
                5,
                "Ej. 1 Formulario para guardar datos y mostrarlos",
                "EJERCICIO 1\n\n"
                + "Formulario que permite pide datos y los guarda y los muestra"
                + " en consola o en un textArea");
    }

    //GETTER && SETTER
    //METODOS HEREDADOS
    @Override
    public void EjecutaGui() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEj1_5_rellenar().setVisible(true);
            }

        });
    }

    @Override
    public void EjecutaCli() {
        System.out.println("Ejercicio Swing: Solo de Ventanas");
    }

    //METODOS PUBLICOS
    //METODOS PRIVADOS
    //METODOS ESTÁTICOS
}
