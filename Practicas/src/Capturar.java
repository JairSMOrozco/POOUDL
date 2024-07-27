import java.util.Scanner;

public class Capturar {
	//Artibutos
	int num;
	
	// Método para obtener los datos de entrada del usuario
	public int obtenerDatos() {
		Scanner leer = new Scanner(System.in);
		System.out.print("Por favor, ingresa un numero: ");
		num = leer.nextInt();
		
		return num;
	}
	
}
