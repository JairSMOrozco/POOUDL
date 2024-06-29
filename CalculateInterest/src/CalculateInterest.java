public class CalculateInterest {
    public static void main(String[] args) {
        //Variables del método
        double[] interestData = new double[3];
        boolean isValidate = false;
        double[] interests = new double[2];

        //Instancias de clase
        Data capture = new Data();
        Validation validation = new Validation();
        Interests calculateInterest = new Interests();
        Pay pay = new Pay();

        do{
            //Captura de datos por parte del usuario
            interestData = capture.captureData();

            //Validación de datos
            isValidate = validation.validateData(interestData);

        }while (!isValidate);

        //Calculos según los datos proporcionados por usuario
        interests = calculateInterest.calculateInterests(interestData);

        //Entrega de resultados
        pay.output(interests);

    }
}