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
            vehiclesMenu.showMenu();

            vehicle = vehiclesMenu.chooseVehicle();

            isDataCorrect = verificationVehicle.dataVerification(vehicle);

        }while(!isDataCorrect);

        total = rent.totalRentalCost(defaulVehicle, vehicle);

        output.outputCost(total);

    }
}