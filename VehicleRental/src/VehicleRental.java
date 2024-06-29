public class VehicleRental {
    public static void main(String[] args) {
        int vehicle;
        boolean isDataCorrect;
        String total;

        //Instancias
        Menu vehiclesMenu = new Menu();
        Verification verificationVehicle = new Verification();
        Vehicle defaulVehicle = new Vehicle();
        Rent rent = new Rent();
        Output output = new Output();


        do {
            //Muestra el menú para elegir un vehiculo
            vehiclesMenu.showMenu();

            //Almacena el vehículo elegido
            vehicle = vehiclesMenu.chooseVehicle();

            //Verifica si la opción elegida es correcta
            isDataCorrect = verificationVehicle.dataVerification(vehicle);

        }while(!isDataCorrect);

        //Almacena el costo total de la renta del vehículo elegido
        total = rent.totalRentalCost(defaulVehicle, vehicle);

        //Imprime en consola el resultado
        output.outputCost(total);

    }
}