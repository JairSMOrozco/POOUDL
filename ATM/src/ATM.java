public class ATM {
    public static void main(String[] args) {
        //Atributos
        int selectedOption;
        boolean isOptionCorrect;
        double totalBalance = 1000;
        double moneyDeposit;
        double moneyAfterDeposit;
        double moneyWithdraw;
        double moneyAfterWithdraw;


        //Instancias
        Menu menu = new Menu();
        Data captureData = new Data();
        Verification verificationData = new Verification();
        Cashier withdraw = new Cashier();
        Cashier deposit = new Cashier();
        Balance balance = new Balance();

        while (true){

            do {
                menu.showMenu();
                selectedOption = captureData.getOption();

                isOptionCorrect = verificationData.verifyOption(selectedOption);

            }while(!isOptionCorrect);

            switch (selectedOption){
                case 1:
                    moneyDeposit = captureData.getMoneyDeposit();
                    deposit.availableCash = totalBalance;
                    moneyAfterDeposit = deposit.depositCash(moneyDeposit);
                    totalBalance = moneyAfterDeposit;
                    break;
                case 2:
                    do{
                        moneyWithdraw = captureData.getMoneyWithdraw();
                        withdraw.availableCash = totalBalance;

                        if (moneyWithdraw > totalBalance){
                            System.out.println("Saldo insuficiente");
                        }

                    }while(moneyWithdraw > totalBalance);

                    moneyAfterWithdraw = withdraw.withdrawCash(moneyWithdraw);
                    totalBalance = moneyAfterWithdraw;
                    break;
                case 3:
                    balance.showBalance(totalBalance);
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
            }

        }

    }
}