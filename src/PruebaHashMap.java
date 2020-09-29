import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Alumno{
	private String nombre;
	private int edad;
	private String carrera;
	private String fechaInscripcion;
	
	public Alumno(String nombre, int edad, String carrera, String fechaInscripcion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.fechaInscripcion = fechaInscripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getFechaInscripcion() {
		return fechaInscripcion;
	}
	public void setFechaInscripcion(String fechaInscripcion) {
		this.fechaInscripcion = fechaInscripcion;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + ", fechaInscripcion="
				+ fechaInscripcion + "]";
	}
	
	
}
class ListaAlumnos{
	Map<Integer, Alumno> mapa=new HashMap<>();
	Scanner entrada=new Scanner(System.in);
	public void llenarMapa(int num) {
		System.out.println("Ingresa los siguientes datos:");
		System.out.println("Nombre del alumno");
		String nom=entrada.nextLine();
		System.out.println("Edad del alumno");
		int edad=entrada.nextInt();
		entrada.nextLine();
		System.out.println("Carrea del alumno:");
		String carrera=entrada.nextLine();
		System.out.println("Fecha de inscripcion en formato dd/mm/aaaa");
		String fecha=entrada.nextLine();
		Alumno alumno=new Alumno(nom, edad, carrera, fecha);
		
		mapa.put(num,alumno);
	}
	public void mostrarAlumnosCarrera(int op) {
		for (Map.Entry<Integer,Alumno> alum : mapa.entrySet()) {
				System.out.println(alum);
		}
	}
	
}
public class PruebaHashMap {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String op="";
		int folio=1;
		Map<String, Alumno> mapa=new HashMap<>();
		ListaAlumnos map=new ListaAlumnos();
		do {
		System.out.println("Elige la opcion que necesites");
		System.out.println("A) Llenar lista");
		System.out.println("B) Vaciar lista");
		System.out.println("C) Mostrar alumnos por carrera");
		System.out.println("D) Calcular promedio edades");
		System.out.println("E) Mostrar los alumnos que se inscribieron después de la fecha indicada (10/08/2016)");
		System.out.println("F) Salir");
		op=entrada.nextLine().toUpperCase().replace(" ","");
		switch (op) {
		case "A":
			map.llenarMapa(folio);
			folio++;
			break;
		case "B":
			map.mapa.clear();
			System.out.println("Mapa limpiado.....");
			break;
		case"C":
			int op2=0;
			System.out.println("Que quieres mostrar:");
			System.out.println("1) ISC");
			System.out.println("2) IIA");
			System.out.println("3) IM");
			System.out.println("4) LA");
			System.out.println("5) CP");
			op2=entrada.nextInt();
			map.mostrarAlumnosCarrera(op2);
			break;
		case "D":
			
			break;
		case "E":
			
			break;
		case "F":
			System.out.println("Saliendo....");
		default:
			System.out.println("Ingresa una opcion valida");
			break;
		}
		}while(!op.equalsIgnoreCase("F"));

	}

}
