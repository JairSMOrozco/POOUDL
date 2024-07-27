public class Practicas {
	public static void main(String[] args) {

	System.out.println("Comparación entre dos numeros enteros");

	//Instancias
	Capturar capturar = new Capturar();
	Determinacion determinar = new Determinacion();

	// Obtener los valores capturados
	int num = capturar.obtenerDatos();
	int num2 = capturar.obtenerDatos();
	
	// Se usa el valor almacenado en num y num2 en el método compararDatos del objeto determinar
	determinar.compararDatos(num,num2);
	}
}
