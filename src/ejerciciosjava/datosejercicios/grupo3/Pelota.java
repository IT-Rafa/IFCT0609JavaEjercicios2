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

public class Pelota {
	//ATRIBUTOS
    private String color;
    private int tamanho;
	//CONSTRUCTOR
    public Pelota() {
        this.color = "Blanca";
        this.tamanho = 2;
    }

    public Pelota(String color, int tamanho) {
        this.color = color;
        this.tamanho = tamanho;
    }

    public Pelota(String color) {
        this.color = color;
        this.tamanho = 2;
    }
	//GETTER && SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
	//METODOS HEREDADOS
    @Override
    public String toString() {
        return (" una pelota de color=" + getColor() + " y tamaño " + getTamanho());
    }
	//METODOS PUBLICOS
    public String botar(){
    return "La pelota " +this.color + " y "+ this.tamanho + " bota...";
    }
    public String no(){
    return "La pelota " +this.color + " y "+ this.tamanho +" ya no bota...";
    }

}
