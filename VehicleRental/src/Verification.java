public class Verification {
    //Atributos
    private boolean isDataCorrect;

    //Métodos
    public boolean dataVerification(int vehicle){
        vehicleVerification(vehicle);
        return isDataCorrect;
    }

    private void vehicleVerification(int vehicle){
        if (vehicle > 0 && vehicle < 4){
            isDataCorrect = true;
        }else {
            System.out.println("Opción de vehículo no válida");
            System.out.println("Intenta de nuevo");
            isDataCorrect = false;
        }
    }
}
