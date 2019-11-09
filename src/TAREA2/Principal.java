package TAREA2;

/*2. Detalle
1. Crear la representación gráfica y su respectiva codificación en Java de la clase
Empleado que gestione la siguiente información ci, nombre, apellidos, dirección,
estado civil1 y número de hijos. La objetos de esta clase deben proporcionar
los siguientes servicios:
Devuelve en una cadena el nombre completo que está compuesto por su nombre y apellidos.
Muestra por pantalla el número de hijos
Muestra por pantalla el estado civil
Constructor vacío que asigna el valor ’S’ al atributo estado civil, “NA” en
dirección y 0 en número de hijos
Constructor que recibe todos los valores que tendrán los atributos
Constructor que recibe el valor de los atributos ci, nombre y apellidos.
Los atributos estado civil y número de hijos tendrán los valores ’S’ y 0,
respectivamente.
Nota: Todos los atributos de la clase deben tener visibilidad private y los métodos friendly2
.
*/
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado mario = new Empleado(12,"mario","luzardo");
		System.out.println(mario.nombres());
		mario.mostrar();
	}

}
