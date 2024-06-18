public class Validacion {

    //Métodos
    public static boolean validationData(int yearCapture){
        if(yearCapture > 0 && yearCapture < 3000){
            return true;
        }else {
            return false;
        }
    }

}
