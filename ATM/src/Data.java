import java.util.Scanner;

public class Data {

    public int getOption(){
        Scanner readOption = new Scanner(System.in);

        int selectedOption = readOption.nextInt();

        return selectedOption;
    }

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
