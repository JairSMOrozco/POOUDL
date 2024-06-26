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
            date = captureDate.getDate();

            isDateCorrect = validationDate.checkDate(date);
        }while (isDateCorrect == false);


        season = whatSeasonIs.setSeason(date);

        print.printSeason(season, date);

    }
}