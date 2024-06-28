public class UnitConversion {
    public static void main(String[] args) {
        //Atributos
        int selectedOption;
        boolean isOptionCorrect;


        //Instancias
        Menu menu = new Menu();
        Data captureData = new Data();
        Verification verificationData = new Verification();
        Miscellaneous options = new Miscellaneous();

        while(true){

            do {
                menu.showMenu();
                selectedOption = captureData.getOption();

                isOptionCorrect = verificationData.verifyOption(selectedOption);

            }while(!isOptionCorrect);

            options.assignOption(selectedOption);


        }

    }
}