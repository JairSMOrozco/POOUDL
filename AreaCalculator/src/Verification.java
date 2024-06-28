public class Verification {
    //

    //Métodos
    public boolean verifyOptionArea(char figure){
        boolean isOptionAreaCorrect;

        switch (figure){
            case 'a': isOptionAreaCorrect = true;
                break;
            case 'b': isOptionAreaCorrect = true;
                break;
            case 'c': isOptionAreaCorrect = true;
                break;
            case 'd': isOptionAreaCorrect = true;
                break;
            default:
                System.out.println("Ingresa una opción válida");
                isOptionAreaCorrect = false;
                break;
        }

        return isOptionAreaCorrect;

    }
}
