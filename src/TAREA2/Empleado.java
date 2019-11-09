package TAREA2;

public class Empleado {
	private int ci, numero_hijos;
	private String nombre, apellidos, direccion;
	private char estado_civil;
	public Empleado(int ci, int numero_hijos, String nombre, String apellidos, String direccion, char estado_civil) {
		this.ci=ci;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.direccion=direccion;
		this.estado_civil=estado_civil;
		this.numero_hijos=numero_hijos;
	}
	public Empleado() {
		numero_hijos=0;
		estado_civil='S';
		direccion="NA";
	}
	public Empleado(int ci, String nombre, String apellidos) {
		numero_hijos=0;
		estado_civil='S';
		this.ci=ci;
		this.nombre=nombre;
		this.apellidos=apellidos;
	}
	public void mostrar() {
		System.out.println("Numero de hijos: " + numero_hijos);
		System.out.println("Estado Civil: " + estado_civil);
	}
	public String nombres() {
		return(nombre+ " " + apellidos);
	}
}
