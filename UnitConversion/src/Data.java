import java.util.Scanner;

public class Data {

    public int getOption(){
        Scanner readOption = new Scanner(System.in);

        int selectedOption = readOption.nextInt();

        return selectedOption;
    }

}
