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

public class EmpleadoTemporal extends Empleado  {
	//ATRIBUTOS
    private String fAlta;
    private static int cantEmpTemp = 0;

	//CONSTRUCTOR
    public EmpleadoTemporal(String fAlta, String categoria, String nombre, String apellido, String dni) {
        super(categoria, nombre, apellido, dni);
        this.fAlta = fAlta;
        cantEmpTemp++;
    }
	//GETTER && SETTER
public static int getCantEmpTemp() {
        return cantEmpTemp;
    }

    public String getfAlta() {
        return fAlta;
    }

    public void setfAlta(String fAlta) {
        this.fAlta = fAlta;
    }
	//METODOS HEREDADOS
    @Override
    public String toString() {
        DecimalFormat f = new DecimalFormat("000");
        return "\nEMPLEADO TEMPORAL\nCódigo: " + f.format(this.getIdEmpleado())
                + "\n  Nombre completo: " + this.getNombre() + " " + this.getApellido()
                + "\n  DNI: " + this.getDni()
                + "\n  Categoria: " + this.getCategoria()
                + "\n  Fecha de alta: " + this.getfAlta();
    }

    @Override
    public boolean isFijo() {
        return false;
    }

}
