public class State {
    //Atributos
    public String name;
    public double ticketPrice;
    public double timeTravel;
    private double totalCost;
    private String infoTravelComplete;

    /**Descripción de la función
     * Calcula en base al estado y numero de tickets elegidos el costo total del viaje
     * @param tickets --> Número de tickets que usuario comprará
     * @return infoTravelComplete --> Es el resultado de los cálculos del total de viaje
     * */
    public String calculateInfoTravel(int tickets){
        travelCost(tickets);
        infoTravelComplete = "Su destino es " + name + ", tiempo de traslado " + timeTravel + " hrs" + ", costo " + "$" + totalCost;

        return infoTravelComplete;
    }

    /**Descripción de la función
     * Hace el calculo de costo en base a los boletos solicitados y el precio por cada estado
     * @param tickets --> Es el número de tickets que el usuario ingreso
     * */
    private void travelCost(int tickets){
        totalCost = ticketPrice * tickets;
    }

}
