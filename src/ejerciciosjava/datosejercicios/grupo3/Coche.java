/* 
 * {Insert package description here}
 */
package ejerciciosjava.datosejercicios.grupo3;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */

public class Coche {
	//ATRIBUTOS
    private String matricula;
    private String marca;
    private String modelo;
    private int km;
	//CONSTRUCTOR
    public Coche(String matricula, String marca, String modelo, int km) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
    }
	//GETTER && SETTER

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getkm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
	//METODOS HEREDADOS
    public String toString() {
        return "Coche:" + "\n  matricula: " + matricula + "\n  marca: " + marca +
                "\n  modelo: " + modelo + "\n  km: " + km;
    }
	//METODOS PUBLICOS

	//METODOS PRIVADOS

	//METODOS ESTÁTICOS

}
