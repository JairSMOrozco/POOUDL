public class Verification {
    //Atributos
    private boolean isDataCorrect = false;
    private boolean correctHours;
    private boolean correctFee;

    //Métodos
    /** Definición de la función: Verifica que las horas ingresadas sean mayores a 0
     * @param hours --> Son las horas trabajadas*/
    private void areHoursCorrect(double hours){
        if (hours <= 0){
            correctHours = false;
        }else {
            correctHours = true;
        }
    }

    /** Definición de la función: Verifica que la tarifa ingresada que se paga por hora sea mayor a 0
     * @param fee --> Es la tarifa que se paga por hora de trabajo*/
    private void isFeeCorrect(double fee){
        if (fee <= 0){
            correctFee = false;
        }else {
            correctFee = true;
        }
    }

    /**Definición de la función: Ejecuta los métodos de verificación de hora(areHoursCorrect) y tarifa(isFeeCorrect) y determina si los datos son válidos
     * @param workData --> Es el array con los datos de horas trabajadas y tarifa de pago por hora
     * @see #areHoursCorrect(double)
     * @see #isFeeCorrect(double)
     * @return isDataCorrect --> Devuelve si los datos son correctos o no
     * */
    public boolean workDataValidation(double[] workData){
        areHoursCorrect(workData[0]);
        isFeeCorrect(workData[1]);

        if (!correctHours){
            System.out.println("Error de captura. Las horas trabajadas deben de ser mayores a 0");
        } else if (!correctFee) {
            System.out.println("Error de captura. La tarifa de pago por hora debe de ser mayor a 0");
        }else {
            isDataCorrect = true;
        }


        return isDataCorrect;
    }
}
