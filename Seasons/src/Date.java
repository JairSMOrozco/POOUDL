import java.util.Scanner;

public class Date {
    //Atributos
    private int[] captureDate = new int[3];

    //Métodos
    public int[] getDate(){
        System.out.println("Programa para mostrar a que estación pertenece una fecha");
        getDay();
        getMonth();
        getYear();

        return captureDate;
    }

    private void getDay(){
        Scanner readDay = new Scanner(System.in);

        System.out.println("Ingresa el día (dd)");
        captureDate[0] = readDay.nextInt();
    };

    private void getMonth(){
        Scanner readMonth = new Scanner(System.in);

        System.out.println("Ingresa el mes (mm)");
        captureDate[1] = readMonth.nextInt();
    };

    private void getYear(){
        Scanner readYear = new Scanner(System.in);

        System.out.println("Ingresa el año (yyyy)");
        captureDate[2] = readYear.nextInt();
    };

}
