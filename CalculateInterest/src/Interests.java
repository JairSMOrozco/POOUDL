public class Interests {
    //Atributos
    private double interesDiario;
    private double interesTotal;
    private double capitalTotal;
    private double montoPagarMensual;

    //Métodos
    /**Descripción de la función
     * Saca la tasa de interés diaria en base a la tas de interes anual proporcionada por el usuario
     * @param interest --> Tasa anual ingresada por el usuario
     * */
    private void tasaInteresDiaria(double interest){
        double interestPercent = interest / 100;
        interesDiario = interestPercent / 365;
    }

    /**Descripción de la función
     * Saca el interes acumulado en el perido de timepo especificado en base al capital
     * @param capital --> Capital inicial ingresado por el usuario
     * @param dailyInterest --> Interes diario calculado en base a la tasa anual
     * @param days --> Plazo de días proporcionado por usuario.
     * */
    private void interesAcumulado(double capital, double dailyInterest, double days){
        interesTotal = capital * dailyInterest * days;
    }

    /**Descripción de la función
     * Suma el interes acumulado y el capital inicial
     * @param capital --> Capital inicial ingresado por el usuario
     * @param accumulatedInterest --> Interes acumulado en el periodo de timepo proporcionado por usuario
     * */
    private void capitalFinal(double capital, double accumulatedInterest){
        capitalTotal = capital + accumulatedInterest;
    }

    /**Descripción de la función
     * Divide el capital final (capital inicial + interes acumulado) entre los meses que resultan del periodo de días ingresado
     * @param finalCapital --> Suma del capital inicial más los intereses generados
     * @param days --> Periodo de tiempo proporcionado por usuario
     * */
    private void montoTotalPagarMes(double finalCapital, double days){
        double months = days / 30;
        montoPagarMensual = capitalTotal / months;
    }

    /**Descripción de la función
     * Llama a las funciones que calculan interes diario, interes acumulado, capital total y monto a pagar por mes
     * @param interestData --> Array con la información proporcionada de ususario (capital, interes, dias)
     * @return interests --> Array que contiene el monto a pagar por mes y el capital total resultante
     * */
    public double[] calculateInterests(double[] interestData){

        double[] interests = new double[2];

        tasaInteresDiaria(interestData[1]);
        interesAcumulado(interestData[0], interesDiario, interestData[2]);
        capitalFinal(interestData[0], interesTotal);
        montoTotalPagarMes(capitalTotal, interestData[2]);

        interests[0] = montoPagarMensual;
        interests[1] = capitalTotal;

        return interests;
    }

}
