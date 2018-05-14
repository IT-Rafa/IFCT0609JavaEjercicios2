/* 
 * {Insert package description here}
 */
package ejerciciosjava.datosejercicios.grupo3;

import java.text.DecimalFormat;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class EmpleadoFijo extends Empleado  {
	//ATRIBUTOS
    private int antiguedad;
    private static int cantEmpFijos=0;
	//CONSTRUCTOR
    public EmpleadoFijo(int antiguedad, String categoria, String nombre, String apellido, String dni) {
        super(categoria, nombre, apellido, dni);
        this.antiguedad = antiguedad;
        cantEmpFijos++;
    }
	//GETTER && SETTER
    public static int getCantEmpFijos(){
    return cantEmpFijos;
    }
    
    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
	//METODOS HEREDADOS
    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("0000");
        return "EMPLEADO FIJO\nCódigo: " + f.format(this.getIdEmpleado()) +
                "\n  Nombre completo: "+ this.getNombre()+" "+this.getApellido() +
                "\n  DNI: "+ this.getDni()+ 
                "\n  Categoria: "+ this.getCategoria()+
                "\n  Antiguedad: " + this.getAntiguedad() + " años";
    }
    @Override
    public boolean isFijo(){return true;}

}
