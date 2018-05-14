/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo5;

import ejerciciosjava.datosejercicios.grupo4.*;
import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;

/**
 * Describe y implanta el ejercicio 3del grupo 4
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Ejercicio03_5 extends Ejercicio {

    //ATRIBUTOS
    //CONSTRUCTOR
    public Ejercicio03_5() {
        super(
                3,
                4,
                "Ej. 3 Ejercicio entregado - Array list",
                "EJERCICIO 3 FICHEROS\n\n"
                + "Realizar una aplicación gráfica que permita realizar la gestión de de alumnos de un centro de formación.\n"
                + "\n"
                + "Crear la clase con los campos:\n"
                + "\n"
                + " nombre,\n"
                + " dni,\n"
                + " teléfono,\n"
                + " dirección,\n"
                + " provincia,\n"
                + " estado (soltero, casado)\n"
                + " y estudios(primaria, secundaria, FP o universitarios).\n"
                + "\n"
                + "Se deberá poder insertar, modificar, eliminar y listar alumnos.\n"
                + "\n"
                + "Añadir las opciones de cargar y guardar la información de los alumnos en un fichero  de texto.\n"
                + "\n"
                + "Se deberá utilizar un menú para las opciones principales indicadas.\n"
                + "\n"
                + "\n"
                + "Insertar alguna imagen y una fecha para el dato que se quiera gestionar(p.ej. añadiendo fecha de matriculación.\n"
                + "\n"
                + "Utilizar radioButton, checkbox, combobox según se precise.\n"
                + "\n"
                + "Validar que en los campos numéricos solo contengan números.");
    }

    //GETTER && SETTER
    //METODOS HEREDADOS
    @Override
    public void EjecutaGui() {
        VentanaEj3 inicio = new VentanaEj3();
        inicio.setVisible(true);
    }

    @Override
    public void EjecutaCli() {
        System.out.println("Ejercicio Swing: Solo de Ventanas");
    }

    //METODOS PUBLICOS
    //METODOS PRIVADOS
    //METODOS ESTÁTICOS
}
