public class Rent {
    //Atributos
    private double GAS_PRICE = 21.5;
    private String rentalCost;
    private String selectedVehicle;
    private double DISTANCE = 500;


    //Metodos
    public String totalRentalCost(Vehicle defaultVehicle, int vehicle){
        selectedVehicle = vehicleAssign(vehicle);

        switch (selectedVehicle){
            case "Motocicleta":
                defaultVehicle.vehicleType = "Motocicleta";
                defaultVehicle.vehiclePerformance = 20;
                rentalCost = defaultVehicle.getTotalRentalCost(DISTANCE, GAS_PRICE);
                break;
            case "Automovil":
                defaultVehicle.vehicleType = "Automovil";
                defaultVehicle.vehiclePerformance = 12;
                rentalCost = defaultVehicle.getTotalRentalCost(DISTANCE, GAS_PRICE);
                break;
            case "Camioneta PickUp":
                defaultVehicle.vehicleType = "Camioneta PickUp";
                defaultVehicle.vehiclePerformance = 5;
                rentalCost = defaultVehicle.getTotalRentalCost(DISTANCE, GAS_PRICE);
                break;
        }

        return rentalCost;
    }

    private String vehicleAssign(int vehicle){

        String selectedVehicle = "";

        switch (vehicle){
            case 1: selectedVehicle = "Motocicleta";
                break;
            case 2: selectedVehicle = "Automovil";
                break;
            case 3: selectedVehicle = "Camioneta PickUp";
                break;
        }

        return selectedVehicle;

    }


}
