/* 
 * {Insert package description here}
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4.usuarios;

import java.util.ArrayList;

/**
 * {Insert class description here}
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class UsuariosValidos {

	//ATRIBUTOS
	private static ArrayList<Usuario> listaUsuarios = new ArrayList<>();

	//CONSTRUCTOR


	//GETTER && SETTER
	public static String[] getListaUsuarios() {
		String[] lista=new String[listaUsuarios.size()];
		
		for(int i=0;i<listaUsuarios.size();i++){
			lista[i]=listaUsuarios.get(i).getNombre();
		}
		return lista;
		
	}

	//METODOS HEREDADOS
	//METODOS PUBLICOS
		public void init() {
		System.out.println("Añadimos usuario admin");
		Usuario admin = new Usuario("admin", "admin", true);
		UsuariosValidos.listaUsuarios.add(admin);
		
	}

	//METODOS PRIVADOS
	//METODOS ESTÁTICOS
}
