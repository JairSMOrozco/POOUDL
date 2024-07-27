import java.util.InputMismatchException;
import java.util.Scanner;

public class UnitConvertion2 {
    public static void main(String[] args) {

        int selectedOption = 0;
        boolean isOptionCorrect = false;

        //Instancias
        Convertion convertion = new Convertion();


        do{
            /**Descripción de la función
             * Muestra en consola el menú de opciones
             * */
            System.out.println("Selecciona una opción de conversión");
            System.out.println("1 - Libras a kilogramos");
            System.out.println("2 - Millas a kilómetros");
            System.out.println("3 - Galones a litros");
            System.out.println("4 - Farenheit a centígrados");
            System.out.println("5 - Salir");

            try{
                Scanner scanner = new Scanner(System.in);
                selectedOption = scanner.nextInt();

                //Valida si la opción elegida está en el menú
                switch (selectedOption){
                    case 1,2,3,4,5:
                        isOptionCorrect = true;
                        break;
                    default:
                        System.out.println("Ingresa una opción válida");
                        isOptionCorrect = false;
                        break;
                }
            }catch(InputMismatchException event){
                System.out.println("No se admiten caracteres, ingresa una opción válida");
            }

        }while(!isOptionCorrect);

        //Dependiendo de la opción elegida se ejecutan los cálculos
        double capturedValue;
        Scanner scanner = new Scanner(System.in);

        switch (selectedOption){
            case 1:
                System.out.println("Ingrese 0 para colocar manualmente una cifra o 1 para usar un valor predeterminado");
                try{
                    if(scanner.nextDouble() == 0){
                        System.out.println("Ingresa la cantidad de libras a convertir");
                        capturedValue = scanner.nextDouble();
                        convertion.convertToKilograms(capturedValue);
                        double result = convertion.getKilogramsValue();
                        System.out.println(capturedValue + " libras son iguales a " + result + " kilogramos");
                    }else{
                        convertion.convertToKilograms();
                        double result = convertion.getKilogramsValue();
                        System.out.println("Una libra es igual a " + result + " kilogramos");
                    }
                }catch(InputMismatchException e){
                    System.out.println("Opción inválida");
                }

                break;
            case 2:

                break;

            case 3:
                /*
                gallonsCaptured = captureData.getGallons();
                gallonsToLiters = gallon.convertToLiters(gallonsCaptured);
                result.showResultConversion(selectedOption, gallonsCaptured, gallonsToLiters);
                */
                break;

            case 4:
                /*
                fharenheitCaptured = captureData.getFahrenheit();
                fharenheitToCelcius = fahrenheit.convertToCelsius(fharenheitCaptured);
                result.showResultConversion(selectedOption, fharenheitCaptured, fharenheitToCelcius);
                */
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                System.exit(0);
        }

    }
}