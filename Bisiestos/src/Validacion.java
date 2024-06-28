public class Validacion {

    //Métodos
    /**Descripción de la función
     * Valida que el año ingresado sea mayor a 0 y menor a 3000
     * @param yearCapture --> Año ingresado por usuario
     * @return true || false --> Solo regresa un boolean que es recibido en el main
     * */
    public static boolean validationData(int yearCapture){
        if(yearCapture > 0 && yearCapture < 3000){
            return true;
        }else {
            return false;
        }
    }

}
