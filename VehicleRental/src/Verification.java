public class Verification {
    //Atributos
    private boolean isDataCorrect;

    //Métodos
    /**Descripción de la función
     * Verifica que la opción de vehiculo elegida sea válida
     * @param vehicle --> Es la opción capturada por el usuario
     * @return isDataCorrect -->
     * */
    public boolean dataVerification(int vehicle){

        if (vehicle > 0 && vehicle < 4){
            isDataCorrect = true;
        }else {
            System.out.println("Opción de vehículo no válida");
            System.out.println("Intenta de nuevo");
            isDataCorrect = false;
        }

        return isDataCorrect;
    }

}
