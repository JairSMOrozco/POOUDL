public class Determinacion {

    //Métodos
    public static boolean calculateBi(int year){
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
