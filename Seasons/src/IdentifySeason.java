public class IdentifySeason {
    //Atributos
    private String season;

    //Métodos
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

        return season;
    }
}
