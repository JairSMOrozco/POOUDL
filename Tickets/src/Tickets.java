public class Tickets {
    public static void main(String[] args) {
        char state;
        int tickets;
        boolean isDataCorrect;
        String totalCost;

        //Instancias
        Menu ticketsMenu = new Menu();
        Verification dataVerification = new Verification();
        Sale calculateTravel = new Sale();
        Output travelDetails = new Output();

        do {
            //Mostrando menú a usuario
            ticketsMenu.showMenu();

            //Guardando valores ingresados por el usuario. Destino y cantidad de boletos
            state = ticketsMenu.chooseState();
            tickets = ticketsMenu.chooseTickets();

            isDataCorrect = dataVerification.dataVerification(state, tickets);

        }while(isDataCorrect == false);

        totalCost = calculateTravel.totalCost(state, tickets);

        travelDetails.myTravelDetails(totalCost);


    }
}