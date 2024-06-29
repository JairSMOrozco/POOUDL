public class Determinacion {

    //Métodos
    /**Descripción de la función
     * Hace los calculos de residuo según las reglas para saber si un año es bisiesto o no
     * @param year --> Es el año ingresado por el usuario
     * @return isBi --> Un boolean que indica si el año es bisisesto o no
     * */
    public boolean calculateBi(int year){
        int multi4, multi100, multi400;
        boolean isBi = false;

        multi4 = year % 4;
        multi100 = year % 100;
        multi400 = year % 400;

        if( (multi4 == 0) || (multi400 == 0) ){
            isBi = true;
            if(multi100 == 0){
                isBi = false;
            }
        }

        return isBi;
    }

}
