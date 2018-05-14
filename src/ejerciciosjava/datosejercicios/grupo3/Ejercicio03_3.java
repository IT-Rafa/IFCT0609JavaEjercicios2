/* 
 * Este paquete contiene toda la informacion de cada ejercicio y como ejecutarlo
 */
package ejerciciosjava.datosejercicios.grupo3;

import ejerciciosjava.datosejercicios.grupo1.*;
import ejerciciosjava.datosejercicios.Ejercicio;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Describe y implanta el ejercicio 3 del grupo 3
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Ejercicio03_3 extends Ejercicio{

	//ATRIBUTOS
    private ArrayList<Empleado> listaEmpleados = new ArrayList();
	//CONSTRUCTOR

	public Ejercicio03_3() {
		super(3, 3, "Ejercicio clases 3", "Tiene que hacer muchas cosas que corresponden al ejercicio 3 del grupo clases");
	}

	//GETTER && SETTER
	//METODOS HEREDADOS
	@Override
	public void EjecutaGui() {
		System.out.println("Ejecucion en ventana del ejercicio 3 del grupo 3");
	}

	@Override
	public void EjecutaCli() {
        System.out.println("Pruebas");
        System.out.println("");
        Scanner leer = new Scanner(System.in);
        int cantEmpleados;
        int codigo; // Para buscar por codigo empleado
        System.out.println("Inicialización con datos creados en código");
        //Crea varios empleados si no se crearon antes (todos los objetos se mantienen hasta salida programa)
        if (listaEmpleados.size() < 1) {
            listaEmpleados.add(new EmpleadoTemporal("5/10/10", "Pringao", "Jose", "Gonzalez", "34.666.444-H")); //Cod1
            listaEmpleados.add(new EmpleadoTemporal("5/10/10", "Pringao", "Luis", "Perez", "34.555.777-H")); //Cod2
            listaEmpleados.add(new EmpleadoTemporal("5/10/10", "Mas Pringao", "Paco", "Perez", "34.888.444-H")); //Cod3
            listaEmpleados.add(new EmpleadoTemporal("5/10/10", "Mas Pringao", "Jose", "Dominguez", "34.999.444-H")); //Cod4
            listaEmpleados.add(new EmpleadoFijo(1, "Jefazo", "Pepe", "Garcia", "34.111.444-H")); //Cod5
            listaEmpleados.add(new EmpleadoFijo(2, "Administrador", "Paco", "Gutierrez", "34.222.444-H")); //Cod6
            listaEmpleados.add(new EmpleadoFijo(10, "Contable", "Jose", "Barra", "34.555.666-H")); //Cod7
            listaEmpleados.add(new EmpleadoFijo(15, "Segurata", "Antonio", "Costas", "34.555.444 -H")); //Cod8
        }
        
        System.out.println("Cant empleados: "+this.listaEmpleados.size());
        System.out.println("Cant empleados fijos: "+ EmpleadoFijo.getCantEmpFijos());
        System.out.println("Cant empleados temporales: "+ EmpleadoTemporal.getCantEmpTemp());
        
        
        //Prueba Borrar elementos
        listaEmpleados.remove(2);
        listaEmpleados.remove(6);

        //Prueba: Crear empleados a mano.
        //  Eliges cantidad, pide datos y guarda en arraylist, repite hasta cantidad
        System.out.println("-- Prueba: Crear empleados a mano. --");
        System.out.println("Crear datos a mano. Con 0 no creas ninguno");
        System.out.print("Introduce cantidad de empleados a introducir: ");
        cantEmpleados = leer.nextInt();
        for (int i = 0; i < cantEmpleados; i++) {
            //Pedimos datos para crear un coche y lo añadimos a array
            System.out.println("Introduce datos " + (i + 1) + "º Empleado a crear");
            this.listaEmpleados.add(crearEmpleado());
        }

        //Prueba: Muestra todos empleados Mostrar empleados
        System.out.println("-- Prueba: Muestra todos empleados --");
        System.out.println("Mostramos todos los empleados");
        mostrarEmpleados();

        //Prueba: Busqueda por código: int buscaPorCodigo(int codigo)
        //Debería mostrar el empleado jefe
        System.out.println("-- Prueba: Busqueda por código --");
        System.out.println("Mostramos un solo empleado según código");

        System.out.println("Aquí no debe salir nada por preguntar por codigo 100");
        if (buscaPorCodigo(100) != null) {
            System.out.println(buscaPorCodigo(5));
        }

        System.out.println("Este debería ser el jefe");
        if (buscaPorCodigo(5) != null) {
            System.out.println(buscaPorCodigo(5));
        }

        //Prueba: Modificar dato de un empleado.
        //  Necesario el empleado, el campo a cambiar y el nuevo dato
        //  0=nombre,1=apellidos,2=dni,3=categoria, 4=Antiguedad, 5=fAlta
        // Según empleado cambian los datos a cambiar
        System.out.println("-- Prueba: Modificar un dato de un empleado --");
        System.out.println("Cambiamos la categoria de jefazo por super jefazo");
        if (cambiarDato(5, 3, "SuperJefazo")) {
            System.out.println("Dato cambiado");
        } else {
            System.out.println("Dato NO cambiado");
        }
        System.out.println("Cambiamos la antiguedad del super jefazo a 3");
        if (cambiarDato(5, 4, "3")) {
            System.out.println("Dato cambiado");
        } else {
            System.out.println("Dato NO cambiado");
        }
        System.out.println("Cambiamos la fecha alta del super jefazo (deberia fallar)");
        if (cambiarDato(5, 5, "1/1/1")) {
            System.out.println("Dato cambiado");
        } else {
            System.out.println("Dato NO cambiado");
        }
        //mostramos empleado
        if (buscaPorCodigo(5) != null) {
            System.out.println(buscaPorCodigo(5));
        }
        //Pidendo los datos
        menuCambiarDato();
    }
	
	//METODOS PUBLICOS

	//METODOS PRIVADOS
    private Empleado crearEmpleado() {
        Scanner leer = new Scanner(System.in);
        Empleado aux;
        String id, nombre, apel, dni, categoria, fAlta;
        int antiguedad;
        int tipo; // true=empleado fijo false=empleado temporal

        System.out.println("** Se va a crear el empleado " + Empleado.getLastId() + " **");

        do {
            System.out.print("Indica el tipo de empleado (1=temporal 2=fijo): ");
            tipo = leer.nextByte();
         } while (tipo < 1 && tipo > 2);

        if (tipo == 1) {
            System.out.println("Datos empleado temporal:");
        } else {
            System.out.print("Datos empleado fijo:");
        }

        System.out.print(" Nombre: ");
        nombre = leer.next();

        System.out.print(" Apellido: ");
        apel = leer.next();

        System.out.print(" DNI: ");
        dni = leer.next();

        System.out.print(" Categoria: ");
        categoria = leer.next();

        if (tipo == 1) {
            System.out.print(" Fecha alta: ");
            fAlta = leer.next();
            aux = new EmpleadoTemporal(fAlta, categoria, nombre, apel, dni);

        } else {
            System.out.print(" Antiguedad: ");
            antiguedad = leer.nextInt();
            aux = new EmpleadoFijo(antiguedad, categoria, nombre, apel, dni);
        }
        return aux;
    }

    /**
     * Mostrar todos los empleados del ArrayList
     *
     */
    private void mostrarEmpleados() {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(listaEmpleados.get(i));
        }

    }

    /**
     * Simplemente pide los datos por consola para cambiar dato
     *
     */
    private void menuCambiarDato() {
        Scanner leer = new Scanner(System.in);
        int codigo, campo;
        String valor;
        do {
            System.out.print("Introduce código del empleado: ");
            codigo = leer.nextInt();
        } while (buscaPorCodigo(codigo) == null);
        System.out.println("Estos son los datos actuales");
        System.out.println(buscaPorCodigo(codigo) );
        
        do {
            System.out.println("Introduce Campo a modificar");
            System.out.println("  0 - Nombre\n  1 - Apellidos\n  2 - DNI\n "
                    + " 3 - categoria\n  4 - Antiguedad\n  5 - Fecha alta");
            System.out.print("Campo: ");
            campo = leer.nextInt();
        } while (campo < 0 && campo >= 5);
        
        System.out.print("Introduce nuevo valor: ");
        valor = leer.next();
        cambiarDato(codigo, campo, valor);
        System.out.println("Estos son los datos actuales");
        System.out.println(buscaPorCodigo(codigo) );
        
        
    }

    /**
     * Cambiar dato Ej: Al empleado con código 0002 le quiero cambiar el nombre
     * por Luis
     *
     * @param codigo int El código del empleado a buscar
     * @param campo int campo de Empleado a buscar.
     * //0=nombre,1=apellidos,2=dni,3=categoria, 4=Antiguedad, 5=fAlta
     * @param valor String. Nuevo valor a introducir. Si es necesario se
     * convertirá
     * @return boolean True: Si se cambió el dato. False: Si no se cambió
     */
    private boolean cambiarDato(int codigo, int campo, String valor) {

        Empleado emp = buscaPorCodigo(codigo);

        //Se localizo ok el empleado
        if (emp != null) {
            //El campo a cambiar es de un Empleado fijo (antiguedad)
            if (campo == 4 && emp instanceof EmpleadoFijo) {
                EmpleadoFijo empF = (EmpleadoFijo) emp;
                empF.setAntiguedad(Integer.parseInt(valor));
                return true;
                //El campo a cambiar es de un Empleado temporal (fAlta)
            } else if (campo == 5 && emp instanceof EmpleadoTemporal) {
                EmpleadoTemporal empT = (EmpleadoTemporal) emp;
                empT.setfAlta(valor);
                return true;
                //Campos Empleado (comunes a todos)
                //0=nombre,1=apellidos,2=dni,3=categoria, 4=Antiguedad, 5=fAlta
            } else {

                switch (campo) {
                    case 0:
                        emp.setNombre(valor);
                        return true;
                    case 1:
                        emp.setApellido(valor);
                        return true;
                    case 2:
                        emp.setDni(valor);
                        return true;
                    case 3:
                        emp.setCategoria(valor);
                        return true;
                    default:
                        return false;
                }
            }
        }
        return false;
    }

    /**
     * Te devuelve la posición del código buscado. Si no encuentra devuelve -1
     *
     * @param String codigo: Código a buscar
     * @return int: Posición del elemento con ese código dentro del ArrayList
     */
    private Empleado buscaPorCodigo(int codigo) {
        for (int i = 0; i < listaEmpleados.size(); i++) {
            if (listaEmpleados.get(i).getIdEmpleado() == codigo) {
                return listaEmpleados.get(i);
            }
        }
        return null;
    }

}
