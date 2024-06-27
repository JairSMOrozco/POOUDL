public class State {
    public String name;
    public double ticketPrice;
    public double timeTravel;
    private double totalCost;
    private String infoTravelComplete;

    public String calculateInfoTravel(int tickets){
        travelCost(tickets);
        infoTravelComplete = "Su destino es " + name + ", tiempo de traslado " + timeTravel + " hrs" + ", costo " + "$" + totalCost;

        return infoTravelComplete;
    }

    private void travelCost(int tickets){
        totalCost = ticketPrice * tickets;
    }

}
