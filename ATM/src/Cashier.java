public class Cashier {
    //Atributos
    public double availableCash;

    //Métodos
    /**Descripción de la función
     * Suma la cantidad a depositar al monto actual en la cuenta
     * @param amountReceived --> Es el monto ingresado para depositar a la cuenta
     * @return availableCash --> Es la suma del monto actual en la cuenta y el monto depositado
     * */
    public double depositCash(double amountReceived){
        System.out.println("Agregando dinero a tu cuenta ...");
        availableCash = availableCash + amountReceived;

        return availableCash;
    }

    /**Descripción de la función
     * Resta la cantidad a retirar al monto actual en la cuenta
     * @param amountReceived --> Es el monto ingresado para retirar de la cuenta
     * @return availableCash --> Es la resta del monto actual en la cuenta y el monto retirado
     * */
    public double withdrawCash(double amountReceived){
        System.out.println("Retirando dinero de tu cuenta ...");
        availableCash = availableCash - amountReceived;

        return availableCash;
    }

}
