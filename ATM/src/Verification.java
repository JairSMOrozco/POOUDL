public class Verification {

    public boolean verifyOption(int option){
        boolean isOptionCorrect;

        switch (option){
            case 1: isOptionCorrect = true;
                break;
            case 2: isOptionCorrect = true;
                break;
            case 3: isOptionCorrect = true;
                break;
            default:
                System.out.println("Ingresa una opción válida");
                isOptionCorrect = false;
                break;
        }

        return isOptionCorrect;

    }

}
