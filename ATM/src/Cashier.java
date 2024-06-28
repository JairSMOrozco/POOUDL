public class Cashier {
    //
    public double availableCash;


    //Métodos
    public double depositCash(double amountReceived){
        System.out.println("Agregando dinero a tu cuenta ...");
        availableCash = availableCash + amountReceived;

        return availableCash;
    }

    public double withdrawCash(double amountReceived){
        System.out.println("Retirando dinero de tu cuenta ...");
        availableCash = availableCash - amountReceived;

        return availableCash;
    }





}
