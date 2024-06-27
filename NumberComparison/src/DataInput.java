import java.util.Scanner;

public class DataInput {
    //Atributos
    private int[] numbers = new int[3];

    //Métodos

    /**Descripción de la función
     * Obtiene 3 números capturados por el ususario los cuales se almacenan en un array
     * @return numbers --> Es el array con los números capturados.
     * */
    public int[] getNumbers(){
        Scanner readNumber = new Scanner(System.in);
        int i;

        //Ciclo for que va pidiendo números y los va almacenando en el array numbers
        for(i = 0; i < 3; i++){
            System.out.println("Ingresa el número " + (i + 1) + " de 3");
            numbers[i] = readNumber.nextInt();
        }

        //Array con valores capturados por usuario
        return numbers;
    }

}
