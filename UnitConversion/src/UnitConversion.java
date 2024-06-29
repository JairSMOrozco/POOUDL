public class UnitConversion {
    public static void main(String[] args) {
        //Atributos
        int selectedOption;
        boolean isOptionCorrect;

        double poundsCaptured;
        double poundsToKilograms;

        double milesCaptured;
        double milesToKilometers;

        double gallonsCaptured;
        double gallonsToLiters;

        double fharenheitCaptured;
        double fharenheitToCelcius;



        //Instancias
        Menu menu = new Menu();
        Data captureData = new Data();
        Verification verificationData = new Verification();
        Pound pound = new Pound();
        Mile mile = new Mile();
        Gallon gallon = new Gallon();
        Fahrenheit fahrenheit = new Fahrenheit();
        Result result = new Result();


        while(true){

            do {
                //Muestra menu
                menu.showMenu();

                //Almacena la opción elegida por el usuario
                selectedOption = captureData.getOption();

                //Verifica que la opción elegida sea válida para continuar con el programa
                isOptionCorrect = verificationData.verifyOption(selectedOption);

            }while(!isOptionCorrect);

            //Dependiendo de la opción elegida se ejecutan los cálculos
            switch (selectedOption){
                case 1:
                    poundsCaptured = captureData.getPounds();
                    poundsToKilograms = pound.convertToKilograms(poundsCaptured);
                    result.showResultConversion(selectedOption, poundsCaptured, poundsToKilograms);
                    break;
                case 2:
                    milesCaptured = captureData.getMiles();
                    milesToKilometers = mile.convertToKilometers(milesCaptured);
                    result.showResultConversion(selectedOption, milesCaptured, milesToKilometers);
                    break;
                case 3:
                    gallonsCaptured = captureData.getGallons();
                    gallonsToLiters = gallon.convertToLiters(gallonsCaptured);
                    result.showResultConversion(selectedOption, gallonsCaptured, gallonsToLiters);
                    break;
                case 4:
                    fharenheitCaptured = captureData.getFahrenheit();
                    fharenheitToCelcius = fahrenheit.convertToCelsius(fharenheitCaptured);
                    result.showResultConversion(selectedOption, fharenheitCaptured, fharenheitToCelcius);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }
        }
    }
}