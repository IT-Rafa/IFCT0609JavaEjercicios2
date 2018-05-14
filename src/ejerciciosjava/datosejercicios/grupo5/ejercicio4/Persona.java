/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Define campos y métodos heredables.
 *
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public abstract class Persona {

	//ATRIBUTOS
	private String dni;         // DNI de la persona * Sirve como código
	private String nombre;      // Nombre de la persona
	private String apellidos;   // Todos los apellidos
	private Sexo sexo;
	private Calendar fechaNac;  // Fecha de nacimiento
	private EstadoCivil estado; // Estado civil - es enum
	private ArrayList<Direccion> direcciones = new ArrayList<>(); // Lista de direcciones de la persona
	private int posDirPorDefecto;
	private ArrayList<Contacto> contactos = new ArrayList<>();   // Lista de formas de contacto de la persona
	private int posContactPorDefecto;
	private TipoEstudio estudioSuperior;
	private String foto;
	//ATRIBUTO DE CLASE
	protected static int CANTPERSONAS;

	//CONSTRUCTOR
	public Persona() {
		++Persona.CANTPERSONAS;
		this.dni = "";
		this.nombre = "";
		this.apellidos = "";
		this.sexo = Sexo.HOMBRE;
		this.fechaNac = new GregorianCalendar();
		this.estado = EstadoCivil.SOLTERO;
		this.estudioSuperior = TipoEstudio.PRIMARIA;
		this.posDirPorDefecto = 0;
		this.posContactPorDefecto = 0;
		String aps=this.apellidos.replace(' ', '_');
		this.foto = this.nombre +"_" +aps +".png";
		//Debe haber un contacto y direccion mínimo para mostrar formulario
		this.addContacto(new Contacto());
		this.addDireccion(new Direccion());
	}

	public Persona(String dni, String nombre, String apellidos,Sexo sexo, Calendar fechaNacimiento, EstadoCivil estado, TipoEstudio estudioSuperior) {
		++Persona.CANTPERSONAS;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.fechaNac = fechaNacimiento;
		this.estado = estado;
		this.estudioSuperior = estudioSuperior;
		this.posDirPorDefecto = 0;
		this.posContactPorDefecto = 0;
		String aps=this.apellidos.replace(' ', '_');
		this.foto = this.nombre +"_" +aps +".png";
	}

	//GETTER&SETTER
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Sexo getSexo() {
		return this.sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public EstadoCivil getEstadoCivil() {
		return estado;
	}

	public void setEstadoCivil(EstadoCivil estado) {
		this.estado = estado;
	}

	public TipoEstudio getEstudioSuperior() {
		return estudioSuperior;
	}

	public void setEstudioSuperior(TipoEstudio estado) {
		this.estudioSuperior = estado;
	}

	public Calendar getFechaNac() {
		return fechaNac;
	}

	public String getFoto() {
		return this.foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getStringFechaNac() {
		//definimos un formato de fecha
		SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyy", new Locale("ES"));
		//pasamos a String
		return formato.format(this.fechaNac.getTime());
	}

	public void setFechaNac(Calendar fechaNac) {
		this.fechaNac = fechaNac;
	}

	public int getPosDirPorDefecto() {
		return posDirPorDefecto;
	}

	public void setPosDirPorDefecto(int posDirPorDefecto) {
		this.posDirPorDefecto = posDirPorDefecto;
	}

	public int getPosContactPorDefecto() {
		return posContactPorDefecto;
	}

	public void setPosContactPorDefecto(int posContactPorDefecto) {
		this.posContactPorDefecto = posContactPorDefecto;
	}

	public static int getCANTPERSONAS() {
		return CANTPERSONAS;
	}

	public ArrayList<Direccion> getDirecciones() {
		return direcciones;
	}

	public void addDireccion(Direccion dir) {
		this.direcciones.add(dir);
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void addContacto(Contacto contacto) {
		this.contactos.add(contacto);
	}

}
