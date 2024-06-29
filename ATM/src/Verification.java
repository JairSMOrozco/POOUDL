public class Verification {

    /**Descripcón de la función
     * Verifica que la opción elegida por usuario sea válida y pueda seguir con el programa
     * @param option --> Es la opción elegida por usuario del menú
     * @return isOptionCorrect --> Es un boolean que indica si la opción es válida o no
     * */
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
