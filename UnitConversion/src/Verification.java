public class Verification {

    public boolean verifyOption(int option){
        boolean isOptionCorrect;

        switch (option){
            case 1,2,3,4,5: isOptionCorrect = true;
                break;
            default:
                System.out.println("Ingresa una opción válida");
                isOptionCorrect = false;
                break;
        }

        return isOptionCorrect;

    }

}
