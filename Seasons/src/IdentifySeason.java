public class IdentifySeason {
    //Atributos
    private String season;

    //Métodos
    /**Descripción de la función
     * Evalua los datos día y mes y en base a ello asigna una estación del año
     * @param captureData --> Array con los datos capturas por el usuario
     * @return season --> Es la estación del año a la que corresponden los datos ingresados
     * */
    public String setSeason(int[] captureData){
        int day = captureData[0];
        int month = captureData[1];

        if ( (month == 3 && day >= 21) || (month == 4 || month == 5) || (month == 6 && day <= 21) ){
            season = "Primavera";
        }else if( (month == 6 && day >= 22) || (month == 7 || month == 8) || (month == 9 && day <= 21) ){
            season = "Verano";
        }else if ( (month == 9 && day >= 22) || (month == 10 || month == 11) || (month == 12 && day <= 20) ){
            season = "Otoño";
        }else if ( (month == 12 && day >= 21) || (month == 1 || month == 2) || (month == 3 && day <= 20) ){
            season = "Invierno";
        }

        //Estación del año que cumple con los parámetros dados
        return season;
    }
}
