public class Determinacion {

	// Método para comparar dos números y mostrar el resultado
	public void compararDatos (int pNum, int sNum) {
	
		//Comparar los números y mostrar el resultado adecuado	
		if (pNum > sNum) {
			System.out.println("-->El primer numero: "+pNum+" es mayor que "+ "el segundo numero: "+sNum);
				
		}else if (pNum<sNum) {
			System.out.println("--> El primer numero: "+pNum+" es menor que "+ "el segundo numero: "+sNum);
		}else {
			System.out.println("Los numeros son iguales, para una correcta validación ingrese dos numeros enteros diferentes");
		}	
	}
}
	

