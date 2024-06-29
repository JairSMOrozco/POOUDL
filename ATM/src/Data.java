import java.util.Scanner;

public class Data {

    /**Descripción de la función
     * Pide a usuario ingresar una opción del menú
     * @return selectedOption --> Es la opción ingresada por usuario
     * */
    public int getOption(){
        Scanner readOption = new Scanner(System.in);

        int selectedOption = readOption.nextInt();

        return selectedOption;
    }

    /**Descripcion de la función
     * Pide el monto que se depositará a la cuenta de usuario. Pasa por una verificación para que el monto no sea 0 o menor a 0
     * y que solo se puede ingresar montos que cumplan con ser múltiplos de 100
     * @return depositeMoney --> Es el monto a depositar en la cuenta
     * */
    public double getMoneyDeposit(){
        double depositedMoney;
        boolean isAmountCorrect;
        Scanner depositMade = new Scanner(System.in);


        do {
            System.out.println("Ingresa la cantidad que quieres depositar");
            depositedMoney = depositMade.nextDouble();
            double res = depositedMoney % 100;

            if (depositedMoney <= 0 || res != 0){
                System.out.println("Cantidad no válida. Solo puedes depositar múltiplos de $100");
                isAmountCorrect = false;
            }else {
                isAmountCorrect = true;
            }
        }while (!isAmountCorrect);

        return depositedMoney;
    }

    /**Descripcion de la función
     * Pide el monto que se retirará de la cuenta de usuario. Pasa por una verificación para que el monto no sea 0 o menor a 0
     * y que solo se puede retirar montos que cumplan con ser múltiplos de 100
     * @return moneyWithdraw --> Es el monto a retirar de la cuenta
     * */
    public double getMoneyWithdraw(){
        double moneyWithdraw;
        boolean isAmountCorrect;
        Scanner withdrawMade = new Scanner(System.in);


        do {
            System.out.println("Ingresa la cantidad que quieres retirar");
            moneyWithdraw = withdrawMade.nextDouble();
            double res = moneyWithdraw % 100;

            if (moneyWithdraw <= 0 || res != 0){
                System.out.println("Cantidad no válida. Solo puedes retirar múltiplos de $100");
                isAmountCorrect = false;
            }else {
                isAmountCorrect = true;
            }
        }while (!isAmountCorrect);

        return moneyWithdraw;
    }

}
