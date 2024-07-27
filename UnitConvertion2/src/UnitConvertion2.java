import java.util.InputMismatchException;
import java.util.Scanner;

public class UnitConvertion2 {
    public static void main(String[] args) {

        while(true){
            int selectedOption = 0;
            boolean isOptionCorrect = false;

            do{
                /**Descripción de la función
                 * Muestra en consola el menú de opciones
                 * */
                System.out.println("Selecciona una opción de conversión");
                System.out.println("1 - Libras a kilogramos");
                System.out.println("2 - Millas a kilómetros");
                System.out.println("3 - Galones a litros");
                System.out.println("4 - Fahrenheit a centígrados");
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

            //Instancias
            Convertion convertion = new Convertion();

            double capturedValue;
            Scanner scanner = new Scanner(System.in);

            switch (selectedOption){
                case 1:
                    System.out.println("Ingrese 0 para colocar manualmente una cifra o 1 para usar un valor predeterminado");
                    try{
                        if(scanner.nextDouble() == 0){
                            boolean verificationValue = false;
                            do{
                                System.out.println("Ingresa la cantidad de libras a convertir");
                                capturedValue = scanner.nextDouble();
                                verificationValue = convertion.convertToKilograms(capturedValue);
                            }while(!verificationValue);
                            double result = convertion.getValue();
                            System.out.println(capturedValue + " libras son igual a " + result + " kilogramos");
                            scanner.nextLine();
                        }else{
                            convertion.convertToKilograms();
                            double result = convertion.getValue();
                            System.out.println("Una libra es igual a " + result + " kilogramos");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Opción inválida");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese 0 para colocar manualmente una cifra o 1 para usar un valor predeterminado");
                    try{
                        if(scanner.nextDouble() == 0){
                            boolean verificationValue = false;
                            do{
                                System.out.println("Ingresa la cantidad de millas a convertir");
                                capturedValue = scanner.nextDouble();
                                verificationValue = convertion.convertToKilometers(capturedValue);
                            }while(!verificationValue);
                            double result = convertion.getValue();
                            System.out.println(capturedValue + " millas son igual a " + result + " kilometros");
                        }else{
                            convertion.convertToKilometers();
                            double result = convertion.getValue();
                            System.out.println("Una milla es igual a " + result + " kilometro");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Opción inválida");
                    }
                    break;

                case 3:
                    System.out.println("Ingrese 0 para colocar manualmente una cifra o 1 para usar un valor predeterminado");
                    try{
                        if(scanner.nextDouble() == 0){
                            boolean verificationValue = false;
                            do{
                                System.out.println("Ingresa la cantidad de galones a convertir");
                                capturedValue = scanner.nextDouble();
                                verificationValue = convertion.convertToLiters(capturedValue);
                            }while(!verificationValue);
                            double result = convertion.getValue();
                            System.out.println(capturedValue + " galones son igual a " + result + " litros");
                        }else{
                            convertion.convertToLiters();
                            double result = convertion.getValue();
                            System.out.println("Un galón es igual a " + result + " litros");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Opción inválida");
                    }
                    break;

                case 4:
                    System.out.println("Ingrese 0 para colocar manualmente una cifra o 1 para usar un valor predeterminado");
                    try{
                        if(scanner.nextDouble() == 0){
                            boolean verificationValue = false;
                            do{
                                System.out.println("Ingresa la cantidad de grados Fahrenheit a convertir");
                                capturedValue = scanner.nextDouble();
                                verificationValue = convertion.convertToCelsius(capturedValue);
                            }while(!verificationValue);
                            double result = convertion.getValue();
                            System.out.println(capturedValue + " grados Fahrenheit son igual a " + result + " grados Celsius");
                        }else{
                            convertion.convertToCelsius();
                            double result = convertion.getValue();
                            System.out.println("Un grado Fahrenheit es igual a " + result + " grados Celsius");
                        }
                    }catch(InputMismatchException e){
                        System.out.println("Opción inválida");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }
        }

    }
}