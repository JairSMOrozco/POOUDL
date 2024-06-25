import java.util.Scanner;

public class Data {
    //Atributos
    private double[] interestData = new double[3];

    //Métodos
    private void getCapital(){
        Scanner readCapital = new Scanner(System.in);

        System.out.println("Ingresa el monto del capital");
        interestData[0] = readCapital.nextDouble();
    }

    private void getInterest(){
        Scanner readInterest = new Scanner(System.in);

        System.out.println("Ingresa la tasa de interés");
        interestData[1] = readInterest.nextDouble();
    }

    private void getDays() {
        Scanner readDays = new Scanner(System.in);

        System.out.println("Ingresa el número de días");
        interestData[2] = readDays.nextDouble();
    }

    public double[] captureData(){
        getCapital();
        getInterest();
        getDays();

        return interestData;
    }
}
