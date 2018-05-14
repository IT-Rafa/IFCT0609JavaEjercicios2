
/* 
 * Este paquete controla la creación del aula y todos sus elementos:
 * Alumno, Persona, Direccion, Contacto
 */
package ejerciciosjava.datosejercicios.grupo5.ejercicio4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Define Los datos relativos a una lista de Alumnos
 *
 * @version
 * @since
 * @author it-rafa
 * @author Rafael Martínez - it.rafamartinez@gmail.com
 */
public class Aula implements Serializable {

    private static final long serialVersionUID = 1L;

    //ATRIBUTOS
    private String aula;		//Nombre del aula o curso
    private File archivo;		//Archivo donde está almacenado
    private String propietario;	//Usuario que creo el aula
    //Lista alumnos que tiene el aula
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();

    //CONSTRUCTOR
    public Aula(String propietario, String aula) {
        this.aula = aula;
        this.propietario = propietario;
        //Creamos rutas y archivo según nombre propietario y aula
        File carpeta = new File("datos\\" + this.propietario + "\\" + this.getAula() + "\\fotos");
        carpeta.mkdirs();
        carpeta = new File("datos\\" + this.propietario + "\\" + this.getAula());
        this.archivo = new File(carpeta, aula);

    }

    //GETTER && SETTER
    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void addAlumno(Alumno newAlumno) {
        this.listaAlumnos.add(newAlumno);
    }

    public void removeAlumno(int posicion) {
        this.listaAlumnos.remove(posicion);
    }

    //METODOS HEREDADOS
    //METODOS PUBLICOS
    /**
     * Devuelve la posición en el array donde está el alumno con el código
     * indicado
     *
     * @param codAlumno int código del alumno a buscar
     * @return int: posición del alumno con el código indicado. -1 si no lo
     * encuentra
     */
    public int searchAlumnoByCodigo(int codAlumno) {
        for (Alumno al : this.listaAlumnos) {
            if (al.getCodAlumno() == codAlumno) {
                return listaAlumnos.indexOf(al);
            }
        }
        return -1;
    }

    /**
     * Guarda los datos del aula en un archivo binario - PENDIENTE PRUEBA-GRABA
     * ALGO, PERO NO SE CARGA
     */
    public void saveToByteFile() {
        System.out.println("Guardando archivo en " + this.archivo + ".dat");
        try {
            try (ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream(this.archivo + ".dat"))) {
                for (Alumno al : this.getListaAlumnos()) {
                    oos.writeObject(al);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * carga los datos del aula de un archivo binario - NO FUNCIONA
     */
    public void loadFromByteFile() {
        try {
            // Se crea un ObjectInputStream
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream(this.archivo + ".dat"));

            // Se lee el primer objeto
            Object aux = ois.readObject();

            // Mientras haya objetos
            while (aux != null) {
                if (aux instanceof Alumno) {
                    System.out.println(aux);
                }
                aux = ois.readObject();
            }
            ois.close();
        } catch (EOFException e1) {
            System.out.println("Fin de fichero");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /**
     * Guarda los datos del aula en un archivo de texto indicado en las
     * propiedades.
     *
     * @return devuelve mensaje
     */
    public String saveToTxtFile() {
        String st = "";

        try {
            //SE CREA UN OBJETO DE TIPO BUFFEREDWRITER PARA PODER ESCRIBIR DENTRO DEL ARCHIVO

            BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo + ".txt"));

            for (Alumno al : this.getListaAlumnos()) {
                st += al.toTxtFile();
            }
            System.out.println(st);
            bw.write(st);
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla
            return "ERROR AL GUARDAR: " + ex.getMessage();

        }
        return "Guardando archivo en " + this.archivo + ".txt";

    }

    /**
     * Devuelve los datos del archivo de texto indicado en las propiedades.
     *
     * @return String con datos del archivo de texto
     */
    public String readTxtFile() {
        String st = "";
        try {
            // Apertura del fichero y creacion de BufferedReader para leer cada linea con readLine()).
            FileReader fr = new FileReader(this.archivo + ".txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null) {
                st += linea + "\n";
            }
        } catch (IOException e) {
            System.out.println("--------El error está en la lectura en general");

            System.out.println(e.getMessage());
        }
        return st;
    }

    /**
     * Convierte los datos del archivo de texto indicado en los atributos en la
     * lista de Alumnos y la guarda en su atributo
     */
    public void loadFromTxtFile() {

        //Control de zonas de datos
        int lineaArchivo = 0;
        int lineaAlumno = 0;
        int cantAlumnos = 0;
        int lineaLenguaje = 0;
        int cantLenguajes = 0;
        int lineaContactos = 0;
        int cantContactos = 0;
        int lineaDirecciones = 0;
        int cantDirecciones = 0;
        boolean isAlumno = false;
        boolean isLenguaje = false;
        boolean isContacto = false;
        boolean isDireccion = false;
        // Campos para guardar los datos que usaremos para crear el Alumno
        Alumno al = null;

        int alumCod = 0;
        String perDni = "";
        String perNombre = "";
        String perApell = "";
        SimpleDateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyy", new Locale("ES"));
        Calendar perFechaNac = null;
        Calendar perFechaIng = null;
        EstadoCivil perEstado = null;
        TipoEstudio perEstudio = null;
        int perPosContact = 0;
        int perPosDir = 0;
        TipoContacto tipoContacto = null;
        String DescContacto;
        TiposCalle tipoCalle = null;
        String nombreCalle = "";
        String numEdif = "";
        String piso = "";
        String puerta = "";
        String codigoPostal = "";

        try {
            // Apertura del fichero y creacion de BufferedReader para leer cada linea con readLine()).
            FileReader fr = new FileReader(this.archivo + ".txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;

            //Para todas las líneas
            while ((linea = br.readLine()) != null) {
                // Controlamos el tipo de datos de cada grupo de lineas por su cabecera
                switch (linea) {
                    case "--ALUMNO--":
                        //crea alumno
                        al = new Alumno();
                        isAlumno = true;
                        isLenguaje = false;
                        isContacto = false;
                        isDireccion = false;
                        //inicializamos todos los contadores
                        lineaAlumno = 0;
                        lineaLenguaje = 0;
                        cantLenguajes = 0;
                        lineaContactos = 0;
                        lineaDirecciones = 0;
                        break;

                    case "--LENGUAJE--":
                        isAlumno = false;
                        isLenguaje = true;
                        isContacto = false;
                        isDireccion = false;

                        break;

                    case "--CONTACTO--":
                        isAlumno = false;
                        isLenguaje = false;
                        isContacto = true;
                        isDireccion = false;
                        cantContactos = 1;

                        break;

                    case "--DIRECCION--":
                        //Antes de analizar linea añadimos contacto

                        isAlumno = false;
                        isLenguaje = false;
                        isContacto = false;
                        isDireccion = true;
                        cantDirecciones = 1;
                        break;
                    case "--FIN ALUMNO--":
                        //Antes de analizar linea añadimos contacto
                        isAlumno = false;
                        isLenguaje = false;
                        isContacto = false;
                        isDireccion = false;
                        this.listaAlumnos.add(al);
                        cantAlumnos++;
                        break;

                }
                // Según cabecera y su tipo de línea
                if (isAlumno) {
                    switch (lineaAlumno) {
                        case 1:
                            al.setCodAlumno(Integer.parseInt(linea));
                            break;
                        case 2:
                            al.setDni(linea);
                            break;
                        case 3:
                            al.setNombre(linea);
                            break;
                        case 4:
                            al.setApellidos(linea);
                            break;
                        case 5:
                            al.setSexo(Sexo.valueOf(linea));
                            break;
                        case 6:
                            perFechaNac = Calendar.getInstance();
                            try {
                                perFechaNac.setTime(formato.parse(linea));
                            } catch (ParseException ex) {
                                Logger.getLogger(Aula.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            al.setFechaNac(perFechaNac);
                            break;

                        case 7:
                            perFechaIng = Calendar.getInstance();
                            try {
                                perFechaIng.setTime(formato.parse(linea));
                            } catch (ParseException ex) {
                                Logger.getLogger(Aula.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            al.setFechaInscr(perFechaIng);
                            break;

                        case 8:
                            al.setEstadoCivil(EstadoCivil.valueOf(linea));
                            break;

                        case 9:
                            al.setEstudioSuperior(TipoEstudio.valueOf(linea));
                            break;
                        case 10:
                            al.setFoto(linea);
                            break;
                        case 11:
                            al.setPosContactPorDefecto(Integer.parseInt(linea));
                            break;
                        case 12:
                            al.setPosDirPorDefecto(Integer.parseInt(linea));
                            break;
                    }
                    lineaAlumno++;

                } else if (isLenguaje) {
                    switch (lineaLenguaje) {
                        case 0:
                            break;
                        case 1:
                            //convertido en arraylist, ya no hace falta
                            break;
                        case 2:
                            al.getEstudiaLenguaje().add(Lenguaje.valueOf(linea));
                            lineaLenguaje = 1;
                            cantLenguajes++;
                    }
                    lineaLenguaje++;

                } else if (isContacto) {
                    switch (lineaContactos) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            tipoContacto = TipoContacto.valueOf(linea);
                            break;
                        case 3:
                            //constructor de alumno crea contacto vacio.
                            //si es el primero, lo rellenamos, sino añadimos
                            if (cantContactos == 1) {
                                al.getContactos().get(0).setTipo(tipoContacto);
                                al.getContactos().get(0).setDesc(linea);
                            } else {
                                al.addContacto(new Contacto(tipoContacto, linea));
                            }

                            lineaContactos = 1;
                            cantContactos++;
                            break;
                    }
                    lineaContactos++;
                } else if (isDireccion) {
                    switch (lineaDirecciones) {
                        case 0:
                            break;
                        case 1:
                            break;
                        case 2:
                            tipoCalle = TiposCalle.valueOf(linea);
                            break;
                        case 3:
                            nombreCalle = linea;
                            break;
                        case 4:
                            numEdif = linea;
                            break;
                        case 5:
                            piso = linea;
                            break;
                        case 6:
                            puerta = linea;
                            break;
                        case 7:
                            codigoPostal = linea;
                            //constructor de alumno crea direccion vacia.
                            //si es el primero, lo rellenamos, sino añadimos
                            if (cantDirecciones == 1) {
                                al.getDirecciones().get(0).setTipoCalle(tipoCalle);
                                al.getDirecciones().get(0).setNombreCalle(nombreCalle);
                                al.getDirecciones().get(0).setNumEdif(numEdif);
                                al.getDirecciones().get(0).setPiso(piso);
                                al.getDirecciones().get(0).setPuerta(puerta);
                                al.getDirecciones().get(0).setCodigoPostal(codigoPostal);

                            } else {
                                al.addDireccion(new Direccion(tipoCalle, nombreCalle, numEdif, piso, puerta, codigoPostal));
                            }
                            ;
                            lineaDirecciones = 1;
                            cantDirecciones++;
                            break;
                    }
                    lineaDirecciones++;

                }
                lineaArchivo++;
            }
        } catch (IOException e) {
            System.out.println("--------El error está en la lectura en general");

            System.out.println(e.getMessage());
        }
        //Si la lista está vacia, creamos un alumno sin datos, para evitar errores
        if (this.listaAlumnos.size() == 0) {
            this.listaAlumnos.add(new Alumno());
        }
    }

    public Boolean CheckTxtFile() {
        File myTxtFile = new File(this.archivo + ".txt");
        if (!myTxtFile.exists()) {
            return false;
        } else {
            return true;
        }
    }

    //METODOS PRIVADOS
    //METODOS ESTÁTICOS
    /**
     * Comprobación de la clase y para probar con datos ya válidos.
     *
     * @return String con datos del archivo de texto
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i;
        Aula miAula = new Aula("elProfesor", "IFCT0609");

        Alumno al1 = new Alumno(1, new GregorianCalendar(2018, 0, 01), TipoEstudio.FP,
                new ArrayList<Lenguaje>(Arrays.asList(Lenguaje.JAVA)), "11.111.111-a", "Alumno1", "Alumno1 Alumno1", Sexo.HOMBRE, new GregorianCalendar(2000, 0, 01), EstadoCivil.SOLTERO);
        al1.addContacto(new Contacto(TipoContacto.TELEFONO, "111 11 11 11"));
        al1.addDireccion(new Direccion(TiposCalle.CAMINO, "nomcalle1", "1", "1", "a", "11111"));
        miAula.addAlumno(al1);

        Alumno al2 = new Alumno(2, new GregorianCalendar(2018, 1, 11), TipoEstudio.PRIMARIA, new ArrayList<Lenguaje>(Arrays.asList(Lenguaje.JAVA, Lenguaje.JAVASCRIPT)), "22.222.222-b", "Alumno2", "Alumno2 Alumno2", Sexo.MUJER, new GregorianCalendar(2000, 1, 11), EstadoCivil.SOLTERO);
        al2.addContacto(new Contacto(TipoContacto.TELEFONO, "222 22 22 22"));
        al2.addContacto(new Contacto(TipoContacto.TELEFONO, "222b 22b 22b 22b"));
        al2.addDireccion(new Direccion(TiposCalle.CALLE, "nomcalle2", "2", "2", "b", "22222b"));
        al2.addDireccion(new Direccion(TiposCalle.CARRETERA, "nomcalle2b", "2b", "2b", "bb", "22222b"));
        miAula.addAlumno(al2);

        Alumno al3 = new Alumno(3, new GregorianCalendar(2018, 2, 22), TipoEstudio.SECUNDARIA, new ArrayList<Lenguaje>(Arrays.asList(Lenguaje.JAVA, Lenguaje.JAVASCRIPT, Lenguaje.C)), "33.333.333-c", "Alumno3", "Alumno3 Alumno3", Sexo.MUJER, new GregorianCalendar(2000, 2, 21), EstadoCivil.SOLTERO);
        al3.addContacto(new Contacto(TipoContacto.TELEFONO, "333 33 33 33"));
        al3.addDireccion(new Direccion(TiposCalle.CALLE, "nomcalle3", "3", "3", "c", "36333"));
        miAula.addAlumno(al3);

        Alumno rafa = new Alumno(100, new GregorianCalendar(2018, 4, 10), TipoEstudio.UNIVERSIDAD, new ArrayList<Lenguaje>(Arrays.asList(Lenguaje.JAVA, Lenguaje.JAVASCRIPT, Lenguaje.C, Lenguaje.CSHARP)), "36.143.961-j", "Rafael", "Martínez Costas", Sexo.HOMBRE, new GregorianCalendar(1974, 9, 6), EstadoCivil.SOLTERO);
        rafa.addContacto(new Contacto(TipoContacto.TELEFONO, "986 23 47 52"));
        rafa.addContacto(new Contacto(TipoContacto.EMAIL, "rafacorreo@gmail.com"));
        rafa.addContacto(new Contacto(TipoContacto.EMAIL, "otrorafacorreo@gmail.com"));
        rafa.addDireccion(new Direccion(TiposCalle.CALLE, "Costa", "2", "4", "a", "36333"));
        rafa.addDireccion(new Direccion(TiposCalle.AVENIDA, "Costa2", "2", "4", "a", "362222"));
        miAula.addAlumno(rafa);

//		Busca un una ficha concreta de alumno por código
//		System.out.print("Indica codigo del alumno: ");
//		System.out.println(miAula.listaAlumnos.get(miAula.searchAlumnoByCodigo(leer.nextInt())));
//		Guarda datos en archivo.txt
        miAula.saveToTxtFile();

//		Carga datos de archivo.txt
//		miAula.loadFromTxtFile();
//		Guarda objeto miAula en archivo binario
//		miAula.saveToByteFile();
//		Carga los datos de miAula de archivo binario
//		 Muestra todos los alumnos del aula
        for (Alumno al : miAula.getListaAlumnos()) {
            System.out.println(al.toString());
        }
        // Cantidad de alumnos en aula
        System.out.println("Cantidad alumnos en el aula: " + miAula.getListaAlumnos().size());
    }

}
