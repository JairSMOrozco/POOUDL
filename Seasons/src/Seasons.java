public class Seasons {
    public static void main(String[] args) {
        //Atributos
        int[] date = new int[3];
        boolean isDateCorrect;
        String season;

        //Instancias
        Date captureDate = new Date();
        Validate validationDate = new Validate();
        IdentifySeason whatSeasonIs = new IdentifySeason();
        PrintSeason print = new PrintSeason();

        do {
            //Obtiene el día, mes y año
            date = captureDate.getDate();

            //Valida si los datos ingresados son correctos
            isDateCorrect = validationDate.checkDate(date);

        }while (!isDateCorrect);


        season = whatSeasonIs.setSeason(date);

        print.printSeason(season, date);

    }
}