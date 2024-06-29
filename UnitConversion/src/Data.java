import java.util.Scanner;

public class Data {

    //Métodos
    /**Descripción de la función
     * Pide a usuario ingresar una opción del menú
     * @return selectedOption --> Es la opción ingresada por usuario
     * */
    public int getOption(){
        Scanner readOption = new Scanner(System.in);

        int selectedOption = readOption.nextInt();

        return selectedOption;
    }

    //Ingresar Libras
    /**Descripción de la función
     * Pide a usuario ingresar la cantidad de libras a convertir a kilogramos
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return capturedUnit --> Es el valor capturado por el usuario
     * */
    public double getPounds(){
        double capturedUnit;
        boolean isUnitCorrect;
        Scanner readPounds = new Scanner(System.in);

        do {
            System.out.println("Ingresa la cantidad de libras a convertir");
            capturedUnit = readPounds.nextDouble();

            if (capturedUnit <= 0){
                System.out.println("Cantidad no válida");
                System.out.println("Intenta de nuevo");
                isUnitCorrect = false;
            }else {
                isUnitCorrect = true;
            }
        }while (!isUnitCorrect);

        return capturedUnit;
    }

    //Ingresar Millas
    /**Descripción de la función
     * Pide a usuario ingresar la cantidad de millas a convertir a kilómetros
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return capturedUnit --> Es el valor capturado por el usuario
     * */
    public double getMiles(){
        double capturedUnit;
        boolean isUnitCorrect;
        Scanner readMiles = new Scanner(System.in);

        do {
            System.out.println("Ingresa la cantidad de millas a convertir");
            capturedUnit = readMiles.nextDouble();

            if (capturedUnit <= 0){
                System.out.println("Cantidad no válida");
                System.out.println("Intenta de nuevo");
                isUnitCorrect = false;
            }else {
                isUnitCorrect = true;
            }
        }while (!isUnitCorrect);

        return capturedUnit;
    }

    //Ingresar Galones
    /**Descripción de la función
     * Pide a usuario ingresar la cantidad de galones a convertir a litros
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return capturedUnit --> Es el valor capturado por el usuario
     * */
    public double getGallons(){
        double capturedUnit;
        boolean isUnitCorrect;
        Scanner readGallons = new Scanner(System.in);

        do {
            System.out.println("Ingresa la cantidad de galones a convertir");
            capturedUnit = readGallons.nextDouble();

            if (capturedUnit <= 0){
                System.out.println("Cantidad no válida");
                System.out.println("Intenta de nuevo");
                isUnitCorrect = false;
            }else {
                isUnitCorrect = true;
            }
        }while (!isUnitCorrect);

        return capturedUnit;
    }

    //Ingresar Grados Fahrenheit
    /**Descripción de la función
     * Pide a usuario ingresar la cantidad de grados Fahrenheit a convertir a grados Centígrados
     * Tiene una verificación para saber que el valor ingresado no puede ser 0 o menos
     * @return capturedUnit --> Es el valor capturado por el usuario
     * */
    public double getFahrenheit(){
        double capturedUnit;
        boolean isUnitCorrect;
        Scanner readFahrenheit = new Scanner(System.in);

        do {
            System.out.println("Ingresa la cantidad de grados Fahrenheit a convertir");
            capturedUnit = readFahrenheit.nextDouble();

            if (capturedUnit <= 0){
                System.out.println("Cantidad no válida");
                System.out.println("Intenta de nuevo");
                isUnitCorrect = false;
            }else {
                isUnitCorrect = true;
            }
        }while (!isUnitCorrect);

        return capturedUnit;
    }

}
