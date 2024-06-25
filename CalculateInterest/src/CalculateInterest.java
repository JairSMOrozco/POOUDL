public class CalculateInterest {
    public static void main(String[] args) {
        double[] interestData = new double[3];
        boolean isValidate = false;
        double[] interests = new double[2];

        //Instancias
        Data capture = new Data();
        Validation validation = new Validation();
        Interests calculateInterest = new Interests();
        Pay pay = new Pay();

        do{
            interestData = capture.captureData();
            isValidate = validation.validateData(interestData);

        }while (isValidate == false);

        interests = calculateInterest.calculateInterests(interestData);

        pay.output(interests);

    }
}