import java.util.Scanner;

public class Data {
    //Atributos
    /** workData es el array en donde los valores de las horas y la tarifa serán almacenadas*/
    private double[] workData = new double[2];

    //Métodos
    /**getWorkData ejecuta @getHours y @getFee
     * @see #getHours()
     * @see #getFee()
     * @return workData --> Array con los datos capturados [horas, tarifa]
     * */
    public double[] getWorkData(){
        getHours();
        getFee();

        return workData;
    }

    /**
     * getHours pide a usuario ingrese las horas trabajadas y las alamacena en la primera posición
     * del array workData
     * */
    private void getHours(){
        Scanner readHours = new Scanner(System.in);

        System.out.println("Coloca las horas trabajadas por el colaborador");
        workData[0] = readHours.nextDouble();
    }

    /**
     * getFee pide a usuario ingrese la tarifa que se paga por hora a los colaboradores.
     * El dato es almacenado en la segunda posición del array workData.
     * */
    private void getFee(){
        Scanner readFee = new Scanner(System.in);

        System.out.println("Ingresa la tarifa de pago por hora");
        workData[1] = readFee.nextDouble();
    }

}
