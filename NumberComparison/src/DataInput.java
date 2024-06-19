import java.util.Scanner;

public class DataInput {
    //Atributos
    private int[] numbers = new int[3];

    //Métodos
    public int[] getNumbers(){
        Scanner readNumber = new Scanner(System.in);
        int i;

        for(i = 0; i < 3; i++){
            System.out.println("Ingresa el número " + (i + 1));
            numbers[i] = readNumber.nextInt();
        }

        //Array con valores capturados por usuario
        return numbers;
    }



}
