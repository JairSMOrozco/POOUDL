import java.util.Scanner;

public class Data {
    //Atributos
    private double[] interestData = new double[3];

    //Métodos

    /**Descripción de la función
     * Llama a tres métodos que recopilan la información del usuario
     * @return interestData --> Array con los valores ingresados por el usuario
     * */
    public double[] captureData(){
        getCapital();
        getInterest();
        getDays();

        return interestData;
    }

    /**Descripcón de la función
     * Pide a usuario ingresar un monto que será el capital del cúal derivaran los intereses
     * El dato se alamacena en la primera posición del array interestData[]
     * */
    private void getCapital(){
        Scanner readCapital = new Scanner(System.in);

        System.out.println("Ingresa el monto del capital");
        interestData[0] = readCapital.nextDouble();
    }

    /**Descripción de la función
     * Pide a usuario ingresar un monto que será la tasa de interes anual
     * El dato se alamacena en la segunda posición del array interestData[]
     * */
    private void getInterest(){
        Scanner readInterest = new Scanner(System.in);

        System.out.println("Ingresa la tasa de interés");
        interestData[1] = readInterest.nextDouble();
    }

    /**Descripción de la función
     * Pide a usuario ingresar un número de días el cual será la referencia para calcular los intereses
     * El dato se alamacena en la tercera posición del array interestData[]
     * */
    private void getDays() {
        Scanner readDays = new Scanner(System.in);

        System.out.println("Ingresa el número de días");
        interestData[2] = readDays.nextDouble();
    }

}
