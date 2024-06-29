public class Rent {
    //Atributos
    private double GAS_PRICE = 21.5;
    private String rentalCost;
    private String selectedVehicle;
    private double DISTANCE = 500;


    //Metodos
    /**Descripcion de la función
     * A partir de un vehículo dado se llena un objeto(Vehicle) y usando sus propiedades se calcula el costo total de la renta
     * @param defaultVehicle --> Objeto que tiene por métodos varias operaciones para cacular costo total de renta
     * @param vehicle --> Vehiculo elegido por usuario en formato int
     * @return rentalCost --> Es el costo total de renta por vehiculo seleccionado
     * */
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


    /**Descripcion de la funcion
     * Cambia un int por un string para poder hacer la asignación de vehiculo y poder calcular el costo de la renta
     * @param vehicle --> Es la opción de vehículo ingresada por usuario
     * @return selectedVehicle --> Es el String con el valor del vehículo
     * */
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
