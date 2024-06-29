import java.lang.runtime.SwitchBootstraps;

public class Validate {
    //Atributos
    private boolean isDateCorrect = false;
    private boolean isDayCorrect;
    private boolean isMonthCorrect;
    private boolean isYearCorrect;
    private boolean isDayMonthCorrect = true;

    //Métodos

    /**Descripción de la función
     * Ejecuta los métodos que evaluan el día, el mes y el año
     * @param captureDate --> Array con los datos de usuario
     * @return isDateCorrect --> Boolean para saber si los datos son válidos.
     * */
    public boolean checkDate(int[] captureDate){
        checkDay(captureDate[0]);
        checkMonth(captureDate[1]);
        checkYear(captureDate[2]);
        checkDayMonth(captureDate[0], captureDate[1]);

        //Valida dato por dato del array
        if(!isDayCorrect){
            System.out.println("El día no es válido");
        }else if (!isMonthCorrect){
            System.out.println("El mes no es válido");
        } else if (!isYearCorrect) {
            System.out.println("El año no es válido");
        } else if (!isDayMonthCorrect) {
            System.out.println("Error en la relación día-mes");
        }else{
            isDateCorrect = true;
        }

        //Regresa si los datos son todos correctos o no
        return isDateCorrect;
    }

    /**Descripción de la función
     * Valida si el día ingresado es correcto
     * @param day --> Es el primer valor del array de datos ingresados por el usuario
     * */
    private void checkDay(int day){
        if(day < 1 || day > 31){
            isDayCorrect = false;
        }else {
            isDayCorrect = true;
        }
    }

    /**Descripción de la función
     * Valida si el mes ingresado es correcto
     * @param month --> Es el segundo valor del array de datos ingresados por el usuario
     * */
    private void checkMonth(int month){
        if (month < 1 || month > 12){
            isMonthCorrect = false;
        }else {
            isMonthCorrect = true;
        }
    }

    /**Descripción de la función
     * Valida si el año ingresado es correcto
     * @param year --> Es el segundo valor del array de datos ingresados por el usuario
     * */
    private void checkYear(int year){
        if (year < 1 || year > 3000){
            isYearCorrect = false;
        }else {
            isYearCorrect = true;
        }
    }

    /**Descripción de la función
     * Revisa la relación dia-mes para determinar si un mes tiene 29, 30 o 31 días
     * @param day --> Es el valor ingresado por usuario en la posición 0 del array
     * @param month --> Es el valor ingresado por usuario en la posición 1 del array
     * */
    public void checkDayMonth(int day, int month){

        if (month == 2 && day > 29){
            System.out.println("Febrero no puede tener más de 29 días");
            isDayMonthCorrect = false;
        }else if (month == 5 && day > 30){
            System.out.println("Abril no puede tener más de 30 días");
            isDayMonthCorrect = false;
        }else if (month == 6 && day > 30){
            System.out.println("Junio no puede tener más de 30 días");
            isDayMonthCorrect = false;
        }else if (month == 9 && day > 30){
            System.out.println("Septiembre no puede tener más de 30 días");
            isDayMonthCorrect = false;
        }else if (month == 11 && day > 30){
            System.out.println("Noviembre no puede tener más de 30 días");
            isDayMonthCorrect = false;
        }else{
            isDayMonthCorrect = true;
        }

    }

}
