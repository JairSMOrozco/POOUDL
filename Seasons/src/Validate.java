import java.lang.runtime.SwitchBootstraps;

public class Validate {
    //Atributos
    private boolean isDateCorrect = false;
    private boolean isDayCorrect;
    private boolean isMonthCorrect;
    private boolean isYearCorrect;
    private boolean isDayMonthCorrect = true;

    //Métodos

    public boolean checkDate(int[] captureDate){
        checkDay(captureDate[0]);
        checkMonth(captureDate[1]);
        checkYear(captureDate[2]);
        checkDayMonth(captureDate[0], captureDate[1]);

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

        return isDateCorrect;
    }

    private void checkDay(int day){
        if(day < 1 || day > 31){
            isDayCorrect = false;
        }else {
            isDayCorrect = true;
        }
    }

    private void checkMonth(int month){
        if (month < 1 || month > 12){
            isMonthCorrect = false;
        }else {
            isMonthCorrect = true;
        }
    }

    private void checkYear(int year){
        if (year < 1 || year > 3000){
            isYearCorrect = false;
        }else {
            isYearCorrect = true;
        }
    }

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
