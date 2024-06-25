public class Interests {
    //Atributos
    private double[] interests = new double[2];
    private double interesDiario;
    private double interesTotal;
    private double capitalTotal;
    private double montoPagarMensual;

    //Métodos
    private void tasaInteresDiaria(double interest){
        double interestPercent = interest / 100;
        interesDiario = interestPercent / 365;
    }

    private void interesAcumulado(double capital, double dailyInterest, double days){
        interesTotal = capital * dailyInterest * days;
    }

    private void capitalFinal(double capital, double accumulatedInterest){
        capitalTotal = capital + accumulatedInterest;
    }

    private void montoTotalPagarMes(double finalCapital, double days){
        double months = days / 30;
        montoPagarMensual = capitalTotal / months;
    }

    public double[] calculateInterests(double[] interestData){
        tasaInteresDiaria(interestData[1]);
        interesAcumulado(interestData[0], interesDiario, interestData[2]);
        capitalFinal(interestData[0], interesTotal);
        montoTotalPagarMes(capitalTotal, interestData[2]);

        interests[0] = montoPagarMensual;
        interests[1] = capitalTotal;

        return interests;
    }

}
