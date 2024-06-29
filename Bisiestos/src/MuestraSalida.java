public class MuestraSalida {

    //Métodos
    /**Descripción de la función
     * Muestra en consola el resultado de si el año es bisiesto o no
     * @param yearValue --> Año capturado por usuario
     * */
    public void showResult(boolean yearValue){
        if(yearValue == true){
            System.out.println("El año SI es bisiesto");
        }else {
            System.out.println("El año NO es bisisesto");
        }
    }

}
