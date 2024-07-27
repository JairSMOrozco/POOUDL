public class zVerification {
    //Métodos
    /**Descripción de la función
     * Verifica que la opción elegida por usuario sea válida y pueda seguir con el programa
     * @param figure --> Es la opción elegida por usuario desde el menú principal
     * @return isOptionAreaCorrect --> Es un boolean que indica si la opción es válida o no
     * */
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
