import java.util.Scanner;

public class Conversion_unidadesExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        int opcion;

        do {
            // Mostrar el menú de opciones
            System.out.println("Seleccione una opción de conversión:");
            System.out.println("1. Libras a kilogramos");
            System.out.println("2. Millas a kilómetros");
            System.out.println("3. Galones a litros");
            System.out.println("4. Fahrenheit a Celsius");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número correspondiente a su elección: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                // Procesar la opción elegida
                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el valor a convertir: ");

                    try {
                        double valor = Double.parseDouble(scanner.nextLine());
                        conversor.setValor(valor);

                        // Validar el valor ingresado
                        if (!conversor.validarValor()) {
                            System.out.println("Valor no puede ser negativo. Intente nuevamente.");
                            continue;
                        }

                        double resultado = 0.0;

                        // Realizar la conversión según la opción elegida
                        switch (opcion) {
                            case 1:
                                resultado = conversor.librasAKilogramos();
                                break;
                            case 2:
                                resultado = conversor.millasAKilometros();
                                break;
                            case 3:
                                resultado = conversor.galonesALitros();
                                break;
                            case 4:
                                resultado = conversor.fahrenheitACelsius();
                                break;
                        }

                        // Mostrar el resultado de la conversión
                        System.out.println("El resultado de la conversión es: " + resultado);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Por favor ingrese un valor numérico válido.");
                    }
                } else if (opcion != 5) {
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor ingrese un número válido para la opción.");
                opcion = 0; // Reinicia la opción para mantener el bucle
            }
        } while (opcion != 5);

        System.out.println("Saliendo del programa.");
        scanner.close();
    }
}