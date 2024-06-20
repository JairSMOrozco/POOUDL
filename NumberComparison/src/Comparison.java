import java.util.Arrays;

public class Comparison {
    //Atributos
    private int[] orderedNumbers = new int[3];

    //Métodos

    public int[] compereNumbers(int[] arrayNumbers){
        Arrays.sort(arrayNumbers);
        //System.out.println(Arrays.toString(arrayNumbers));

        orderedNumbers = arrayNumbers;
        return orderedNumbers;
    }

}
